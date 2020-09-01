import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        switch (x){
            case 1:
                if (y >= 1 && y <= 20)
                    System.out.println("摩羯座");
                if (y >= 21 && y <=18)
                    System.out.println("水瓶座");
                break;
            case 2 :
                if (y >= 1 && y <= 18)
                    System.out.println("水瓶座");
                if (y >= 19 && y <=30)
                    System.out.println("雙魚座");
                break;
            case 3 :
                if (y >= 1 && y <= 20)
                    System.out.println("雙魚座");
                if (y >= 21 && y <=31)
                    System.out.println("牡羊座");
                break;
            case 4 :
                if (y >= 1 && y <= 20)
                    System.out.println("牡羊座");
                if (y >= 21 && y <=30)
                    System.out.println("金牛座");
                break;
            case 5 :
                if (y >= 1 && y <= 21)
                    System.out.println("金牛座");
                if (y >= 22 && y <=31)
                    System.out.println("雙子座");
                break;
            case 6 :
                if (y >= 1 && y <= 21)
                    System.out.println("雙子座");
                if (y >= 22 && y <=30)
                    System.out.println("巨蟹座");
                break;
            case 7 :
                if (y >= 1 && y <= 22)
                    System.out.println("巨蟹座");
                if (y >= 23 && y <=31)
                    System.out.println("獅子座");
                break;
            case 8 :
                if (y >= 1 && y <= 23)
                    System.out.println("獅子座");
                if (y >= 24 && y <=31)
                    System.out.println("處女座");
                break;
            case 9 :
                if (y >= 1 && y <= 23)
                    System.out.println("處女座");
                if (y >= 24 && y <=30)
                    System.out.println("天秤座");
                break;
            case 10 :
                if (y >= 1 && y <= 23)
                    System.out.println("天秤座");
                if (y >= 24 && y <=31)
                    System.out.println("天蠍座");
                break;
            case 11 :
                if (y >= 1 && y <= 22)
                    System.out.println("天蠍座");
                if (y >= 23 && y <=30)
                    System.out.println("射手座");
                break;
            case 12 :
                if (y >= 1 && y <= 21)
                    System.out.println("射手座");
                if (y >= 22 && y <=31)
                    System.out.println("魔羯座");
                break;





        }


       }
     }