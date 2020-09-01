import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        int sum = 0;
        char[]ch_array = a.toCharArray();
        for (int i = 0 ; i < ch_array.length ; i++){
            int c = ch_array[i]-'0' ;
            sum+= c ;
        }
        System.out.println(sum);
    }
}