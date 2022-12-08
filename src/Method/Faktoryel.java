package Method;

public class Faktoryel {

    public static void main(String[] args) {
        // verilen bir sayinin 15'den kucuk bir pozitif tamsayi oldugunu kontrol edin
        // kucukse bir method olusturup, faktoryel degerini yazdirin
        // sayi istenen aralikta degilse uyari yazdirin

        int sayi=12;

        if (sayi>0 && sayi<15) {
            sayininFaktoriyeli(sayi);
        }else {
            System.out.println("Girilen sayı 15 ten kucuk olmalı.");
        }

    }

    public static void sayininFaktoriyeli(int sayi) {
        int faktoriyelDegeri=1;

        for (int i = sayi; i>0 ; i--) {

            faktoriyelDegeri*=i;
        }
        System.out.println("faktoriyelin degeri: "+faktoriyelDegeri);
    }
}
