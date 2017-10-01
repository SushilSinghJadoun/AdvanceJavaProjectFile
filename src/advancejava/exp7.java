package advancejava;
import java.util.Arrays;
import java.util.Scanner;
public class exp7
{
    public static void main(String []args)
    {
        Scanner data=new Scanner(System.in);
        System.out.print("Enter desired string :");
        String instring=data.next();
        StringBuilder mystring1=new StringBuilder();
        mystring1.append(instring);
        mystring1=mystring1.reverse();
        System.out.print("String in reverse :");
        for(int i=0;i<mystring1.length();i++)
            System.out.print(mystring1.charAt(i));
        Character[] chars=new Character[instring.length()];
        for(int i=0;i<chars.length;i++)
            chars[i]=instring.charAt(i);
        Arrays.sort(chars, (Character c1, Character c2) -> {
            int cmp=Character.compare(
                    Character.toLowerCase(c1.charValue()),
                    Character.toLowerCase(c2.charValue())
            );
            if(cmp!=0)
                return cmp;
            return Character.compare(c1, c2);
        });
        StringBuilder mystring2=new StringBuilder(chars.length);
        for(char c:chars)
            mystring2.append(c);
        System.out.print("\nString in alphabatic order :");
        for(int i=0;i<mystring1.length();i++)
            System.out.print(mystring2.charAt(i));
        System.out.print("\n");

    }
}