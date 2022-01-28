class MythreadRunnable1 implements Runnable
{
    public void run()
    {
        while(true)
        {
        System.out.println("Im a thread not a threat");
        }
    }
}

class MythreadRunnable2 implements Runnable
{
    public void run()
    {
        while(true)
        {
        System.out.println("Im a thread 2 not a threat 2");
        }
    }
}

public class RunnableThread 
{
     public static void main(String[] args) 
    {
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread tm1 =new Thread(bullet1);
        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread tm2 = new Thread(bullet2);
        
        tm1.start();
        tm2.start();
    }
    
}
