import java.lang.*;
import java.util.*;

class Exception_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength=0;
        int index=0;

        System.out.println("Enter length of an array: ");
        iLength=sobj.nextInt();

        int Arr[]=new int[iLength];

        System.out.println("Enter elements in an array: ");

        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        System.out.println("Enter index in an array: ");
        index=sobj.nextInt();

        try
        {
            System.out.println("Element at given index in an array is: " + Arr[index]);
        }

        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Exception occured is : " + obj);
        }

        finally
        {
            sobj.close();
        }

    }
}