package Diger_Ornek_Sorular;

import java.util.Scanner;

public class ATMOrnegi {
    /*
    Kullanıcıya bakiyesini gösterdikten sonra yapabileceği işlemleri ekrana yazdırınız.
    ****İSLEMLER****
    1. Para Çekme
    2. Para Yatırma
    3. Bakiye sorgulama
    4. Kart İade

    Kullanıcının yapmak istediği işlemi “islem” değişkeniyle kullanıcıdan alıyoruz.
    Switch-case yapısı ile de kullanıcının seçebileceği durumlar için işlemleri belirliyoruz.

    Örneğin kullanıcı “2” sayısını seçtiği zaman, program çalışır ve yapıyı sonlandırır.

    Bu şekilde basit bir ATM örneği tasarlamış olduk.
     */

    public static void main(String[] args) {

        System.out.println("\t****İSLEMLER****\n" +
                "    1. Para Çekme\n" +
                "    2. Para Yatırma\n" +
                "    3. Bakiye sorgulama\n" +
                "    4. Kart İade");

        int bakiye= 1000;

        Scanner scan = new Scanner(System.in);
        System.out.println("\nLütfen yapmak istediğiniz işlemi seciniz: ");

        int islem = scan.nextInt();

        switch (islem){
            case 1:
                System.out.println("Bakiyeniz: "+ bakiye);
                System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                int tutar= scan.nextInt();

                if (tutar>bakiye) {
                    System.out.println("Yetersiz Bakiye. Yeniden deneyiniz. ");
                    tutar= scan.nextInt();
                }
                bakiye-=tutar;
                System.out.println("Yeni bakiye: "+ bakiye);
                break;
            case 2:
                System.out.println("Bakiyeniz: "+ bakiye);
                System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                tutar= scan.nextInt();
                bakiye+=tutar;
                System.out.println("Yeni bakiye: "+ bakiye);
                break;
            case 3:
                System.out.println("Bakiyeniz: "+ bakiye);
                break;
            case 4:
                System.out.println("Kartınızı almayı unutmayın ");
                break;
            default:
                System.out.println("yanlış işlem yaptınız. ");


        }


    }


}
