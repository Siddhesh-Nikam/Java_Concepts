import java.lang.*;

class Multithreading_1
{
    public static void main(String arg[])
    {
        System.out.println("Inside main");

        Thread tobj = Thread.currentThread();

        System.out.println("Name of thread is: " + tobj.getName());
    }
}