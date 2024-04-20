import java.lang.*;

class Base
{
    public int i;
    public int j;

    public Base(int a,int b)
    {
        //System.out.println("Super call");
        this.i=a;
        this.j=b;
    }

    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base
{
    public int x;
    public int y;

    public Derived()
    {
        super(11,21);
        System.out.println("Inside derived constructor");
        this.x=30;
        this.y=40;
    }

    public void sun()
    {
        System.out.println("Inside derived sun");
        System.out.println(super.i);
        super.fun();
    }
}

class Super_keyword
{
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        
        Derived dobj = new Derived();

        dobj.sun();
    }
}