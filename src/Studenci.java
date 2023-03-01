public class Studenci {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;

        Student Bartosz = new Student();
        Bartosz.email = "bartoszar@wp.pl";
        Bartosz.imie = "Bartosz";
        Bartosz.nazwisko = "Adamus";
        Bartosz.numerIndeksu = 127;
        Bartosz.rokStudiow = 1;
        String uczelniaBartosza = Bartosz.nazwaUczelni;

        Student Barbara = new Student();
        Barbara.rokStudiow = 1;
        Barbara.imie = "Barbara";
        Barbara.nazwisko = "Bialon";
        Barbara.email = "barbara@gmail.com";
        Barbara.numerIndeksu = 1111;

        Student Jan = new Student();
        Jan.numerIndeksu = 2222;
        Jan.imie = "Jan";
        Jan.nazwisko = "Popielniczka";
        Jan.email = "Janex123@wp.pl";
        Jan.rokStudiow = 2;

        Student[] students = new Student[3];
        students[0] = Bartosz;
        students[1] = Barbara;
        students[2] = Jan;

        for(int i=0; i < students.length; i++)
        {
            students[i].kimJESTES();
            students[i].podajROK();
            students[i].zalogujSIE();
            System.out.println("");
        }
    }
}
