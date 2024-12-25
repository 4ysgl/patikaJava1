import java.util.Scanner;

public class notHesap {


    public static void main(String[] args) {
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik, ort;
        int DERS = 6;


        Scanner inp = new Scanner(System.in);


        System.out.println("lütfen MATEMATİK DERS NOTUNU GİRİN: ");
        Matematik = inp.nextInt();

        System.out.println("lütfen fizik DERS NOTUNU GİRİN: ");
        Fizik = inp.nextInt();

        System.out.println("lütfen kimya DERS NOTUNU GİRİN: ");
        Kimya = inp.nextInt();

        System.out.println("lütfen tarih DERS NOTUNU GİRİN: ");
        Tarih = inp.nextInt();

        System.out.println("lütfen türkçe DERS NOTUNU GİRİN: ");
        Turkce = inp.nextInt();

        System.out.println("lütfen MÜZİK DERS NOTUNU GİRİN: ");
        Muzik = inp.nextInt();

        ort = (Fizik + Muzik + Matematik + Turkce + Kimya + Tarih) / 6;
        System.out.println("ortalama =" + ort);

        String sonuc = (ort >= 60) ? "Tebrikler, Geçtiniz!" : "Maalesef, Kaldınız.";
        System.out.println(sonuc);
    }
    }
