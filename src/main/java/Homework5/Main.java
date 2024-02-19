package Homework5;

import org.example.Personel;

public class Main {
    public static void main(String[] args) {

   Personel ilkPersonel = new Personel("Cem" , "Ozo" , "IT Tester", 20);

   System.out.println("Adı Soyadı" + " " + ilkPersonel.getisim() + " " +  ilkPersonel.getSoyad() + " pozisyonu" + " " + ilkPersonel.getPozisyon() + " çalıştığı gün sayısı" + " " + ilkPersonel.getCalistigiGunSayisi());



    }
}