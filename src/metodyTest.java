public class metodyTest
{
    public static void main(String[] args) {
        metody metody = new metody();
        int result = metody.pobierzWynik();
        int result2 = result * 2;
        System.out.println("Rezultat po mnozeniu to:" + result2);

        metody.add(1,8);
    }
}
