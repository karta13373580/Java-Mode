import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a= scn.nextInt();
        if (a<=120){
            System.out.println(a*2.10);
            System.out.println(a*2.10);
        }
        else{
            if (a>=331 && a<=500){
                System.out.println(120*2.10+210*3.02+(a-330)*4.39);
                System.out.println(120*2.10+210*2.68+(a-330)*3.61);
            }
            else {
                if (a>=501 && a<=700){
                    System.out.println(120*2.10+210*3.02+170*4.39+(a-500)*4.97);
                    System.out.println(120*2.10+210*2.68+170*3.61+(a-500)*4.01);
                }
                else {
                    if(a>=701){
                        System.out.println(120*2.10+210*3.02+170*4.39+200*4.97+(a-700)*5.63);
                        System.out.println(120*2.10+210*2.68+170*3.61+200*4.01+(a-700)*4.50);
                    }
                }
            }
        }
    }
}