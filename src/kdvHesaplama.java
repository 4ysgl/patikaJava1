import java.util.Scanner;

public class kdvHesaplama {

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);

       /*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
       ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        */

        double fiyat ;
        System.out.println("fiyatı girin: ");
        fiyat= inp.nextDouble();
        double tutar1=fiyat*0.18;
        double tutar2=fiyat+fiyat*0.08;

        String yaz = (fiyat <1000) ? "tutar 1"+tutar1 : "tutar 2 :"+tutar2;
        System.out.println(yaz);





    }
}
