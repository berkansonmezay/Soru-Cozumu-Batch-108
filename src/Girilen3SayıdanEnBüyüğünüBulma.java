import java.util.Scanner;

public class Girilen3SayıdanEnBüyüğünüBulma {

    // Kullanıcıdan 3 adet sayı aldıktan sonra “enbuyuk”  olanı yazdırın


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("3 adet sayı giriniz: ");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();

        int enBuyukSayi=sayi1;

        if (sayi2>enBuyukSayi) {
            enBuyukSayi=sayi2;
        }
        if (sayi3>enBuyukSayi) {
            enBuyukSayi=sayi3;
        }
        System.out.println("En buyuk sayı: "+ enBuyukSayi);
    }


}
