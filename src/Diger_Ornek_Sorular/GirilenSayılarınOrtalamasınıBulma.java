package Diger_Ornek_Sorular;

import java.util.Scanner;

public class GirilenSayılarınOrtalamasınıBulma {

    // Diger_Ornek_Sorular.GirilenSayılarınOrtalamasınıBulma
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Girmek istediğiniz sayı adedini giriniz: ");
        int adet= scan.nextInt();
        int toplam=0;


        for (int i = 1; i <= adet; i++) {
            System.out.println(i+ ". sayıyı giriniz: ");
            int sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Sayıların ortalaması "+ (toplam/adet));
    }
}
