import java.util.Scanner;

public class GirilenİkiSayıArasındaki5ve3ünKatlarıOlanSayılarıBulma {

    // Girilen İki Sayı Arasındaki 5 ve 3 ün Katları Olan Sayıları Bulma
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("1.sayıyı giriniz");
        int sayi1=scan.nextInt();

        System.out.println("2.sayıyı giriniz");
        int sayi2=scan.nextInt();

        for (int i = sayi1; i <= sayi2; i++) {

            if (i%3==0 || i%5==0) {
                System.out.println(i+" 3 veya 5 in katıdır.");
            }
        }
    }
}
