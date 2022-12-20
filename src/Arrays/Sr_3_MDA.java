package Arrays;

import java.util.Arrays;

public class Sr_3_MDA {
    /*
    Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
            olusturacagimiz tek katli bir array’e bu toplamlari atayin.
            input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
            output: [10, 3, 12, 10, 9]
     */
    public static void main(String[] args) {

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int toplam=0;

        int [] arr2= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];

            }
            arr2[i]=toplam;

            toplam=0;
        }

        System.out.println(Arrays.toString(arr2));
    }
}
