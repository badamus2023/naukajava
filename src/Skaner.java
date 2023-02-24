import java.sql.SQLOutput;
import java.util.Scanner;
public class Skaner {

    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj swoje imie:");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + " !");
    } */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe:");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + result);
    }


}
