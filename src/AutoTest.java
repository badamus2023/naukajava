public class AutoTest {
    public static void main(String[] args)
    {
        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa A";
        mercedes.KM = 170;
        mercedes.przebieg = 7000;
        mercedes.rok= 2022;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();


        Auto BMW = new Auto();
        BMW.marka = "BMW";
        BMW.model = "S3";
        BMW.rok = 2012;
        BMW.KM = 210;
        BMW.przebieg = 200000;

        BMW.info();



    }
}
