package advancejava;
import java.util.*;
public class exp12 
{
    int[] price=new int[5];
    String[] name=new String[5];
    Scanner data=new Scanner(System.in);
    String selectitem;
    int selectprice,selectquantity,totalprice;
    public void items()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the "+(i+1)+"th product name :");
            name[i]=data.next();
        }
    }
    public void prices()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the "+(i+1)+"th product price :");
            price[i]=data.nextInt();
        }
    }
    public void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Product Name\tProduct Price");
            System.out.println(name[i]+"\t\t"+price[i]);
        }
    }
    public void choice()
    {
        System.out.print("Enter the desire product name to buy : ");
        selectitem=data.next();
        for(int i=0;i<5;i++)
        {
            if(selectitem.equals(name[i]))
            {
                System.out.println("You select product : "+name[i]);
                selectprice=price[i];
                break;
            }
        }
    }
    void totalprice()
    {
        System.out.print("Enter the desire quantity : ");
        selectquantity=data.nextInt();
        totalprice=selectquantity*selectprice;
        System.out.println("Total price to pay : "+totalprice);
    }
    public static void main(String []args)
    {
        exp12 sushil=new exp12();
        sushil.items();
        sushil.prices();
        sushil.display();
        sushil.choice();
        sushil.totalprice();
    }
}