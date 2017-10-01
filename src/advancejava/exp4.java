package advancejava;
import java.util.*;
public class exp4{
   static int maxSize,top;
   static long[] stackArray;
   public exp4(int s){
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   public void push(long j){
       stackArray[++top] = j;           
   }
   public long pop(){
       return stackArray[top--];
   }
   public static void main(String[] args){
       System.out.print("Enter the max size of the stack : ");
       Scanner data=new Scanner(System.in);
       int stackSize=data.nextInt();
       exp4 theStack = new exp4(stackSize); 
       int ch,no,i;
       while(true){
           System.out.print("\n1.push  2.pop  3.display  4.exit\nYour Selection : ");
           ch=data.nextInt();
           switch(ch){
                case 1:
                    if(top<maxSize-1){
                       System.out.print("Enter the no : ");
                       no=data.nextInt();
                       theStack.push(no);
                    }
                    else
                       System.out.println("Stack overflow");
                    break;
                case 2:
                    if(top<0)
                        System.out.print("Stack underflow");
                    else
                        theStack.pop();
                    break;
                case 3:
                    System.out.print("The item of Stack are: ");
                    for(i=0;i<=top;i++)
                        System.out.print(stackArray[i]+"   ");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}