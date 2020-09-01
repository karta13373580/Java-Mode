import java.util.*;
public class Main2
{
    public static void main(String args[])
    {
        LinkedList<Integer> llist=new LinkedList<Integer>();

        Random ran =new Random();
        int a =0;
        for (int i=0;i<=9;i++){
            llist.add(ran.nextInt(100)+1);
        }
        for (int i=0;i<llist.size();i++){
          System.out.println(llist.get(i)+" ");
           a=a+llist.get(i);
        }
        System.out.println();

        ListIterator<Integer> litr2=llist.listIterator(llist.size());
        System.out.print("反向列出LinkedList內容:");
        while(litr2.hasPrevious())				// 反向走訪元素
            System.out.print(litr2.previous()+" ");	// 印出元素內容
        System.out.println();
        System.out.println("總和"+a);
    }
}