public class Kalkulator
{
    public int dodawanie (int firstNumber, int secondNumber)
        {
            return firstNumber+secondNumber;
        }

    public int odejmowanie (int firstNumber, int secondNumber)
        {
            return firstNumber-secondNumber;
        }

    public int mnozenie (int firstNumber, int secondNumber)
        {
            return firstNumber*secondNumber;
        }

    public int dzielenie (int firstNumber, int secondNumber)
    {
        if(secondNumber == 0)
        {
            System.out.println("Nie dzielimy przez 0");
            return 0;
        }
        else
        {
            return firstNumber / secondNumber;
        }
    }
    public int modulo (int firstNumber, int secondNumber)
        {
            return firstNumber%secondNumber;
        }
}
