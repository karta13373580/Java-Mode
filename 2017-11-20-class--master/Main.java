import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner  scn = new Scanner(System.in);
        char ch = ' ';
        String str = scn.nextLine(),str1 =" ";
        int a = scn.nextInt();
        int b= str.length();
        for (int i = 0 ; i<b ; i++ ){
        ch=(char)((int)str.charAt(i)+a);
        str1 = str1+Character.toString(ch);
        }
        System.out.println(str1);
        }
        }
