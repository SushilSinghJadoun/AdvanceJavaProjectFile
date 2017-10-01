package advancejava;
import java.util.Scanner;
public class exp2 
{
    int height, width, depth;
    exp2(){}
    exp2(int height, int width, int depth)
    {
        this.height = height;
        this.width = width;
        this. depth = depth;
    }
    int boxvolume()
    {
        int volume=height*width*depth;
        return volume;
    }
    public static void main(String []args)
    {
        Scanner data=new Scanner(System.in);
        System.out.print("Enter the desired sides : ");
        exp2 b=new exp2(data.nextInt(),data.nextInt(),data.nextInt());
        System.out.println("Volume is :"+b.boxvolume());       
    }
}