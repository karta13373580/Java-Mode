import java.util.Scanner;

public class Main17 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int a = scn.nextInt() ;
        for(int i =0 ; i < a ; i++) {
            for(int j = 0 ; j <a ; j++ ) {
                if (i >= j)
                    System.out.print("*");
            }
            System.out.println(" ");
    }
 }
}
