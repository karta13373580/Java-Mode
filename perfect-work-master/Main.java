import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DecimalFormat format = new DecimalFormat("##.0");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (b==1){
            double c = (a-80)*0.7;
            System.out.println(format.format(c));
        }
        if (b==2){
            double d = (a-70)*0.6;
            System.out.println(format.format(d));
        }
    }
}
