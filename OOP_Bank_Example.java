
import java.lang.*;

abstract class RBI
{
    public int Balance;

    public RBI()
    {
        this.Balance=0;
    }

    public void Credit(int Amount)
    {
        this.Balance=this.Balance+Amount;
    }

    public void Debit(int Amount)
    {
        this.Balance=this.Balance-Amount;
    }

    public abstract int CalculateInterest();
}

class SBI extends RBI
{
    public int AmountNumber;
    public int IFSC;

    public int CalculateInterest()
    {
        return 6;
    }
}

class PNB extends RBI
{
    public int AmountNumber;
    public int IFSC;

    public int CalculateInterest()
    {
        return 7;
    }
}

class OOP_Bank_Example
{
    public static void main(String arg[])
    {
        SBI sobj = new SBI();
        PNB pobj = new PNB();

        pobj.Credit(1000);
        pobj.Debit(500);

        System.out.println(pobj.Balance);

    }
}