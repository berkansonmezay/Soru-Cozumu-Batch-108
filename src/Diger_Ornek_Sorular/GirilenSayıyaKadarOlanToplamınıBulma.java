package Diger_Ornek_Sorular;

import java.util.Scanner;

public class GirilenSayıyaKadarOlanToplamınıBulma {

    // Diger_Ornek_Sorular.GirilenSayıyaKadarOlanToplamınıBulma
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;

        for (int i = 0; i < sayi; i++) {

            toplam+=i;

        }
        System.out.println("Toplam: "+toplam);
    }
}
