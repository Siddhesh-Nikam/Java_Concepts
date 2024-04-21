
//Demonstration of final characteristics concept

import java.lang.*;

class Demo
{
    public int i;
    public final int j=20;
    public final int k;

    public Demo()
    {
        this.i=10;
        this.k=30;
    }

    public Demo(int a,int k)
    {
        this.i=a;
        this.k=k;
    }

    public void fun()
    {
        i++;
        //j++;
        //k++;
    }
}

class final_1
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo();

        dobj.fun();

        System.out.println(dobj.i);
        System.out.println(dobj.j);
        System.out.println(dobj.k);

        //////////////////////////////////////

        Demo dobj1 = new Demo();

        dobj1.fun();

        System.out.println(dobj1.i);
        System.out.println(dobj1.j);
        System.out.println(dobj1.k);

    }
}