import java.util.Scanner;

public class katlarOrtalaması
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        // 3 ve 4 un katı sayıların toplamı ve ortalaması
        int sayi ,toplam=0,ort=0,i,sayac=0;
        System.out.println("bir sayı girin");
        sayi=inp.nextInt();

        for (i=1;i<=sayi;i++)
        {
            if (i%12==0)
            {
                toplam+=i;
                sayac++;

            }

        }
        ort=toplam/sayac;
        System.out.println("toplam :"+toplam);
        System.out.println(ort);
    }
}
