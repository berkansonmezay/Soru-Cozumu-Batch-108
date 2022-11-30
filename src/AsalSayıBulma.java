import java.util.Scanner;

public class AsalSayıBulma {

    // Kullanicidian alinan sayinin asal olup olmadigini yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi =scan.nextInt();
        int sayac=0;


        for (int i = 2; i < sayi; i++) {
            if(sayi%i==0){
            sayac++;

            }
        }
        if (sayac==0){
            System.out.println(sayi+" Asal bir sayıdır");
        }else {
            System.out.println(sayi+" Asal bir sayı değildir");
        }
    }
}
