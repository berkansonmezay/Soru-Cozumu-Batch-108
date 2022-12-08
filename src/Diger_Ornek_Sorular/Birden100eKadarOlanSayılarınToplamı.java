package Diger_Ornek_Sorular;

public class Birden100eKadarOlanSayılarınToplamı {

    // 1 den 100 kadar olan sayıların toplamını yazdırınız

    public static void main(String[] args) {
        int toplam=0;

        for (int i = 1; i <100 ; i++) {
            toplam+=i;

        }
        System.out.println("Sayıların toplamı: "+ toplam);
    }
}
