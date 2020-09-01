
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        float a[] = new float[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextFloat();
        }
        float max = a[0];
        float min = a[0];
        DecimalFormat format = new DecimalFormat("0.00");
        for (int i = 0; i < 10; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("max="+format.format(max));
        System.out.println("min="+format.format(min));
    }
}
