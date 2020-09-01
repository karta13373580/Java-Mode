import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        if (x*x+y*y<=100*100){
            System.out.println("inside");
        }
        else {
            System.out.println("outside");
        }
    }
}