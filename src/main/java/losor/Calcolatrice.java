package losor;

public class Calcolatrice
{
    private int a, b;

    public Calcolatrice()
    {
        this.a = 0;
        this.b = 0;
    }

    public Calcolatrice(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int somma()
    {
        return a + b;
    }

    public int moltiplicazione()
    {
        return a * b;
    }

    public int sottrazione()
    {
        return a - b;
    }

    public double divisione()
    {
        if (b != 0)
        {
            return a / (double) b;
        }
        else
            return 0;
    }
}