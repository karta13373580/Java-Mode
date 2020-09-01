
/**
 * @(#)PubMedParsedData_Extract_4_ToLowerCase_SortByValue.java
 *
 * PubMedParsedData_Extract_4 application
 *
 * jdwang@asia.edu.tw
 * @version 1.00 2015/10/28
 */

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.io.*;
class PatternsFileToMap {

    public static HashMap <String, Integer> FileToMap (String FileLocation ) throws IOException {
        // TODO Auto-generated method stub
        //String FileLocation = "E:\\Workspace\\PatternFileToSet_jdwang\\src\\common-english-words.txt";
        FileReader fr = new FileReader(FileLocation);
        BufferedReader bfr = new BufferedReader(fr);

        HashMap <String, Integer> PatternsMap = new HashMap <String, Integer>();

        String str;

        while ((str=bfr.readLine()) != null){
            //System.out.println(str);
            str.trim();
            String [] Patterns = str.split(",");
            for (String OnePattern : Patterns ) {
                //System.out.println(OnePattern);
                PatternsMap.put(OnePattern, 0);
            }
        } // End of while
        //System.out.println(PatternsMap);
        bfr.close();
        fr.close();
        return PatternsMap;
    }
}


public class Main {

    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map)
    {
        Comparator<K> valueComparator = new Comparator<K>()
        {
            public int compare(K k1, K k2) {
                // http://www.javapractices.com/topic/TopicAction.do?Id=10
                //int compare =  map.get(k1).compareTo(map.get(k2));
                int compare =  map.get(k2).compareTo(map.get(k1));
                if (compare == 0)
                    return 1;
                else
                    return compare;
            }
        };

        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);

        //putAll: http://tw.gitbook.net/java/util/hashmap_putall.html
        sortedByValues.putAll(map);

        return sortedByValues;
    }

    public static void main(String[] args) throws IOException  {

        String str;
        int count=0;
        //FileReader fr=new FileReader("D:\\JavaProgramming\\19901_Parsed_10.txt");
        FileReader fr=new FileReader("c:\\java\\2013-02_Parsed.txt");
        BufferedReader bfr=new BufferedReader(fr);

        // 寫出所有字的出現次數到檔案=>"D:\\JavaProgramming\\19901_Parsed_10_WordCnt.txt"
        //FileWriter fw=new FileWriter("E:\\Workspace\\PubMed_Parsed\\2013-02_Parsed_WordCnt.txt");
        FileWriter fw=new FileWriter("c:\\java\\2013-02_Parsed_WordCnt_NoStopwords.txt");

        BufferedWriter bfw=new BufferedWriter(fw);
        // 參考 HashMap的應用及資料排序 http://www.ewdna.com/2008/11/hashmap.html

        String StopwordsFileLocation = "c:\\java\\common-english-words.txt";

        HashMap Stopwords = new HashMap <String, Integer>();
        Stopwords = PatternsFileToMap.FileToMap(StopwordsFileLocation);

        //System.out.println(Stopwords);

        // 紀錄每個字的出現次數
        HashMap WordCnt = new HashMap <String, Integer>();

        while((str=bfr.readLine())!=null)   // 每次讀取一行，直到檔案結束
        {
            count++;                   // 計算讀取的行數
            //System.out.println(str);
            // 1876090##1991-1-11##The role of cocaine use in the HIV transmission among IVDUs: 1987 and 1988 cohort study.##
            // 用"##"分割字串
            String[] Items = new String(str).trim().split("##");
            //
            //System.out.println(count+"=>"+"Items[0]="+Items[0]+",Items[1]="+Items[1]+",Items[1]="+Items[2]);

            if (Items.length >= 3) {
                // 用(空白)"\\s+"分割出每個單字
                String[] Items_Word = new String(Items[2]).trim().split("\\s+");

                for (int i=0;i<Items_Word.length;++i) {
                    //System.out.print(Items_Word[i]+"<*>");
                    String OneWordLower = Items_Word[i].toLowerCase();
                    if (!(Stopwords.containsKey(OneWordLower))) { // 假如不是Stopwords

                        // 判?map是否存在指定map? http://www.howsoftworks.net/javaapi/java.util/hashmap_containskey.html
                        if (WordCnt.containsKey(OneWordLower)){
                            // 如果已經存在=>已知數目+1
                            // http://lolikitty.pixnet.net/blog/post/109319721-java-%E4%B8%AD-hashmap-%E5%88%97%E5%8D%B0(%E5%8F%96%E5%BE%97)%E5%85%A8%E9%83%A8-key-%E8%88%87-value-%E8%B3%87%E6%96%99
                            int temp = (int) WordCnt.get(OneWordLower);
                            temp++;
                            WordCnt.put(OneWordLower,temp);
                        }
                        else {
                            // 如果不存在=>初始數目=1
                            WordCnt.put(OneWordLower,1);
                        }

                    } // End of if (Stopwords.containsKey(OneWordLower))
                } // End of for (int i=0;i<Items_Word.length;++i)
                //System.out.println();
            } // End of if (Items.length >= 3)
            else {
                System.out.println(count+" Error format line=>"+str);
            }
        } // End of while((str=bfr.readLine())!=null)
        fr.close();                   // 關閉檔案
        System.out.println(count+" lines read");

        // Calling the method sortByvalues
        //Map sortedMap = TreeMap_SortByValue.sortByValues(WordCnt);
        Map sortedMap = sortByValues(WordCnt);

        // Get a set of the entries on the sorted map
        Set set = sortedMap.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());

            bfw.write(me.getKey() + "\t" + me.getValue());  // 寫入亂數到緩衝區
            bfw.newLine(); // 寫入換行符號
        }
        bfw.flush();      // 將緩衝區內的資料寫到檔案裡
        fw.close();       // 關閉檔案


	   /*
	   for (Object key : WordCnt.keySet()) {
            System.out.println(key + " : " + WordCnt.get(key));
            bfw.write(key + "\t" + WordCnt.get(key));  // 寫入亂數到緩衝區
         	bfw.newLine(); // 寫入換行符號
       }
       bfw.flush();      // 將緩衝區內的資料寫到檔案裡
       fw.close();       // 關閉檔案
		*/
    } // End of public static void main(String[] args)
} // End of public class PubMedParsedData_Extract_4