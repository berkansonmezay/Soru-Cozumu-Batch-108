package Sample_Questions_Slack;

import java.util.Scanner;

public class Q21 {
    /*
    Soru 21-)
        Bir aydaki gün sayısını bulmak için bir Java programı yazın
        (Mülakat Sorusu / Interview Sorusu / Leak Year)

        Örnek:
        Bir ay numarası girin: 2
        Bir yıl girin: 2016

        Şubat 2016'da 29 gün vardır
        ipucu:
        Switch Case kullanarak çözebiliriz.
        Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı
        için method kullanmamız gerekiyor!
        Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
        ipucu2:
        ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
        Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
        Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.
     */

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.println("bir ay numarasi girin:  ");
        int ayNo = scan.nextInt();

        System.out.println("bir yil girin:  ");
        int yil = scan.nextInt();



        switch (ayNo){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Gun saysi: "+ "30");break;
            case 2:
                if (yil % 100 == 0 && yil % 400 == 0) {
                    System.out.println("Gun saysi: "+  "29");break;
                } else if (yil % 100 != 0 && yil % 4 == 0) {
                    System.out.println("Gun saysi: "+  "29");break;
                } else {
                    System.out.println("Gun saysi: "+  "28");break;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Gun saysi: "+ "31");break;
            default:
                System.out.println("gecersiz ay numarasi");
        }

    }
}
