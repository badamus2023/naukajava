import java.sql.SQLOutput;

public class metody
{
    public void nazwaMetody()
    {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < 100; i++)
        {
            result = result + 1;
        }
        System.out.println("Rezultat to:" + result);
    }

    public int pobierzWynik()
    {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < 100; i++)
        {
            result = result + 1;
        }
        System.out.println("Rezultat to:" + result);
        return result;
    }

    public int add ( int firstNumber, int secondNumber)
    {
        System.out.println("Rezultat to: " + (firstNumber + secondNumber));
        if(firstNumber == 0)
        {
            return 0;
        }
        return firstNumber + secondNumber;
    }
}
