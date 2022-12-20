package Arrays;

public class Sr_5_MDA {
    /*
    Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
            toplaminini yazdiran bir method olusturun.
     */
    public static void main(String[] args) {

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5}};

        icArraySonElemetleriTopla(arr);
    }

    private static void icArraySonElemetleriTopla(int[][] arr) {

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            int sonElement= arr[i][arr[i].length-1];

            toplam+=sonElement;

        }

        System.out.println("\nArray in son elemetleri toplamı: "+toplam);
    }
}
