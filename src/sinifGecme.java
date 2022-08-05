import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        double mat, fiz, turkce, kim, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = input.nextFloat();
        System.out.println("Fizik Notunuz: ");
        fiz = input.nextFloat();
        System.out.println("Turkce Notunuz: ");
        turkce = input.nextFloat();
        System.out.println("Kimya Notunuz: ");
        kim = input.nextFloat();
        System.out.println("Muzik Notunuz: ");
        muzik = input.nextFloat();

         if (mat < 0 || mat > 100)

         if (fiz < 0 || fiz > 100)

         if (kim < 0 || kim > 100)
         if (turkce < 0 || turkce > 100)
         if (muzik < 0 || muzik > 100);

        double avarage = (mat+fiz+turkce+kim+muzik) / 5;
        if (avarage <55) {
            System.out.println("Kaldiniz");
        }
        else {
            System.out.println(" Gectiniz Tebrikler!");

        }
        System.out.println("Ortalamaniz : " + avarage);


    }
}
    