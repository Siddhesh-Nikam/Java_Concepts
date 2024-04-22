import java.lang.*;
import java.util.*;

class Accepting_Input_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name:");
        String str = sobj.nextLine();

        System.out.println("Enter your age:");
        int iRollNo = sobj.nextInt();

        System.out.println("Enter your percentage:");
        float fPercentage = sobj.nextFloat();

        System.out.println("Entered name is: "+str);
        System.out.println("Entered age is: "+iRollNo);
        System.out.println("Entered percentage is: "+fPercentage);

        sobj.close();
    }
}