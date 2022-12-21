package Sample_Questions_Slack;

import java.util.Scanner;

public class Q26 {
    /*
    Soru 26-)
        Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
        Örnek:
        Giriş :6
        Çıkış: 6 Mükemmel Sayıdır
        Giriş :7
        Çıkış:7 Mükemmel Sayı Değildir
        ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz :wink:

     */
    public static void main(String[] args) {

    System.out.println("Bir sayı giriniz: ");

    Scanner scan=new Scanner(System.in);
    int sayi=scan.nextInt();


    if (mukemmelSayi(sayi)){
        System.out.println(sayi+" mukemmel sayıdır.");
    }else {
        System.out.println(sayi+" mukemmel sayı değildir.");
    }
}

    static boolean mukemmelSayi(int sayi) {
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam+=i;
            }
        }

        if(toplam==sayi){
            return true;
        }else
            return false;
    }

}
