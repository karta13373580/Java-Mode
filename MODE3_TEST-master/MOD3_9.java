import java.util.Scanner;

public class MOD3_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(GCD(a,b));
    }
    public static int GCD(int m,int n){
        if (n== 0){
            return m;
        }else{
            return GCD(n,m%n);
        }
    }
}
