// app8_5, 圓形類別CCircle之field於記憶體內的配置關係
class CCircle           // 定義類別CCircle
{
    double pi=3.14;      // 將資料成員設定初值
    double radius;

    void show_area()     // show_area() method, 顯示出圓面積
    {
        System.out.print("pi="+pi);
        System.out.println(", area="+pi*radius*radius);
    }
}
public class app8_2
{
    public static void main(String args[])
    {
        CCircle [] cir1=new CCircle[10];      // 建立cir1物件
       for (int i=0 ; i<10 ; i++){
cir1[i]=new CCircle();
cir1[i].radius=i+1;
    }
        for (int i=0 ; i<10 ; i++){
           cir1[i].show_area();
        }
    }
}

/* app8_5 OUTPUT---
pi=3.14, area=12.56
pi=3.0, area=12.0
-----------------*/