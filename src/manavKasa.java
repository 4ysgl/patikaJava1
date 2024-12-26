import java.util.Scanner;

public class manavKasa
{
    public static void main(String[] args) {
        /*Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL

         */
        Scanner inp=new Scanner(System.in);
        Double a,e,d,m,p;
        Double fa,fe,fd,fm,fp;
        System.out.println("armutun kilosunu giirin:");
        a = inp.nextDouble();
        System.out.println("elma kilosunu giirin:");
        e = inp.nextDouble();
        System.out.println("domates kilosunu giirin:");
        d = inp.nextDouble();
        System.out.println("muz kilosunu giirin:");
        m = inp.nextDouble();
        System.out.println("patlıcan kilosunu giirin:");
        p = inp.nextDouble();
        fa =2.14*a;
        fe =3.67*e;
        fd =1.11*d;
        fm =0.95*m;
        fp =5.00*p;
        System.out.println("armut fiyatı:"+fa);
        System.out.println("elma fiyatı:"+fe);
        System.out.println("domates fiyatı:"+fd);
        System.out.println("muz fiyatı:"+fm);
        System.out.println("patlıcan fiyatı:"+fp);
    }
}
