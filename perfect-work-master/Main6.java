import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int a =scn.nextInt();
        int sum =0;
        String b= "";
        if (a<0){
            sum=128+a;
        }
        else{
            sum=a;
        }
        while (sum>1){
            b = Integer.toString(sum%2)+b;
            sum =sum/2;
        }
        b=Integer.toString(sum)+b;
        int x =7-b.length();
        for (int i=0;i<x;i++){
            b="0"+b;
        }
        if (a<0){
            b="1"+b;
        }
        else {
            b="0"+b;
        }
        System.out.println(b);
    }
}
