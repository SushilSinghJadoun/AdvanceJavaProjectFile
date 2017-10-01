package advancejava;
import java.util.Scanner;
class NoMatchException extends Exception
{
    NoMatchException(String s)
    {
        super(s);
    }
}
public class exp9 
{
    static void validate(String instring)throws NoMatchException
    {
        boolean equals = instring.equals("INDIA");
        if(equals==false)
            throw new NoMatchException("String not equal to INDIA");
        else
            System.out.println("Valid String");
    }
    public static void main(String []args)
    {
        Scanner data=new Scanner(System.in);   
        try{
           validate(data.next()); 
        }
        catch(Exception ex){
            System.out.println("Exception occured: "+ex);
        }
    }
}