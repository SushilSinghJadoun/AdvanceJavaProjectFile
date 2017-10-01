package advancejava;
import java.applet.*;
import java.awt.*;
public class exp11 extends Applet
{
    TextField t1,t2;
    @Override
    public void init()
    {
        t1=new TextField(10);
        t2=new TextField(10);
        add(t1);
        add(t2);
        t1.setText("0");
        t2.setText("0");
    }
    @Override
    public void paint(Graphics g)
    {
        int a,b;
        g.setColor(Color.red);
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        int c=a+b;
        String s=Integer.toString(c);
        g.drawString("The sum is"+s,10,50);
    }
    @Override
    public boolean action(Event e,Object o)
    {
        repaint();
        return true;
    }
}
