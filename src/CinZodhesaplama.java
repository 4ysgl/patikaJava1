import java.util.Scanner;

public class CinZodhesaplama {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

            System.out.println("Doğum yılınızı giriniz: ");
            int yil = inp.nextInt();
            int kalan = yil % 12;

            if (kalan == 0) {
                System.out.println("Çin Zodyağı Burcunuz: Maymun");
            } else if (kalan == 1) {
                System.out.println("Çin Zodyağı Burcunuz: Horoz");
            } else if (kalan == 2) {
                System.out.println("Çin Zodyağı Burcunuz: Köpek");
            } else if (kalan == 3) {
                System.out.println("Çin Zodyağı Burcunuz: Domuz");
            } else if (kalan == 4) {
                System.out.println("Çin Zodyağı Burcunuz: Fare");
            } else if (kalan == 5) {
                System.out.println("Çin Zodyağı Burcunuz: Öküz");
            } else if (kalan == 6) {
                System.out.println("Çin Zodyağı Burcunuz: Kaplan");
            } else if (kalan == 7) {
                System.out.println("Çin Zodyağı Burcunuz: Tavşan");
            } else if (kalan == 8) {
                System.out.println("Çin Zodyağı Burcunuz: Ejderha");
            } else if (kalan == 9) {
                System.out.println("Çin Zodyağı Burcunuz: Yılan");
            } else if (kalan == 10) {
                System.out.println("Çin Zodyağı Burcunuz: At");
            } else if (kalan == 11) {
                System.out.println("Çin Zodyağı Burcunuz: Koyun");
            }

            inp.close(); // Scanner nesnesini kapatma
        }
    }

