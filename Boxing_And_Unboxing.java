import java.lang.*;

class Boxing_And_Unboxing
{
    public static void main(String arg[])
    {
        int iNo=11;
        Integer iobj = new Integer(21);

        Integer iobj2 = iNo;    //Boxing

        int i=iobj;             //Unboxing

        System.out.println(iNo);
        System.out.println(iobj);
        System.out.println(iobj2);
        System.out.println(i);
    }
}