package advancejava;
import java.util.Scanner;
public class exp6{
    public static void main(String []args){
        Scanner data=new Scanner(System.in);
        System.out.print("Enter desired Text.\n");
        String texttotest=data.nextLine();
        String newstring=""; int flag=1;
        for(int i=0;i<texttotest.length();i++){
            for(int j=0;j<newstring.length();j++){
                Character  t1=texttotest.charAt(i),t2=newstring.charAt(j);
                int res=t1.compareTo(t2);
                if(res==0){
                    flag=0; break;
                }else
                    flag=1;
            }if(flag==1)
                newstring+=texttotest.charAt(i);
        }for(int j=0;j<newstring.length();j++)
            System.out.print(newstring.charAt(j)+",");
    }
}