// app8_1, 建立物件與field的存取
class CRectangle        // 定義CRectangle類別
{
    int a;           // 宣告資料成員width
    int b;             // 宣告資料成員height
}

public class app8_1
{
    public static void main(String args[])
    {
        CRectangle rect1;
        rect1=new CRectangle(); // 建立新的物件

        rect1.a=5;      // 設定矩形rect1的寬
        rect1.b=3;     // 設定矩形rect1的高


        System.out.println("a="+rect1.a);    // 印出rect1.width
        System.out.println("b="+rect1.b);    // 印出rect1.width
        System.out.println("c="+rect1.a*rect1.b);    // 印出rect1.width


    }
}

/* app8_1 OUTPUT---
width=20
height=15
-----------------*/