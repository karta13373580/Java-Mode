// app18_7, 以KeyListener介面處理KeyEvent事件
import java.awt.*;
import java.awt.event.*;
public class Main2 extends Frame implements KeyListener,ActionListener
{
    static Main2 frm=new Main2();
    static TextField txf=new TextField(20);
    static TextArea txa=new TextArea("",10,30,TextArea.SCROLLBARS_NONE);
    static  Button btn1=new Button("106021367");

    static Button  [] btn_Array = new Button[100];

    static private int keycount =0;
    public static void main(String args[])
    {
        frm.setSize(200,150);
        frm.setTitle("Key Event");
        frm.setLayout(new GridLayout(10,10));
        txf.addKeyListener(frm);      // 將frm設為txf的傾聽者
        txa.setEditable(false);       // 將txa設為不可編輯
        frm.add(txf);
        frm.add(txa);

        frm.setVisible(true);
    }
    // 當txf物件觸發KeyEvent事件時，依事件種類執行下列的程式碼
    public void keyPressed(KeyEvent e)  // 當按鍵按下時
    {
        txa.setText("");           // 清空txa裡的文字
        txa.append("keyPressed() called\n");
    }
    public void keyReleased(KeyEvent e) // 當按鍵放開時
    {
        txa.append("keyReleased() called\n");
    }
    public void keyTyped(KeyEvent e) // 鍵入文字時
    {
        txa.append("keyTyped() called\n");
        keycount++;
        btn_Array[keycount]=new Button(Integer.toString(keycount));
        int R =(int)(Math.random()*255+1);
        int G =(int)(Math.random()*255+1);
        int B =(int)(Math.random()*255+1);
        Color Random_Color =new Color(R,G,B);
        btn_Array[keycount].setBackground(Random_Color);
        btn_Array[keycount].addActionListener(frm);
        frm.add(btn_Array[keycount]);
        frm.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        Button btn=(Button) e.getSource();     // 取得事件來源的物件
        for (int i= 0;i<keycount;i++){
            if (btn==btn_Array[i]){
                btn_Array[i].setBackground(Color.white);
                btn_Array[i].setLabel("106021367");
            }
        }
    }
}
