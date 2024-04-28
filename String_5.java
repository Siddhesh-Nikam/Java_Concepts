import java.io.*;

class String_5
{
    public static void main(String a[])
    {
        String str1 = "Hello";          // 100
        String str2 = "Hello";          // 100
        
        String str3 = new String("Hello"); // 200

        if(str1 == str3)    // if(100 == 200)   //Compares the hashcodes
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are differnt");
        }

        if(str1.equals(str3))    // if("Hello".equals("Hello"))     Compares te data
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are differnt");
        }
    }
}