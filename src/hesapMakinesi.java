import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int islem,x,y;
       Scanner input= new Scanner(System.in);

        System.out.println( "ilk sayinizi giriniz");
        x= input.nextInt();
        System.out.println( "ikinci sayinizi giriniz");
        y= input.nextInt();

        System.out.println( "toplam 1\n cikarma 2\n carpma 3\n bolme 4 sekilde  seciniz");

        System.out.println( "Islem : ");
        islem= input.nextInt();
        switch (islem){

            case 1 :
                System.out.println( "Toplam : " + (x + y));
                break;
            case 2 :
                System.out.println( "Cıkarma : " + (x- y));
                break;
            case 3 :
                System.out.println( "Carpma : " + (x * y));
                break;
            case 4 :
                if (x != 0){
                    System.out.println("Bolumu: "+ x / y);
                }
                else {
                    System.out.println("0 bulunmez");
                }
                break;
            default : System.out.println("HEY! Yanlıs tercih ");
        }

    }
}
