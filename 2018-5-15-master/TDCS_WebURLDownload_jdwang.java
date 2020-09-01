// jdwang@asia.edu.tw 2017.2.28
// jdwang@asia.edu.tw 2017.9.18 Revised
// jdwang@asia.edu.tw 2017.10.20 Download Directory
// Jing-Doo Wang

import java.io.*;
import java.net.*;
import java.util.*;

public class TDCS_WebURLDownload_jdwang
{
    public static void main(String[] args) throws Exception
    {
        //  TDCS_M06A_20161120_230000.csv //
        // "http://tisvcloud.freeway.gov.tw/history/TDCS/M06A/20161120/23/TDCS_M06A_20161120_230000.csv"

        // Specify the destination directory for output download
        String BaseDir = "c://TDCS_WebURLDownload_jdwang//";

        String BaseURL = "http://tisvcloud.freeway.gov.tw/history/TDCS/M06A";
        String BaseType = "TDCS_M06A";
        String BaseTail = "0000.csv";


        int Year = 2018;
        int Month= 5;

        int DayStart = 8;
        int DayEnd = 8;

        int HourStart = 0;
        int HourEnd = 23;

        String MonthStr;
        String DayStr;

        //for (int Month =9; Month <=9;++Month){

        if (Month < 10)
        {
            MonthStr = "0"+Integer.toString(Month);
        } else {
            MonthStr = Integer.toString(Month);
        }
        String Target_YearMonth = Integer.toString(Year)+MonthStr;

        String OutputDir = BaseDir+"\\"+Target_YearMonth;
        File f0 = null;
        File f1 = null;
        boolean bool0 = false;
        boolean bool1 = false;
        try{
            // returns pathnames for files and directory
            f0 = new File(BaseDir);
            bool0 = f0.mkdir();
            System.out.println(bool0+" Directory created? "+BaseDir);

            f1 = new File(OutputDir);
            bool1 = f1.mkdir();
            System.out.println(bool1+" Directory created? "+OutputDir);

        }catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }

        for (int Day=DayStart;Day <=DayEnd;++Day) {
            if (Day < 10)
            {
                DayStr = "0"+Integer.toString(Day);
            } else {
                DayStr = Integer.toString(Day);
            }
            String TagetURL;
            String TempStr;
            String HourStr;

            for (int Hour=HourStart; Hour<=HourEnd; ++Hour)
            {
                if (Hour < 10)
                {
                    HourStr = "0"+Integer.toString(Hour);
                } else {
                    HourStr = Integer.toString(Hour);
                }
                String Target_Date = Integer.toString(Year)+MonthStr+DayStr;

                TempStr = HourStr+"/"+BaseType+"_"+Target_Date;
                TagetURL = BaseURL+"/"+Target_Date+"/"+TempStr+"_"+HourStr+BaseTail;

                System.out.println(TagetURL);

                URL url = new URL(TagetURL);


                DataInputStream in = new DataInputStream(url.openStream());

                String TargetFileLocation = OutputDir+"/"+BaseType+"_"+Target_Date+"_"+HourStr+BaseTail;

                System.out.println(TargetFileLocation);
                //System.exit(0);

                RandomAccessFile out = new RandomAccessFile(TargetFileLocation, "rw");
                try
                {
                    System.out.println("Download " + TargetFileLocation);
                    byte data;

                    while(true)
                    {
                        data = (byte)in.readByte();
                        out.writeByte(data);
                    }
                }
                catch(EOFException e) { }

                in.close();
                out.close();
            }  // End of for (int Hour=0; Hour<=23; ++Hour)
        } // End of Day
        //} // End of Month
        System.out.println(" Finish!");
        // End of public static void main(String[] args) throws Exception
    }
} // End of public class WebURLDownload_jdwang

