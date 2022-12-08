package Diger_Ornek_Sorular;

import java.util.Scanner;

public class FaktöriyelHesaplama {

    //Kullanıcıdan alınan bir sayının faktoriyelini hesaplayınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi =scan.nextInt();
        int faktoriyel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoriyel*=i;

        }
        System.out.println(sayi+ "!"+"="+faktoriyel);
    }
}
