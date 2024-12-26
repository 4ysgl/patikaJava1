

import java.util.Scanner;


public class alanHesaplama {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        double a,b,c,h,alan,cevre;
        System.out.println("1. KENARI GİRİN:");
        a = inp.nextDouble();

        System.out.println("2. KENARI GİRİN:");
        b = inp.nextDouble();

        System.out.println("TABAN KENARI GİRİN:");
        c = inp.nextDouble();

        System.out.println("YÜKSEKLİĞİ GİRİN:");
       h = inp.nextDouble();
cevre=a+b+c;
alan=(c*h)/2;
        System.out.println("üçgenin alanı: "+cevre);
        System.out.println("üçgenin alanı:"+alan );



    }
}
