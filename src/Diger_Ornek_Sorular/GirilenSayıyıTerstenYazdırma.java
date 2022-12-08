package Diger_Ornek_Sorular;

import java.util.Scanner;

public class GirilenSayıyıTerstenYazdırma {

    // Diger_Ornek_Sorular.GirilenSayıyıTerstenYazdırma

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int rakam=0;

        System.out.println("sayının tersten yazılışı:");
        while(sayi>0){
            rakam=sayi%10;  // 5
            System.out.print(rakam);  // 54
            sayi/=10;   // 4

        }

    }
}
