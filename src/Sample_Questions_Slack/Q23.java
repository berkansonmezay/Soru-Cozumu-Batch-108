package Sample_Questions_Slack;

import java.util.Scanner;

public class Q23 {
    /*
    Soru 23-)
        Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
        Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int sayi = scan.nextInt();


        System.out.println(sayi+"!"+"="+sayininFaktoriyeli(sayi));
    }


    public static int sayininFaktoriyeli(int sayi) {
        int faktoriyelDegeri=1;

        for (int i = sayi; i>0 ; i--) {

            faktoriyelDegeri*=i;
        }
        return faktoriyelDegeri;
    }
}
