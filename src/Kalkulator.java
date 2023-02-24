import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe:");
        float firstNumber = scanner.nextInt();
        System.out.println("Prosze, podaj druga liczbe:");
        float secondNumber = scanner.nextInt();

        float dodawanie = firstNumber + secondNumber;
        float odejmowanie = firstNumber - secondNumber;
        float mnozenie = firstNumber * secondNumber;
        float dzielenie = firstNumber / secondNumber;
        float modulo = firstNumber % secondNumber;

        System.out.println("Dodawanie: "+ dodawanie);
        System.out.println("odejmowanie: "+ odejmowanie);
        System.out.println("mnozenie: " + mnozenie);
        System.out.println("dzielenie: "+ dzielenie);
        System.out.println("modulo: "+ modulo);
    }
}
