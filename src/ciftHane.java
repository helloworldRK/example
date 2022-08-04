import java.util.Scanner;
public class ciftHane {
    public static void main(String[] args) {
        int top=0 , binler=0, yuzler=0, birler=0, onlar=0,sayi;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz:");
        sayi=input.nextInt();
            if(sayi<=9){
                System.out.println("Cok Haneli Bir Sayi Lutfen");
            }
            else if(sayi<=99){
                onlar=sayi/10;
                sayi=sayi-(10*onlar);
                birler=sayi;
                top+=birler;
                System.out.println("Tek Hanelerin Toplami: "+top);
            }
            else if (sayi>=100 & sayi<=999){
                yuzler=sayi/100;
                sayi=sayi-(100*yuzler);
                onlar=sayi/10;
                top+=onlar;
                System.out.println("Tek Hanelerin Toplami: "+top);

            }
            else if(sayi>= 999 & sayi<=9999){
                binler=sayi/1000;
                sayi=sayi-(1000*binler);
                yuzler=sayi/100;
                sayi=sayi-(100*yuzler);
                onlar=sayi/10;
                sayi=sayi-(10*onlar);
                birler=sayi;
                top+=yuzler+birler;
                System.out.println("Tek Hanelerin Toplami: "+top);

            }
    }

}
