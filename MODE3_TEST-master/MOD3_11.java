import java.util.Scanner;
public class MOD3_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        System.out.println(fun(k));
    }
    public static int fun(int n){
        if (n == 1 || n == 0){
            return n+1;
        }else {
            return fun(n-1)+fun(n/2);
        }
    }
}