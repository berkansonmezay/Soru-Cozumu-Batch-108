package Arrays;

public class Soru_2 {
    /*
    Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
            method yaziniz.
     */

    public static void main(String[] args) {
        int [] arr= {1,2,-3,4,-5};

        System.out.println(arraydekiElemanlariTopla(arr));

    }
    public static int arraydekiElemanlariTopla(int [] arr){
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0) {
                toplam+=arr[i];

            }
        }
        return toplam;
    }
}
