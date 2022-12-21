package Sample_Questions_Slack;

import java.util.Scanner;

public class Q18 {
    /*
    Soru 18-)
        Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Mesafeyi km olarak giriniz: ");
        double yol = scan.nextDouble();

        System.out.println("Aracin hizini giriniz: ");
        double hiz = scan.nextDouble();



        System.out.println("Varis suresi: " + varisSuresi(hiz,yol) + " saat");
    }

    private static double varisSuresi(double hiz, double yol) {
        double sure = 1;
        sure=yol/hiz;

        return sure;
    }
}
