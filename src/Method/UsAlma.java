package Method;

public class UsAlma {
    public static void main(String[] args) {


        // 2.sayıyı 1. sayının ussu olarak dönduren bir method yazınız.

        int sayi1=2;
        int sayi2=3;

        System.out.println(usAlma(sayi1, sayi2));

    }

    public static int usAlma(int sayi1, int sayi2) {
            int sonuc=1;

        for (int i = 1; i <=sayi2 ; i++) {
            sonuc*=sayi1;
        }
        return sonuc;
    }
}
