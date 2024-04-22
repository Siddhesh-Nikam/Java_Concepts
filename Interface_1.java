
import java.lang.*;

interface Circle
{
    float PI=3.14f;

    float CalculateArea(float Radius);

    float CalculateCircumference(float Radius);
    
}

class Area implements Circle
{
    public float CalculateArea(float Radius)
    {
        return (PI*Radius*Radius);
    }

    public float CalculateCircumference(float Radius)
    {
        return (2*PI*Radius);
    }
}

class Interface_1
{
    public static void main(String arg[])
    {
        System.out.println("Value of PI is:" + Circle.PI);

        Area aobj = new Area();

        float fRet=0.0f;

        fRet=aobj.CalculateArea(10.5f);
        System.out.println("Area is:" + fRet);

        fRet=aobj.CalculateCircumference(10.5f);
        System.out.println("Circumference is:" + fRet);

    }
}











