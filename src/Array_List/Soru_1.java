package Array_List;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_1 {
    /*
    Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
            elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
     */
    public static void main(String[] args) {

        int[] arr = {4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};

        System.out.println(Arrays.toString(tekrarsizElementlerarrayi(arr)));
    }

    public static int[] tekrarsizElementlerarrayi(int[] arr) {

        List<Integer> tekrarsizElementlerList= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if(!tekrarsizElementlerList.contains(arr[i])){

                tekrarsizElementlerList.add(arr[i]);

            }

        }

        arr=new int [tekrarsizElementlerList.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i]=tekrarsizElementlerList.get(i);

        }

        return arr;
    }

}
