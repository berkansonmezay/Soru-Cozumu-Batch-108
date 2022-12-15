package Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Soru_5 {
    /*
    Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
            donduren bir method olusturun.
     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayOlustur()));

    }

    public static int [] arrayOlustur() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen arrayin boyutunu girin: ");
        int arrayBoyutu= scan.nextInt();
        int [] arr=new int[arrayBoyutu];

        for (int i = 0; i <arrayBoyutu ; i++) {
            System.out.println("Lütfen element giriniz: ");
            arr[i]= scan.nextInt();
        }
        return arr;
    }
}
