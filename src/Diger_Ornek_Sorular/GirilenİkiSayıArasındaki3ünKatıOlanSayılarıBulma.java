package Diger_Ornek_Sorular;

import java.util.Scanner;

public class GirilenİkiSayıArasındaki3ünKatıOlanSayılarıBulma {

    // girilen 2 sayı arasında 3 un katı olanları bulma
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("1.sayıyı giriniz");
        int sayi1=scan.nextInt();

        System.out.println("2.sayıyı giriniz");
        int sayi2=scan.nextInt();

        for (int i = sayi1; i <= sayi2; i++) {

            if (i%3==0) {
                System.out.println(i+" 3 un katıdır.");
            }
        }
    }
}
