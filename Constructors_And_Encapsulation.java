
//Constructors and encapsulation concepts

import java.lang.*;

class Demo
{
    public int i;
    public int j;

    public Demo()
    {
        this.i=0;
        this.j=0;
    }

    public Demo(int a,int b)
    {
        this.i=a;
        this.j=b;
    }

    void fun()
    {
        System.out.println("Inside fun");
    }

    void gun()
    {
        System.out.println("Inside gun");
    }

}

class Constructors_And_Encapsulation
{
    public static void main(String arg[])
    {
        System.out.println("Inside main");

        Demo dobj = new Demo();

        dobj.fun();
        dobj.gun();

        System.out.println(dobj.i);
        System.out.println(dobj.j);

        Demo dobjX = new Demo();

        dobjX.fun();
        dobjX.gun();

        System.out.println(dobjX.i);
        System.out.println(dobjX.j);

    }
}

