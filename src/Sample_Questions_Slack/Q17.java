package Sample_Questions_Slack;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        /*
        Soru 17-)
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin
        kaç kez tekrarlandığını kontrol edelim.
        Örnek:
        char ch1=            'a'
        String name =     "Ali bakkala geç gitti."
        Beklenen Çıktı=    a sayısı = 3
        Ipucu:
        Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!
         */


        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir isim giriniz: ");
        String isim=scan.nextLine();

        System.out.print("Lütfen bir karakter giriniz: ");
        char karakter=scan.next().charAt(0);

        int sayac=0;
        int index=0;

            while(index<isim.length()){

                if (karakter==isim.charAt(index)) {
                    sayac++;

                }
               index++;
            }
        System.out.println(karakter+" verilen cumlede "+ sayac + " adet vardır.");
    }
}
