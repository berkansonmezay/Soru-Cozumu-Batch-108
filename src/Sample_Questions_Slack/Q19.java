package Sample_Questions_Slack;

import java.util.Scanner;

public class Q19 {
    /*
    Soru 19-)
            Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
            ipucu:
            Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen doğduğunuz ayı yazınız (Ocak/Şubat...): ");
        String ay = scan.nextLine();

        System.out.println("Lütfen doğduğunuz günü yazınız (12/25...): ");
        int gun= scan.nextInt();

        burc( ay,gun);



    }

    private static void burc(String ay, int gun) {
        String burc="";

        if (ay.equalsIgnoreCase("Ocak"))
        {
            if (gun>22)
                burc="Kova";
            else
                burc="Oğlak";
        }

        if (ay.equalsIgnoreCase("Şubat"))
        {
            if (gun>20)
                burc="Balık";
            else
                burc="Kova";
        }

        if (ay.equalsIgnoreCase("Mart"))
        {
            if (gun>21)
                burc="Koç";
            else
                burc="Balık";
        }

        if (ay.equalsIgnoreCase("Nisan"))
        {
            if (gun>21)
                burc="Boğa";
            else
                burc="Koç";
        }

        if (ay.equalsIgnoreCase("Mayıs"))
        {
            if (gun>22)
                burc="İkizler";
            else
                burc="Boğa";
        }

        if (ay.equalsIgnoreCase("Haziran"))
        {
            if (gun>23)
                burc="Yengeç";
            else
                burc="İkizler";
        }

        if (ay.equalsIgnoreCase("Temmuz"))
        {
            if (gun>23)
                burc="Aslan";
            else
                burc="Yengeç";
        }

        if (ay.equalsIgnoreCase("Ağustos"))
        {
            if (gun>23)
                burc="Başak";
            else
                burc="Aslan";
        }

        if (ay.equalsIgnoreCase("Eylül"))
        {
            if (gun>23)
                burc="Terazi";
            else
                burc="Başak";
        }

        if (ay.equalsIgnoreCase("Ekim"))
        {
            if (gun>23)
                burc="Akrep";
            else
                burc="Terazi";
        }

        if (ay.equalsIgnoreCase("Kasım"))
        {
            if (gun>22)
                burc="Yay";
            else
                burc="Akrep";
        }

        if (ay.equalsIgnoreCase("Aralık"))
        {
            if (gun>22)
                burc="Oğlak";
            else
                burc="Yay";
        }

        System.out.println(gun+" "+ay+" "+" gününde doğduysanız burcunuz da "+burc+" olur");
    }


}
