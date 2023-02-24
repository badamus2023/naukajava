import java.util.Scanner;
public class Wiek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek:");
        int wiek = scanner.nextInt();
        if(wiek >= 18)
        {
            System.out.println("Dziekujemy za zakupy");
        }
        else if (wiek <= 0)
        {
            System.out.println("Bledna wartosc");
        }
        else if (wiek < 18)
        {
            System.out.println("Nie masz ukonczonych 18 lat");
        }
    }
}
