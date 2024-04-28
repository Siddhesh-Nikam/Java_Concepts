import java.io.*;

class String_1
{
    public static void main(String arg[])
    {
        //String Literal
        String str1 = "Hello";
        String str2 = "World";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.length());
        System.out.println(str1.length());

        String str3 = str1 + " " +  str2;
        System.out.println(str3);

        //String objects

        String str4 = new String("Marvellous");
        String str5 = new String("Infosystems");

        String str6 = str4 + " " + str5;

        System.out.println(str6);
    }
}



