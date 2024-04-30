import java.lang.*;

class Marvellous extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Value of i : " + i);

            try
            {
                Thread.sleep(2000);
            }   

            catch(Exception obj){}
            
        }
    }
}

class Multithreading_6
{
    public static void main(String arg[])
    {
        Marvellous mobj1 = new Marvellous();
        Thread t1 = new Thread(mobj1,"First");

        Marvellous mobj2 = new Marvellous();
        Thread t2 = new Thread(mobj2,"Second");

        t1.start(); //Runnable state

        try
        {
            t1.join();
        }
        catch(Exception eobj){}

        t2.start(); //Runnable state


    }
}