// app20_1, 簡單的繪圖
import java.awt.*;
import java.awt.event.*;
public class app20_1_4 extends Frame implements ItemListener
{
    static app20_1_4 frm=new app20_1_4();
    static  List lst=new List();


    public static void main(String args[])
    {
        frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,25));
        frm.setTitle("Drawing example");
        frm.setSize(1000,1000);
        lst.addItemListener(frm);
        frm.setVisible(true);
        lst.add("100");               // 加入選項到lst內
        lst.add("200");
        lst.add("300");
          // 設定frm為lst的傾聽者
        frm.add(lst);
    }
    public void itemStateChanged(ItemEvent e)    // 事件處理的程式碼
    {
        Graphics g = getGraphics();
        String abc = lst.getSelectedItem();
        if (abc == "100") {             // 如果選項名稱為yellow
            g.setColor(Color.black);
            g.drawLine(300, 300, 300, 0);
            g.drawLine(300, 300, 600, 300);
        }
        if (abc == "200") {
            g.setColor(Color.orange);
            g.drawLine(300, 300, 300, 0);
            g.drawLine(300, 300, 600, 300);
            for (int i = 0; i <= 300; i = i + 50) {
                g.drawLine(300, 0 + i, 300 + i, 300);
            }
        }
        if (abc == "300") {
            g.setColor(Color.pink);
            for (int i = 0; i <= 300; i = i + 50) {
                g.drawLine(300, 0 + i, 300 + i, 300);
            }
            for (int i = 0; i <= 300; i = i + 50) {
                g.drawLine(300, 0+i , 300-i , 300);
            }
            for (int i = 0; i <= 300; i = i + 50) {
                g.drawLine(0+i, 300 , 300 , 300+i);
            }
            for (int i = 0; i <= 300; i = i + 50) {
                g.drawLine(300+i, 300, 300 , 600-i);
            }
        }
    }
}

