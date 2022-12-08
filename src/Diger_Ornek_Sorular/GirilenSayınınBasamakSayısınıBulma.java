package Diger_Ornek_Sorular;

import java.util.Scanner;

public class GirilenSayınınBasamakSayısınıBulma {

    // Diger_Ornek_Sorular.GirilenSayınınBasamakSayısınıBulma
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi=scan.nextInt();
        int sayac=0;

        while(sayi>0){
            sayi/=10;
            sayac++;
        }
        System.out.println("Girilen sayının basamak sayısi: "+sayac);
    }
}
