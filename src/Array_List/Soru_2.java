package Array_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_2 {
    /*
            Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
            liste olarak dondurecek bir method olusturun.
     */
    public static void main(String[] args) {

        System.out.println(isimlerListesiMethodu());
    }

    public static List<String> isimlerListesiMethodu() {

        String isim="";

        List<String> isimler=new ArrayList<>();

        do{
            Scanner scan=new Scanner(System.in);

            System.out.println("Liste oluşturmak için isim giriniz. Listeyi görmek içi Q basınız: ");

            isim=scan.nextLine();

            if(!(isim.equalsIgnoreCase("q"))){

                isimler.add(isim);

            }else break;


        }while (!isim.equalsIgnoreCase("q"));

        return isimler;
    }
}
