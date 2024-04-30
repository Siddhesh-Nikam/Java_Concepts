import java.lang.*;

class Marvellous implements Runnable
{       
    public void run()   //State running
    {
        System.out.println("Inside thread : " + Thread.currentThread().getName());
    }
}

class Multithreading_3
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