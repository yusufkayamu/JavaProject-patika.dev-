package Ort;

import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik ;

        Scanner input =new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz =");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz =");
        fizik   = input.nextInt();

        System.out.println("Kimya notunuzu giriniz =");
        kimya = input.nextInt();

        System.out.println("Turkce notunuzu giriniz =");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz =");
        tarih = input.nextInt();

        System.out.println("Muzik notunuzu giriniz =");
        muzik = input.nextInt();

        int toplam = matematik+kimya+fizik+tarih+turkce+muzik ;
        double ort = toplam/ 6.0;
        System.out.println("Ders Ortalamaniz ="+ ort);

        String sonuc = (ort >= 60)? "Sinifi gectiniz" : "Maalesef sinifta kaldiniz";
        System.out.println("SINIF GECME DURUMUNUZ ="+ sonuc);


    }

}


