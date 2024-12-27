import java.util.Scanner;


public class hesapMakinesi {

    public static void main(String[] args)
    {
        double a,b,sonuc;
        int c;
        Scanner inp=new Scanner(System.in);

        System.out.println("birinci sayıyı girin:");
        a= inp.nextDouble();

        System.out.println("birinci sayıyı girin:");
        b= inp.nextDouble();

        System.out.println(" Toplama=1 \n Çıkarma=2\n Çarpma=3\nBölme=4");
        c= inp.nextInt();

        switch ( c ) {
            case 1:
                sonuc = a + b;
                System.out.println("Toplam:" + sonuc);
                break;
            case 2:
                sonuc = a - b;
                System.out.println("sonuc:" + sonuc);
                break;
            case 3:
                sonuc = a * b;
                System.out.println("sonuc:" + sonuc);
                break;
            case 4:
                sonuc = a / b;
                System.out.println("sonuc:" + sonuc);
                break;


            default:
                System.out.println("Geçersiz seçim yaptınız. Lütfen 1-4 arasında bir işlem seçin.");

        }
    }
}
