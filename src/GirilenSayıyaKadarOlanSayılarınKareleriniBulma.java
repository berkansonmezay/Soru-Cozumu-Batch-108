import java.util.Scanner;

public class GirilenSayıyaKadarOlanSayılarınKareleriniBulma {

    // GirilenSayıyaKadarOlanSayılarınKareleriniBulma

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int kare=0;
        /*
        for (int i = 0; i < sayi; i++) {
            kare=i*i;
            System.out.println(i+" sayısının karesi: "+kare);
        }

         */


        // ************************ while ********************************

        while(sayi>0){
            kare=sayi*sayi;
            System.out.println(sayi+" sayısının karesi: "+kare);
            sayi--;
        }
    }

}
