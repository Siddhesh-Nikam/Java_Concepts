import java.lang.*;
import java.io.*;

class Input_2
{
    public static void main(String arg[]) 
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        try
        {
            System.out.println("Enter name: ");
            String name = bobj.readLine();
            System.out.println("Your name is : " + name);

            System.out.println("Enter age: ");
            int age = Integer.parseInt(bobj.readLine());
            System.out.println("Your name is : " + age);
        }

        catch(IOException obj)
        {
            System.out.println(obj);
        }
        
        finally
        {
            iobj=null;
            bobj=null;
        }

    }
}

