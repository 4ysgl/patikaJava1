import java.util.Scanner;

public class ucakBiletHesaplama
{
    public static void main(String[] args) {


        Scanner inp =new Scanner(System.in);
        // yas gıdıs turu ve indırımlere gore bılet fıyat hesaplaması

         int km,yas,tip;
         double tFiyat,indirim;

        System.out.println("km girin");
        km= inp.nextInt();
        System.out.println("yaş gırın:");
        yas= inp.nextInt();
        System.out.println("yolculuk tipi girin \n 1- tek yön\n 2- çift yön ");
        tip= inp.nextInt();

        switch (tip)
        {
            case 1:
                if (yas<12)
                {
                   tFiyat=(km*0.10)*0.50;
                    System.out.println("indirimli fiyat"+tFiyat);
                }
                else if (yas>=12 && yas<=24)
                {
                    tFiyat=(km*0.10)*0.90;
                    System.out.println("indirimli fiyat"+tFiyat);
                }
                else if (yas>65)
                {
                    tFiyat=(km*0.10)*0.70;
                    System.out.println("indirimli fiyat"+tFiyat);
                }
                else System.out.println("gecersız bılgı gırdınız");
            case 2:
                if (yas<12)
                {
                    tFiyat=(km*0.10)*0.50;
                    tFiyat=(tFiyat*0.80)*2;
                    System.out.println("indirimli fiyat"+tFiyat);
                }
                else if (yas>=12 && yas<=24)
                {
                    tFiyat=(km*0.10)*0.90;
                    tFiyat=(tFiyat*0.80)*2;
                    System.out.println("indirimli fiyat"+tFiyat);
                }
                else if (yas>65)
                {
                    tFiyat=(km*0.10)*0.70;
                    tFiyat=(tFiyat*0.80)*2;
                    System.out.println("indirimli fiyat"+tFiyat);
                }
                else System.out.println("gecersız bılgı gırdınız");

        }



    }


}
