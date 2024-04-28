import java.lang.*;
import java.util.*;

class Exception_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo1=0;
        int iNo2=0;
        int iAns=0;

        System.out.println("Enter first number:");
        iNo1=sobj.nextInt();

        System.out.println("Enter first number:");
        iNo2=sobj.nextInt();

        iAns=iNo1/iNo2;

        System.out.println("Division is: " + iAns);

    }
}