import java.lang.*;

class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside base constructor");
        this.i=0;
        this.j=0;
    }

    public void fun()
    {
        System.out.println("Inside base fun");
    }

    public void fun(int x)
    {
        System.out.println("Inside base fun with integer argument");
    }

    public void gun()
    {
        System.out.println("Inside base gun");
    }

    public void mun()
    {
        System.out.println("Inside base mun");
    }
}

class Derived extends Base
{
    public int x;
    public int y;

    public Derived()
    {
        System.out.println("Inside derived constructor");
        this.x=0;
        this.y=0;
    }

    public void sun()
    {
        System.out.println("Inside derived sun");
    }

    public void mun()
    {
        System.out.println("Inside derived mun");
    }
}

class Inheritance_1
{
    static
    {
        System.out.println("Inside static block");
    }

    public static void main(String arg[])
    {
        System.out.println("Inside main");

        Derived dobj = new Derived();

        dobj.fun();
        dobj.fun(11);
        dobj.gun();
        dobj.sun();
        dobj.mun();
    }

}



