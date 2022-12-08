package Diger_Ornek_Sorular;

import java.util.Scanner;

public class GirilenCümledekiKelimeSayısınıBulma {
    /*
        kullanıcıdan alınan cümlede kaç tane kelime olduğunu bulup ekrana yazdırın.
         */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz: ");
        String cumle= scan.nextLine();

        int sayac=1;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==' ') {
                sayac++;

            }
        }

        System.out.println("Girilen cümlede "+ sayac+" tane kelime var.");

    }
}
