import java.util.Scanner;

public class GirilenİkiSayıyıKarşılaştırma {
     /*
     Bu örnekte kullanıcıdan aldığımız 2 sayıyı birbirine göre
     karşılaştırıp eşit, büyük, küçük olma durumlarını ekrana yazdırınız.
     */
     public static void main(String[] args) {
         int sayi1=23;
         int sayi2=45;


         if (sayi1 >sayi2) {
             System.out.println("Sayı 1 buyuktur sayı 2");
         } else if (sayi2>sayi1) {
             System.out.println("Sayı 2 buyuktur sayı 1");
         }else System.out.println("Sayılar birbirine esittir.");

     }

}
