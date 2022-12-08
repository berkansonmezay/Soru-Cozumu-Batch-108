package Method;

public class UsAlmaMetotKullanarak {
    public static void main(String[] args) {
        // 2.sayıyı 1. sayının ussu olarak dönduren bir method yazınız.

    int sayi1=4;
    int sayi2=6;


        System.out.println(usAlmaMethodu(sayi1, sayi2));


    }

    public static int usAlmaMethodu(int sayi1,int sayi2) {

        int sonuc=(int) Math.pow(sayi1,sayi2);

        return sonuc;
    }
}

