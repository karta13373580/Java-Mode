import java.util.*;
import java.lang.*;

public class MOD3_7 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i < arr.length;i++) {
            for(int j = 0;j < arr.length;j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        if(arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2])
        {
            System.out.println("True");

        }
        else if(arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2])
        {
            System.out.println("True");

        }
        else if(arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2])
        {
            System.out.println("True");

        }

        else if(arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0])
        {
            System.out.println("True");

        }
        else if(arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1])
        {
            System.out.println("True");

        }
        else if(arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2])
        {
            System.out.println("True");

        }


        else if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2])
        {
            System.out.println("True");

        }
        else if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0])
        {
            System.out.println("True");

        }
        else
        {
            System.out.println("False");
        }
    }
}
