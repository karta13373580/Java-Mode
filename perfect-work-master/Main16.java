import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a,sum=0;
        a = scn.nextInt();
        for(int i=0;i<=a;i=i+3){
            sum=sum+i;
        }

        System.out.println(sum);
    }
}