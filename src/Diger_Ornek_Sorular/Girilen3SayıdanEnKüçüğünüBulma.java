package Diger_Ornek_Sorular;

import java.util.Scanner;

public class Girilen3SayıdanEnKüçüğünüBulma {

    // Kullanıcıdan 3 adet sayı aldıktan sonra en kucugunu yazdırın

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("3 adet sayı giriniz: ");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();

        int enKucukSayi=sayi1;

        if (sayi2<enKucukSayi) {
            enKucukSayi=sayi2;
        }
        if (sayi3<enKucukSayi) {
            enKucukSayi=sayi3;
        }
        System.out.println("En kucuk sayı: "+ enKucukSayi);
    }
}
