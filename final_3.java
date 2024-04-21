
//Demonstration of final class concept


import java.lang.*;

final class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
}

class Derived
{
    public Base bobj = new Base();

    public void gun()
    {
        System.out.println("Derived gun");
    }
}

class final_3
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();

        dobj.bobj.fun();
        dobj.gun();

    }
}