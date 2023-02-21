package ogrenci;



public class Ogrenci {
    private String ad;
    private String soyad;
    private String kimlikNo;
    private int yas;
    private int numara;
    private String sinif;

    public Ogrenci(String ad, String soyad, String kimlikNo, int yas, int numara, String sinif) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return
                        "ÖĞRENCİNİN ADI= " + ad + "\n" +
                        "ÖĞRENCİNİN SOYADI= " + soyad + "\n" +
                        "ÖĞRENCİNİN TC NUMARASI= " + kimlikNo + "\n" +
                        "ÖĞRENCİNİN YAŞI=" + yas +"\n"+
                        "ÖĞRENCİNİN NUMARASI= " + numara +"\n"+
                        "ÖĞRECİNİN SINIF=" + sinif;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}
