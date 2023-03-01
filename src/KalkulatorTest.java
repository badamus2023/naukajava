import java.util.Scanner;
public class KalkulatorTest {
    public static void main(String[] args) {
        Kalkulator Kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);

            System.out.println("Prosze, podaj pierwsza liczbe:");
            int firstNumber = scanner.nextInt();
            System.out.println("Prosze, podaj druga liczbe:");
            int secondNumber = scanner.nextInt();


            System.out.println("Dodawanie: "+ Kalkulator.dodawanie(firstNumber,secondNumber));
            System.out.println("odejmowanie: "+ Kalkulator.odejmowanie(firstNumber,secondNumber));
            System.out.println("mnozenie: " + Kalkulator.mnozenie(firstNumber,secondNumber));
            System.out.println("dzielenie: "+ Kalkulator.dzielenie(firstNumber,secondNumber));
            System.out.println("modulo: "+ Kalkulator.modulo(firstNumber,secondNumber));
    }
}
