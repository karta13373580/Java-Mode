import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = scn.nextInt();
        int v4 = scn.nextInt();
        if (v1 == v2 && v1 == v3 && v1 == v4) {
            System.out.println("win");
        } else if (v1 == v2 && v1 == v3) {
            System.out.println("R");
        } else if (v1 == v3 && v1 == v4) {
            System.out.println("R");
        } else if (v2 == v3 && v2 == v4) {
            System.out.println("R");
        }
        else if (v1!=v2&&v1!=v3&&v1!=v4&&v2!=v3&&v1!=v4&&v3!=v4){
            System.out.println("R");
        }
        else {
            System.out.println(Math.max(Math.max(v1,v2),v3)*2);
        }
    }
}

