import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        String sr = "質數";
        for (int i = 2; i < a ; i++) {
            if (a%i==0){
                sr = "非質數";
            }
        }
        System.out.println(sr);
    }
}
