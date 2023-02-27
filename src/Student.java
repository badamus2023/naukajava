public class Student {

    public String imie;
    public String nazwisko;
    public String email;
    public int numerIndeksu;
    public int rokStudiow;

    public void kimJESTES()
    {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSIE()
    {
        System.out.println("Loguje sie za pomoca " + email + " Nr Indeksu "+ numerIndeksu );
    }

    public void podajROK()
    {
        System.out.println("Studjuje na "+ rokStudiow + "Roku studiow");
    }
}
