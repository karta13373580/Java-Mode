import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        // write your code here
        Scanner  scn = new Scanner(System.in);
        int nn = scn.nextInt();
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int a3 = scn.nextInt();
        int v1 = a1*15+a2*20+a3*30;
        int r = nn-v1;
        int d50 = r/50;
        r= r%50;
        int d5 =r/5;
        r = r/5;
        System.out.println(r);
        System.out.println(d5);
        System.out.println(d50);

    }
}
