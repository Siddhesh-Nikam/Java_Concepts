import java.lang.*;
import java.util.*;

class Demo
{
    public int Division(int iNo1,int iNo2) throws ArithmeticException
    {
        return iNo1/iNo2;
    }
}

class Exception_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number:");
        int iNo1=sobj.nextInt();

        System.out.println("Enter second number:");
        int iNo2=sobj.nextInt();

        Demo dobj = new Demo();

        try
        {
            int iRet = dobj.Division(iNo1, iNo2);
            System.out.println("Division is: " + iRet);
        }

        catch(ArithmeticException aobj)
        {
            System.out.println(aobj);
        }

        
    }
}