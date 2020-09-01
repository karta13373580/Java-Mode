import java.util.Scanner;

public class MOD3_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a[] = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(max + "\n" + min);
    }
}