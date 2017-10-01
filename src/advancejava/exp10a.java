package advancejava;
import java.util.Scanner;
class areacalculator 
{
    void area()
    {
        int r=5;
        System.out.println("Area of circle with no argument : "+3.14*r*r);
    }
    void area(int r)
    {
        System.out.println("Area of circle : "+3.14*r*r);
    }
    void area(int a,int b)
    {
        System.out.println("Area of rectangle : "+(a*b));
    }
    void area(float a,float b)
    {
        System.out.println("Area of rectangle : "+(a*b));
    }
}
public class exp10a
{
    public static void main(String []args)
    {
        areacalculator sushil=new areacalculator();
        Scanner data=new Scanner(System.in);
        System.out.print("Enter two desired no : ");
        int a=data.nextInt();
        int b=data.nextInt();
        sushil.area();
        sushil.area(a);
        sushil.area(a,b);
        sushil.area(1.3f,39f);
    }
}