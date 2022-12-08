package Diger_Ornek_Sorular;

import java.util.Scanner;

public class GirilenSayınınRakamlarınınKareleriniBulma {

    // Diger_Ornek_Sorular.GirilenSayınınRakamlarınınKareleriniBulma
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int rakam=0;
        int toplam=0;


        while(sayi>0){
            rakam=sayi%10;
            System.out.println(rakam*rakam);
            sayi/=10;
            toplam+=rakam*rakam;
        }
        System.out.println("Kareleri toplamı: "+toplam);
    }
}
