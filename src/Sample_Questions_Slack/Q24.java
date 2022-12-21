package Sample_Questions_Slack;

public class Q24 {
    /*
    Soru 24-)
            20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
            Örnek:
            20'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
            ipucu:
            Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir :wink:

     */

    public static void main(String[] args) {
        int sayi = 20;
        int ciftSayi = 0;

        System.out.print("20 den 0'a kadar çift sayılar : ");
        while (sayi >= 0) {
            if (sayi % 2 == 0) {
                System.out.print(sayi + " ");
                sayi -=2;
            }
        }
    }
}
