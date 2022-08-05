import java.util.Scanner;
public class kucuktenBuyugeSiralama {
    public static void main(String[] args) {
        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
        int s1, s2, s3;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayiniz: ");
        s1 = input.nextInt();
        System.out.println("Ikinci Sayiniz: ");
        s2 = input.nextInt();
        System.out.println("Ucuncu Sayiniz: ");
        s3 = input.nextInt();
        if ((s1 < s2) && s1 < s3) {
            if (s2 < s3) {
                System.out.println("s1<s2<s3");

            } else {
                System.out.println("s1<s3<s2");
            }
        }
        else if ((s2 < s1) && s2 < s3) {
            if (s1 < s3) {
                System.out.println("s2<s1<s3");
            } else {
                System.out.println("s2<s3<s1");
            }
        }
       else   if (s1 < s2) {
            System.out.println("s3<s1<s2");
        }
              else{
                System.out.println("s3<s2<s1");
            }
        }
    }




