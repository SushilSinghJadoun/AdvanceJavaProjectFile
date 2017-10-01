package advancejava;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
public class exp24{
  public static void main(String[] args){
      exp24 exp24 = new exp24();
  }
  public exp24(){
    JFrame frame = new JFrame("Creating JTable Component by sushil");
    JPanel panel = new JPanel();
    String data[][] = {{"sushil","B.Tech","A"},{"prabal","B.Tech","B"},
     {"saksham","B.Tech","C"},{"nikhilnagar","B.Tech","D"}};
      String col[] = {"Name","Course","Grade"};
    JTable table = new JTable(data,col);
    panel.add(table,BorderLayout.CENTER);
    frame.add(panel);
    frame.setSize(300,200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}