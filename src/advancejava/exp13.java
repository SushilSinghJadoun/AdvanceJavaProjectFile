package advancejava;
class newThread extends Thread
{
    newThread()
    {
        super("Demo Thread");
        System.out.println("Child Thread : "+this);
        start();
    }
    @Override
    public void run()
    {
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println("Child Thead :"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException ex){
            System.out.println("Child Thread Interrupted.");
        }System.out.println("Exiting child thread.");
    }
}
public class exp13
{
    public static void main(String []args)
    {
        new newThread();
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println("Main Thread : "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException ex){
            System.out.println("Main Thread Interrupted.");
        }System.out.println("Main Thread Exiting.");
    }
}