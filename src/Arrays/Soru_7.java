package Arrays;

import java.util.Arrays;

public class Soru_7 {
    /*
    Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
            eski array’e yeni degeri atayin.
     */
    public static void main(String[] args) {

        int [] arr= {1,2,-3,4,1,4,1,-3,-5};

        int eklenecekEleman=25;

       arr= arrayeElemanEkle(arr,eklenecekEleman);
        System.out.println(Arrays.toString(arr));
    }

    public static int [] arrayeElemanEkle(int[] arr, int eklenecekEleman) {
        int [] yeniarr= new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniarr[i]=arr[i];
        }
        yeniarr[yeniarr.length-1]=eklenecekEleman;

        return yeniarr;
    }
}
