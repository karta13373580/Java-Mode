// app10_6, method的「改寫」範例
class Caaa              // 父類別CCircle
{
    protected  int num1;
    protected  int num2;


}

class  C_106021367 extends Caaa    // 子類別CCoin
{

    public C_106021367(int r,int s)
    {
       num1=r;
       num2=s;
    }
    public void show()         // 子類別裡的show() method
    {
        System.out.println("num1="+num1+", num2="+num2);
    }
}

public class app10_hw1
{
    public static void main(String args[])
    {
        C_106021367 bb=new  C_106021367(5,10);
        bb.show();         // 呼叫show() method
    }
}

/* app10_6 OUTPUT------
radius=2.0, value=5
---------------------*/