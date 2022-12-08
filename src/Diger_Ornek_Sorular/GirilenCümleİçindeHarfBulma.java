package Diger_Ornek_Sorular;

import java.util.Scanner;

public class GirilenCümleİçindeHarfBulma {

    // kullanıcıdan alınan kelime veya cumlede gecen a harfinin kac tane oldugunu yazdırın
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir kelime veya cümle giriniz:");
        String cumle= scan.nextLine();
        int sayac=0;

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)=='a'|| cumle.charAt(i)=='A' ) {
                sayac++;
            }
        }
        System.out.println("Girilen cumlede veya kelimede "+ sayac+ " tane a harfi vardır");
    }
}
