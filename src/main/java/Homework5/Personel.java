package Homework5;

public class Personel {
    private String isim;
    private String soyad;
    private String pozisyon;
    private int calistigiGunSayisi;

   public Personel(String isim, String soyad, String pozisyon, int calistigiGunSayisi){
       this.isim = isim;
       this.soyad = soyad;
       this.pozisyon = pozisyon;
       this.calistigiGunSayisi = calistigiGunSayisi;
   }

   public String getisim(){
       return this.isim;
   }

   public String getSoyad(){
       return this.soyad;
   }

    public String getPozisyon() {
        return pozisyon;
    }

    public int getCalistigiGunSayisi() {
        return calistigiGunSayisi;
    }
}

