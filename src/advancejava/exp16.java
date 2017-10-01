package advancejava;
import java.net.*;
public class exp16{
    public static void main(String []args){
        try{
            InetAddress add=InetAddress.getLocalHost();
            String name=add.getHostName();
            System.out.println("Name of local host "+name);
            String add1=add.getHostAddress();
            System.out.println("IP address of ocal host "+add1);
            InetAddress address=InetAddress.getByName("www.google.com");
            System.out.println("Address : "+address);
            InetAddress add2[]=InetAddress.getAllByName("www.sun.com");
            for(int i=0;i<add2.length;i++){
                System.out.println("All IP Address : "+add2[i]);
            }               
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}