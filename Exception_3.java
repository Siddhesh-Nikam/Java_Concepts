import java.lang.*;
import java.util.*;

class Exception_3
{
    public static void main(String arg[])
    {
        int Arr[]={10,20,30,40,50};

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter index: ");
        int index = sobj.nextInt();

        System.out.println("Value at respective index is: " + Arr[index]);

    }
}