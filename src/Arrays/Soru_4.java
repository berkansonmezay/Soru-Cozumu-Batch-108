package Arrays;

public class Soru_4 {
    /*
    Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
            kullanildigini yazdiran bir method olusturun.
     */

    public static void main(String[] args) {
        int [] arr= {1,2,-3,4,1,4,1,-3,-5};

        int istenenSayi=1;

        arananElemanBul(arr,istenenSayi);

    }

    public static void arananElemanBul(int[] arr,int istenenSayi) {
        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==istenenSayi){
                sayac++;

            }
        }
        System.out.println("Aranan "+istenenSayi+" Arrayde "+sayac+" tane vardır.");

    }
}
