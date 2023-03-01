public class Auto {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;
    public int KM;

    public Auto(){

    }

    public Auto(String mar,String mod,int ro,int przeb,int K)
    {
        this.marka = mar;
        this.model = mod;
        this.rok = ro;
        this.przebieg = przeb;
        this.KM = K;
    }

    public void info()
    {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok: " + rok);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("KM: " + KM);
    }
}
