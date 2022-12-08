package Diger_Ornek_Sorular;

import java.util.Scanner;

public class GirilenSayıyıYazıOlarakEkranaYazdırma {
    /*
    Bu örnekte kullanıcının girdiği 2 basamaklı sayıyı yazı olarak ekrana yazdıracağız.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("2 basamaklı bir sayi giriniz: ");
        int sayi=scan.nextInt();

        int birler=sayi%10;
        int onlar=sayi/10;

        switch(onlar){
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmış");
                break;
            case 7:
                System.out.print("Yetmiş");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }
        switch(birler){
            case 1:
                System.out.print("Bir");
                break;
            case 2:
                System.out.print("İki");
                break;
            case 3:
                System.out.print("Üç");
                break;
            case 4:
                System.out.print("Dört");
                break;
            case 5:
                System.out.print("Beş");
                break;
            case 6:
                System.out.print("Altı");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
                break;
        }
    }
}
