package advancejava;
import java.awt.event.*;
import java.awt.*;
public class exp14 implements ActionListener
{
    Frame f=new Frame();
    Label l1=new Label("First Number");
    Label l2=new Label("Second Number");
    Label l3=new Label("Result");
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    Button b1=new Button("Add");
    Button b2=new Button("Sub");
    Button b3=new Button("Mul");
    Button b4=new Button("Div");
    Button b5=new Button("Cancel");
    exp14()
    {
        l1.setBounds(50,50,100,20);    f.add(l1);
        l2.setBounds(50,90,100,20);    f.add(l2);
        l3.setBounds(50,130,100,20);    f.add(l3);
        t1.setBounds(200,50,100,20);   f.add(t1);
        t2.setBounds(200,90,100,20);   f.add(t2);
        t3.setBounds(200,130,100,20);   f.add(t3);
        b1.setBounds(50,170,50,20);     f.add(b1);
        b2.setBounds(110,170,50,20);    f.add(b2);
        b3.setBounds(170,170,50,20);    f.add(b3);
        b4.setBounds(230,170,50,20);    f.add(b4);
        b5.setBounds(290,170,50,20);    f.add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,350);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        if(e.getSource()==b1)
            t3.setText(String.valueOf(n1+n2));
        if(e.getSource()==b2)
            t3.setText(String.valueOf(n1-n2));
        if(e.getSource()==b3)
            t3.setText(String.valueOf(n1*n2));
        if(e.getSource()==b4)
            t3.setText(String.valueOf(n1/n2));
        if(e.getSource()==b5)
            System.exit(0);
    }
    public static void main(String []args)
    {
            exp14 sushil = new exp14();
    }
}