// app10_6, method的「改寫」範例
class DCircle              // 父類別CCircle
{
    protected static double pi=3.14;
    protected double radius;

    public DCircle(double r)
    {
        radius=r;
    }
    public void show()         // 父類別裡的show() method
    {
        System.out.println("radius="+radius);
    }
}

class DCoin extends DCircle   // 子類別CCoin
{
    private int value;

    public DCoin(double r,int v)
    {
        super(r);
        value=v;
    }
    public void show()         // 子類別裡的show() method
    {
        System.out.println("radius="+radius+", value="+value);
    }
}

public class app10_6
{
    public static void main(String args[])
    {
        DCoin coin=new DCoin(2.0,5);
        coin.show();         // 呼叫show() method
    }
}

/* app10_6 OUTPUT------
radius=2.0, value=5
---------------------*/