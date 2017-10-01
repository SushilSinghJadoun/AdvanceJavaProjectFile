package advancejava;
import java.io.*;
import java.util.*;
public class exp8 
{   
    public static void main(String []args)
    {
        Scanner data=new Scanner(System.in);
        System.out.print("Enter two desired no. to division:");
        int A=data.nextInt();
        int B=data.nextInt();
        int[] myarray=new int[5];
        System.out.print("Enter five desired no. to store in an array : ");
        for(int i=0;i<5;i++)
            myarray[i]=data.nextInt();
        try
        {
            float C=A/B;
            System.out.print("After dividing,result is "+C);
            System.out.print("\nEnter the location of item in array to retrive :");
            int D=data.nextInt();
            System.out.println("The item is : "+myarray[D-1]);
            File file=new File("D:\\Important document\\file.txt");
            FileReader fr=new FileReader(file);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Warning : Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Warning : Array index out of bounds");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Warning : File not found");
        }   
    }   
}