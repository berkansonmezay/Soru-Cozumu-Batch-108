package Arrays;

public class Soru_6 {
    /*
    Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
            olusturun.
     */
    public static void main(String[] args) {

        String [] arr= {"ali","veli","ahmet","ramazan"};

        enUzunEnKisaKelimeler(arr);
    }

    public static void enUzunEnKisaKelimeler(String[] arr) {
        String enUzunKelime=arr[0];
        String enkisaKelime=arr[0];


        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()<enkisaKelime.length()){
                enkisaKelime=arr[i];
            }
        }
        System.out.println("En uzun kelime : "+ enUzunKelime+"\nEn kısa kelime : "+enkisaKelime);
    }
}
