import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        /*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini
        kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
        sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
        String uN, passW, pass;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Kullanici Adinizi Giriniz:");
        uN = input.next();

        System.out.println("Lutfen Sifrenizi Giriniz:");
        passW = input.next();

        if (uN.equals("rk") && passW.equals("345")) {
            System.out.println("Giris yaptiniz.");
        }
        else if   (uN==" "){
            System.out.println("Kullanici Adi Bos!");
        }
        else if (passW.equals("345") == false)
        {
            System.out.println("Sifrenizi sifirlamak isterseniz 1'i\nSifirlamak istemezseniz 2'i seciniz.");

            int devam;
            Scanner inp = new Scanner(System.in);
            devam = inp.nextInt();
            if (devam == 1) {
                System.out.print("Lutfen  Yeni Sifrenizi Giriniz:");
                pass = input.nextLine();
                if (pass.equals("345") == true) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                } else if (pass != "345"){
                    pass = input.next();
                System.out.println("Yeni sifreniz olusturulmustur.");

            }

                else {
                    System.out.println("Sifre oluşturuldu.");
                }
            }
            else {
                System.out.println("Sifrenizi degistirmek istemediginizi belirttiniz.");
            }
        }
    }
}