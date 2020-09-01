/**
 * @(#)PubMedParsedData_Extract_4.java
 *
 * PubMedParsedData_Extract_4 application
 *
 * jdwang@asia.edu.tw
 * @version 1.00 2015/10/28
 */

import java.util.HashMap;
import java.io.*;

public class Main3 {

    public static void main(String[] args) throws IOException  {

        String str;
        int count=0;
        //FileReader fr=new FileReader("D:\\JavaProgramming\\19901_Parsed_10.txt");
        FileReader fr=new FileReader("c:\\java\\2013-02_Parsed.txt");
        BufferedReader bfr=new BufferedReader(fr);

        // 寫出所有字的出現次數到檔案=>"D:\\JavaProgramming\\19901_Parsed_10_WordCnt.txt"
        FileWriter fw=new FileWriter("c:\\java\\2013-02_Parsed_WordCnt.txt");
        BufferedWriter bfw=new BufferedWriter(fw);
        // 參考 HashMap的應用及資料排序 http://www.ewdna.com/2008/11/hashmap.html

        // 紀錄每個字的出現次數
        HashMap WordCnt = new HashMap <String, Integer>();

        while((str=bfr.readLine())!=null)   // 每次讀取一行，直到檔案結束
        {
            count++;                   // 計算讀取的行數
            //System.out.println(str);

            // 1876090##1991-1-11##The role of cocaine use in the HIV transmission among IVDUs: 1987 and 1988 cohort study.##
            // 用"##"分割字串
            String[] Items = new String(str.toLowerCase()).trim().split("##");
            //
            //System.out.println(count+"=>"+"Items[0]="+Items[0]+",Items[1]="+Items[1]+",Items[1]="+Items[2]);

            if (Items.length >= 3) {
                // 用(空白)"\\s+"分割出每個單字
                String[] Items_Word = new String(Items[2]).trim().split("\\s+");

                for (int i=0;i<Items_Word.length;++i) {
                    //System.out.print(Items_Word[i]+"<*>");

                    // 判?map是否存在指定map? http://www.howsoftworks.net/javaapi/java.util/hashmap_containskey.html
                    if (WordCnt.containsKey(Items_Word[i])){
                        // 如果已經存在=>已知數目+1
                        // http://lolikitty.pixnet.net/blog/post/109319721-java-%E4%B8%AD-hashmap-%E5%88%97%E5%8D%B0(%E5%8F%96%E5%BE%97)%E5%85%A8%E9%83%A8-key-%E8%88%87-value-%E8%B3%87%E6%96%99
                        int temp = (int) WordCnt.get(Items_Word[i]);
                        temp++;
                        WordCnt.put(Items_Word[i],temp);
                    }
                    else {
                        // 如果不存在=>初始數目=1
                        WordCnt.put(Items_Word[i],1);
                    }
                } // End of for (int i=0;i<Items_Word.length;++i)
                //System.out.println();
            } // End of if (Items.length >= 3)
            else {
                System.out.println(count+" Error format line=>"+str);

            }
        } // End of while((str=bfr.readLine())!=null)
        fr.close();                   // 關閉檔案
        System.out.println(count+" lines read");

        for (Object key : WordCnt.keySet()) {
            System.out.println(key + " : " + WordCnt.get(key));
            bfw.write(key + "\t" + WordCnt.get(key));  // 寫入亂數到緩衝區
            bfw.newLine(); // 寫入換行符號
        }
        bfw.flush();      // 將緩衝區內的資料寫到檔案裡
        fw.close();       // 關閉檔案

    } // End of public static void main(String[] args)
} // End of public class PubMedParsedData_Extract_4}