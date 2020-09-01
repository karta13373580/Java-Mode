import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a;
        boolean cha=false;
        while(scn.hasNext())
        {
            cha=false;
            a=scn.nextInt();
            for(int i=2;i<a;i++)
            {
                if(a%i==0)
                {cha=true;System.out.println("非質數");break;}
            }
            if(cha==false)
            {
                System.out.println("質數");
            }
        }
    }
}