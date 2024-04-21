
//Demonstration of final behaviour concept

import java.lang.*;

class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }

    public final void gun()
    {
        System.out.println("Base gun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");
    }

    // public void gun()
    // {
    //     System.out.println("Derived gun");
    // }

    //Cannot override the final method from Base
}

class final_2
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();

        dobj.fun();

        dobj.gun();
    }
}