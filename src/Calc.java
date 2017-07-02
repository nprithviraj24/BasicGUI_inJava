//import java.awt.*;
////import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import javax.swing.*;
//
//
//public class Calc  {
//    JInternalFrame frame;
//    
//    Calc(){
//        frame.setSize(400,600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
//        frame.setVisible(true);
//    }
//    public void addObjects(){
//        JTextField jtf = new JTextField();
//        ArrayList<JButton> btn = new ArrayList<JButton>();
////        JTextField jtf = new JTextField();
//    for(int i=0; i<20; i++){
//        btn.add(new JButton(i+""));
//        frame.add(btn.get(i));
//    }
//    
//    }
//    public static void main(String[] args){
////        System.out.println("hello.");
//      Calc obj = new Calc();
////      obj.createJF();
//        obj.addObjects();
//    
//    }
//}
//
//
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class Calc extends Applet implements ActionListener
{
    JPanel frame = new JPanel();
    private static final long serialVersionUID = 1L;
    String msg=" ";
    int v1,v2,result;
    TextField t1;
    Button b[]=new Button[10];
    Button add,sub,mul,log,div,EQ,clear;
    char OP;

    public void init(){
        Color k=new Color(120,89,90);
        setBackground(k);

        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(100,200);
        t1=new TextField(10);

GridLayout gl=new GridLayout(3,1);

setLayout(gl);

for(int i=0;i<10;i++)
{
b[i]=new Button(""+i);
}
add=new Button("add");
sub=new Button("sub");
mul=new Button("mul");
div=new Button("div");
clear=new Button("clear");
log=new Button("log");

EQ=new Button("EQ");
t1.addActionListener(this);
add(t1);
for(int i=0;i<10;i++)
{
frame.add(b[i]);
}
add(frame);
add(add);
add(sub);
add(mul);
add(div);
add(EQ);
add(clear);
add(log);

for(int i=0;i<10;i++)
{
b[i].addActionListener(this);
}
add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
EQ.addActionListener(this);
clear.addActionListener(this);
log.addActionListener(this);
}
    
    
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
char ch=str.charAt(0);

if ( Character.isDigit(ch))
    t1.setText(t1.getText()+str);

else if(str.equals("add")){
    v1=Integer.parseInt(t1.getText());
    OP='+';
    t1.setText("");
}
else if(str.equals("sub")){
    v1=Integer.parseInt(t1.getText());
    OP='-';
    t1.setText("");
}
else if(str.equals("mul")){
    v1=Integer.parseInt(t1.getText());
    OP='*';
    t1.setText("");
} else if(str.equals("div")){
    
    v1=Integer.parseInt(t1.getText());
    OP='/';
    t1.setText("");
}else if(str.equals("clear")){
    t1.setText("");
}else if(str.equals("log")){
    System.out.println("entered log");
   double val =  Math.log(Double.parseDouble(t1.getText()));
    t1.setText(String.valueOf(val));
}
try {
if(str.equals("EQ"))
{
v2=Integer.parseInt(t1.getText());
if(OP=='+')
result=v1+v2;
else if(OP=='-')
result=v1-v2;
else if(OP=='*')
result=v1*v2;
else if(OP=='/')
result=v1/v2;
t1.setText(""+result);
}
}catch(Exception e)
{
String str1="ARTH EXCEPTION";
JOptionPane.showMessageDialog(null,""+str1 );
}
} } 