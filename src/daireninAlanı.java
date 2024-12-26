import  java.util.Scanner;

public class daireninAlanı {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);


        /*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360

         */
        double a,r,alan,cevre;
        double pi=3.14;
        System.out.println("yarıcapı GİRİN:");
        r = inp.nextDouble();
        System.out.println("dilim acısını GİRİN:");
        a=inp.nextDouble();
        alan=3.14 *r*r;
        cevre=2*pi*r;
        double dAlan=(pi * (r*r) *a) / 360 ;

        System.out.println("alan :" +alan);
        System.out.println("cevre :" +cevre);
        System.out.println("Dilimin alanı :" +dAlan);


    }
}
