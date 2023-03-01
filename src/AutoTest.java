public class AutoTest {
    public static void main(String[] args)
    {
        Auto Audi = new Auto("Audi","S3",2002,100000,210);
        Auto Mercedes = new Auto("Mercedes","CLA",2013,150000,320);

       /* Audi.info();
        System.out.println("");
        Mercedes.info();*/

        Auto[] auta = new Auto[2];
        auta[0] = Mercedes;
        auta[1] = Audi;

        for(int i=0; i < auta.length; i++)
        {
            auta[i].info();
            System.out.println("");
        }

    }
}
