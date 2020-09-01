class h1Circle           // 定義類別CCircle
{
   int radius;

    void show_area()     // show_area() method, 顯示出圓面積
    {
        System.out.print("radius="+radius);

    }
}
public class app9_h1
{
    public static void main(String args[])
    {
        h1Circle [] cir1=new h1Circle[101];      // 建立cir1物件
        for (int i=0 ; i<101 ; i++){
            if (i%2==0){
                cir1[i]=new h1Circle();
                cir1[i].radius=i+1;
                System.out.println(",green");
            }
            else {
                cir1[i]=new h1Circle();
                cir1[i].radius=i+1;
                System.out.println(",red");
            }
                cir1[i].show_area();
        }

    }
}