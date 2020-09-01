import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int h1 = scn.nextInt();
        int m1 = scn.nextInt();
        int h2 = scn.nextInt();
        int m2 = scn.nextInt();
        int a1 = (h2 * 60 - h1 * 60) + m2 - m1;
        if(a1<=120){
            int a2=(a1/30);
            System.out.println(a2*30);

        }else if(a1>120&&a1<=240){

            int a2=((a1-120)/30);
            System.out.println((a2*40)+120);

        }else if(a1>240){

            int a2=((a1-240)/30);
            System.out.println((a2*60)+280);
        }
    }
}


