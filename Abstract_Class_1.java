
import java.lang.*;

abstract class Arithmatic
{
    public int i;
    public int j;

    public void fun()   //Concrete
    {
        System.out.println("Inside fun");
    }

    public abstract void gun(); //Abstract
}


class Arithmatic1 extends Arithmatic
{
    public int x;
    public int y;

    public void run()   //Concrete
    {
        System.out.println("Inside run");
    }

    public void gun()   //Concrete
    {
        System.out.println("Inside derived gun");
    }
}



class Abstract_Class_1
{
    public static void main(String arg[])
    {
        Arithmatic1 aobj1 = new Arithmatic1();

        aobj1.fun();
        aobj1.run();
        aobj1.gun();
    }
}