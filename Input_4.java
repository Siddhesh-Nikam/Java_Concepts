import java.lang.*;
import java.io.*;

class Input_4
{
    public static void main(String arg[]) 
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        try
        {
            System.out.println("Enter name: ");
            String name = bobj.readLine();
    
            System.out.println("Enter integer: ");
            int age = Integer.parseInt(bobj.readLine());
    
            System.out.println("Enter float: ");
            float f = Float.parseFloat(bobj.readLine());
    
            System.out.println("Enter double: ");
            double d = Double.parseDouble(bobj.readLine());

            System.out.println("Entered name is: " + name);
            System.out.println("Entered integer is: " + age);
            System.out.println("Entered float is: " + f);
            System.out.println("Entered double is: " + d);
        }

        catch(IOException obj)
        {
            System.out.println(obj);
        }
    }
}