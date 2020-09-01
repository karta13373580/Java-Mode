// app8_3, method的建立
class ACRectangle
{
    int length=1;
    int width=2;
    int height=3;
    void volume()           // 定義成員函數area(), 用來計算面積
    {
        System.out.println(width*height*length);
    }

    void surfacearea()
    {
        System.out.println( 2*(length*width+length*height+width*height));
    }
    void showdata()
    {
        System.out.println("length"+length);
        System.out.println("width"+width);
        System.out.println("height"+height);
    }
    void showall()
    {

        System.out.println(width*height*length);
        System.out.println( 2*(length*width+length*height+width*height));
        System.out.println("length"+length);
        System.out.println("width"+width);
        System.out.println("height"+height);
    }
}

public class app8_5
{
    public static void main(String args[])
    {
        ACRectangle rect1;
        rect1=new ACRectangle();       // 建立新的物件

        rect1.volume();
        rect1.surfacearea();
        rect1.showdata();
        rect1.showall();
    }
}

/* app8_3 OUTPUT---
area=300
perimeter=70
-----------------*/