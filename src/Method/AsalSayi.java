package Method;

public class AsalSayi {

    public static void main(String[] args) {

        // verilen bir sayinin asal olup olmadigini true / false olarak donduren
        // bir method olusturun

        // asalSayiMi method'u boolean bir sonuc dondurdugunden
        // bu method'u calistirdigimizda
        // ya direk yazdirmaliyiz

        int sayi=0;
        int girilenSayi=10;

        if(asalSayiMi(girilenSayi)==true){
            System.out.println("girilen sayı asaldır");
        }else {
            System.out.println("girilen sayı asal değildir.");
        }



    }

    private static boolean asalSayiMi(int sayi) {
        boolean asalMi=true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0) {
                asalMi=false;
                break;
            }
        }

        return asalMi;
    }

}
