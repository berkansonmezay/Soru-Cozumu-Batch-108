import java.util.Scanner;

public class BasitHesapMakinesiSwitchCase {

    // 4 basit işlemli bir hesap makinasi işlemlerini yapan komutları swich case ile yazınız
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.sayıyı giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.println("2.sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println("**** İŞLEMİNİZİ SEÇİNİZ ****" + "\n\t\t1.Toplama" +
                "\n\t\t2.Çıkarma" + "\n\t\t3.Çarpma" + "\n\t\t4.Bölme");

        System.out.println("Seciminizi giriniz: ");
        int secim = scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplama işlemimin sonucu: "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma işlemimin sonucu: "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma işlemimin sonucu: "+ (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bolme işlemimin sonucu: "+ (double)(sayi1/sayi2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız: ");
        }

    }
}