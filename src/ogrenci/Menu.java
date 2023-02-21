package ogrenci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scan= new Scanner(System.in);
    static int numara=1000;
    List<Ogrenci> ogrenciList=new ArrayList<>();


    public void islemler() {
        System.out.println("============= İŞLEMLER =============\n" +
                "    \t\t 1-EKLEME\n" +
                "    \t\t 2-ARAMA\n" +
                "    \t\t 3-LİSTELEME\n" +
                "    \t\t 4-SİLME\n" +
                "    \t\t Q-ÇIKIŞ\n" +
                "    \n" +
                "    \tSEÇİMİNİZ:");
        String secim= scan.next().substring(0,1);
        switch(secim){
            case "1":{

                ekleme();
            }
            case "2":{
                System.out.println("ARANACAK TC NO GİRİNİZ: ");
                arama(scan.next());
            }
            case "3":{
                listele();
            }
            case "4":{
                System.out.println("ÖĞRENCİNİN TC NO GİRİNİZ: ");

                silme(scan.next());
            }
            case "q":{}
            case "Q":{
                cikis();
            }
            default:{
                System.out.println("GECERSİZ GİRİS YAPTINIZ. TEKRAR DENEYİNİZ...");
                islemler();
            }
        }
    }

    private void cikis() {

        System.exit(0);
    }

    private void silme(String tcNo) {
        for (Ogrenci each:ogrenciList ) {
            if(each.getKimlikNo().equals(tcNo));
            ogrenciList.remove(each);
            listele();
            islemler();
        }
    }

    private void arama(String TcNo) {

        for (Ogrenci each:ogrenciList ) {
            if (each.getKimlikNo().equals(TcNo)){
                System.out.println("ARANAN OGRENCİ: "+each);
            }else{
                System.out.println("ARANAN ÖGRENCİ YOKTUR. ");
            }

        }
        islemler();
    }

    private void ekleme() {
                 /*
                 1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:
    	        -AD SOYAD
    	        -KİMLİK NO
    	        -YAŞ
    	        -NUMARA
    	        -SINIF  BİLGİLERİNİ İÇERMELİDİR.
                 */

        System.out.print("AD : ");
        String ad=scan.nextLine();
        scan.nextLine();
        System.out.print("SOYAD : ");
        String soyad=scan.nextLine();
        System.out.print("KİMLİK NO : ");
        String kimlikNo=scan.nextLine();
        System.out.print("YAS : ");

        int yas=scan.nextInt();
        scan.nextLine();
        System.out.print("SINIF : ");
        String sinif=scan.nextLine();

        Ogrenci ogrenci= new Ogrenci(ad,soyad,kimlikNo,yas,++numara,sinif);

        ogrenciList.add(ogrenci);


        listele();
        islemler();

    }

    private void listele() {
        for (Ogrenci each:ogrenciList  ) {
            System.out.println(each);

        }
    }
}
