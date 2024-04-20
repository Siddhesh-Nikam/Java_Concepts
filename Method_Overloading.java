import java.lang.*;

class Arithmatic
{
    public int Addition(int i,int j)
    {
        return i+j;
    }


    public int Addition(int i,int j,int k)
    {
        return i+j+k;
    }


    public int Addition(int i,int j,int k,int l)
    {
        return i+j+k+l;
    }
}

class Method_Overloading
{
    public static void main(String arg[])
    {
        Arithmatic aobj = new Arithmatic();
        int iRet=0;

        iRet=aobj.Addition(10,11);
        System.out.println(iRet);

        iRet=aobj.Addition(10,11,12);
        System.out.println(iRet);

        iRet=aobj.Addition(10,11,12,13);
        System.out.println(iRet);
    }
}