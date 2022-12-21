package Sample_Questions_Slack;

import java.util.Scanner;

public class Q22 {
    /*
    Soru 22-)
            Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve
            LCM'yi bulun (En Küçük Ortak Kat)
            Giriş :
            30 ve 40

            Beklenen Çıktı:
            30 ve 40 için EBOB= 10
            30 ve 40 için EKOK= 120
            ipucu:
            Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una
            bölünerek bulunabilir.
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        // *************************ebob***************
        int ebob = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        // **********************ekok********************
        int max = 1;
        int ekok = 1;

        for (int i = sayi1 * sayi2; i > 0; i--) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
            }


        }
        System.out.println("Ebob = " + ebob);
        System.out.println("Ekok = " + ekok);
    }
}
