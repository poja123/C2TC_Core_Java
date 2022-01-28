class Mythread1 extends Thread // class name extends Thread class
{
    @Override     //overriding the method
    public void run()
    {
        while(true)
        {
        System.out.println("My thread1 is executing");
        }
    }
}
class Mythread2 extends Thread
{
    @Override   
    public void run()       
    {
        while(true)
        {
        System.out.println("Mythread2 is executing");
        }

    }
}


public class ExtendingThreadClass
{
    public static void main(String[] args)
    {
        Mythread1 t1 = new Mythread1();   //creating obj for thread
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
       
        
    }
}