import java.lang.*;
import java.io.*;

class Input_1
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter name: ");
        String name = bobj.readLine();

        System.out.println("Your name is : " + name);
    }
}

