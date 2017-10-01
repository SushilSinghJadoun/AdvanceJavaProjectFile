package advancejava;
import java.util.Scanner;
public class exp1 
{
    public static void main(String []args)
    {
        System.out.print("Enter desired odd no :");
        Scanner data=new Scanner(System.in);
        int i,j,k,midline,lineno=data.nextInt();
        if(lineno%2==0)
        {   System.out.print("No is not an odd no"); return; }
        midline=lineno/2+1;
        for(i=1;i<=midline;i++)
        {
            for(k=midline-i;k>0;--k)
                System.out.print("  ");
            for(k=1;k<=i;++k)
                System.out.print(k+" ");
            for(k=i-1;k>=1;--k)
                System.out.print(k+" ");
            System.out.print("\n");
        }    
        for(j=midline+1;j<=lineno;++j)
        {
            for(k=1;k<=j-midline;++k)
                System.out.print("  ");
            for(k=1;k<=lineno-j+1;++k)
                System.out.print(k+" ");
            for(k=lineno-j;k>=1;--k)
                System.out.print(k+" ");
            System.out.print("\n");
        }
    }
}