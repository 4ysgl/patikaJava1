import java.util.Scanner;

public class taksimetreHesaplama {
    public static void main(String[] args) {


        /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
     */
        Scanner inp=new Scanner(System.in);

    double km,fiyat;
        System.out.println("kaç kilometre oldugunu girin: ");
        km = inp.nextDouble();
        fiyat= km*2.20;

        String yaz = (fiyat <20) ? "taksimetre tutarı 20 tldir" : "taksimetre tutarı " +fiyat+"tl dir";
        System.out.println(yaz);

    }

}
