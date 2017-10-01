package advancejava;
import java.util.Scanner;
public class exp3 
{
    int myno, cubeno,secondno=0;
    String str;
    exp3 nocube(exp3 obj)
    {
        obj.cubeno = obj.myno*obj.myno*obj.myno;
        return obj;
    }
    exp3 greatereverse(exp3 obj)
    {
        int temp=obj.cubeno;
        
        while(temp>0)
        {
            secondno=secondno*10+(temp%10);
            temp/=10;
        }
        if(obj.cubeno>secondno)
            obj.str = "the greater number is :" + obj.cubeno;
        else
            obj.str= "the greater number is :" + secondno;
        return obj;
    }
    public static void main(String []args)
    {
        exp3 obj=new exp3();
	System.out.print("Enter the desired no : ");
        Scanner data=new Scanner(System.in);
        obj.myno=data.nextInt();
        exp3 obj1 = obj.nocube(obj);
        exp3 obj2 =obj.greatereverse(obj);
        System.out.println("the cube is as :"+obj1.cubeno);
        System.out.println(obj2.str+"("+obj1.cubeno+" or "+obj.secondno+")");
    }
}