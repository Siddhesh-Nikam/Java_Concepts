import java.lang.*;

class Marvellous extends Thread
{       
    public void run()   //State running
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class Multithreading_4
{
    public static void main(String arg[])
    {
        Marvellous mobj1 = new Marvellous();
        Thread t1 = new Thread(mobj1,"First");

        Marvellous mobj2 = new Marvellous();
        Thread t2 = new Thread(mobj2,"Second");
        
        t1.start();     //State runnable
        t2.start();

        //State Dead

    }
}