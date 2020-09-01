import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // write your code here
        Scanner  scn = new Scanner(System.in);
        String str = scn.nextLine();
        int a= str.length(),sum=0;
        for (int i =0;i<a;i++){
            sum = sum+(str.charAt(i)-'0');
        }
        System.out.println(sum);
    }
}