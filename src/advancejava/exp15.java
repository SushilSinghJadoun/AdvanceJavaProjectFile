package advancejava;
import java.net.*;
public class exp15 
{
    public static void main(String []args)
    {
        try
        {
            String str="http://www.google.com/main?string#inbox";
            URL ur=new URL(str);
            System.out.println("Protocol="+ur.getProtocol());
            System.out.println("Host="+ur.getHost());
            System.out.println("Default Port="+ur.getDefaultPort());
            System.out.println("Path="+ur.getPath());
            System.out.println("File="+ur.getFile());
            System.out.println("Reference="+ur.getRef());
        }catch(MalformedURLException e){
            System.out.println(e);
        }
    }
}
