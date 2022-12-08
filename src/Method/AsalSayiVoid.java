package Method;



public class AsalSayiVoid {
    public static void main(String[] args) {
        // verilen bir sayinin asal olup olmadigini yazdıran
        // bir method olusturun

        asalSayiYazdir(15);

    }

    private static void asalSayiYazdir(int sayi) {
            int sayac=0;
        for (int i = 2; i <sayi ; i++) {        //
            if (sayi % i == 0) {
                sayac++;
            }
        }
       if(sayac==0)
       {System.out.println("Asal Sayidir.");
        }else {
       System.out.println("Asal Sayi değildir.");
    }
    }
}
