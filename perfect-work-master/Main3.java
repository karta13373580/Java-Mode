import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int a=(int)ch;
            if(a>=48 && a<=57){
                a = a+n;
                a=a>57?a-10:a;
            }else if(a>=65&&a<=90){
                a=a+n;
                a=a>90?a-26:a;
            }else if(a>=97&&a<=122){
                a= a+n;
                a=a>122?a-26:a;
            }
            System.out.print((char)a);
        }
        System.out.println();
    }
}