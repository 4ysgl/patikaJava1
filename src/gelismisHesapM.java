import java.util.Scanner;

public class gelismisHesapM {
    static void  Sum()
    {
        int top=0,i=1,sayi;
        while (true){
            Scanner inp=new Scanner(System.in);
            System.out.println( i++ +".sayıyı girin:");
            sayi=inp.nextInt();
            if (sayi==0)
            {
                break;
            }
            top+=sayi;
        }
        System.out.println("sonuc:"+top);
    }
static void cikarma(){
        Scanner inp=new Scanner(System.in);
        int adet,sonuc=0,sayi;
    System.out.println("kac adet sayı gireceginizi yazınız:");
    adet=inp.nextInt();
    for (int i=1;i<=adet;i++)
    {
        System.out.println(i+".sayıyı girin:");
        sayi=inp.nextInt();
        if (i==1)
        {
            sonuc+=sayi;
            continue;
        }
        sonuc-=sayi;
    }
    System.out.println("Sonuc: "+sonuc);
}

static void Carpma(){
        Scanner inp=new Scanner(System.in);
        int i,adet,sayi,son=1;
    System.out.println("kac adet sayı gırecegınızı yazın:");
      adet=inp.nextInt();
      for (i=1;i<=adet;i++)
        {
            System.out.println(i+ ".sayıyı gir:");
            sayi=inp.nextInt();
            if (sayi==0)
            {    son=0;
                break;

            } else if (sayi==1)
            {
                break;
            }
            son*=sayi;
        }
    System.out.println("sonuc:"+son);
}
static void Bolme()
{
    Scanner inp=new Scanner(System.in);
    int i,adet;
    double sayi,sonuc=0.0;
    System.out.println("kac adet sayı gırecegınızı yazın:");
    adet=inp.nextInt();

    for (i=1;i<=adet;i++)
    {
        System.out.println(i+ ". sayıyı gır:");
        sayi=inp.nextInt();
        if (i!=0 && sayi==0)
        {
            System.out.println("sıfır sayısı bölünemez");
            continue;
        } else if (i==1) {
            sonuc=sayi;
            continue;
        }
        sonuc/=sayi;

    }
    System.out.println("sonuc :"+sonuc);
}

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban = scan.nextInt();

        System.out.print("Üs değeri giriniz :");
        int us = scan.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç : " + sonuc);
    }

    static void Fact()
    {   Scanner inp = new Scanner(System.in);
        int sayi,son=1;
        System.out.println("faktorıyeli hesaplanacak sayıyı gırın:");
       sayi=inp.nextInt();
        for (int i=1;i<=sayi;i++)
        {
          son*=i;



        }
        System.out.println("sonuc:"+son);
    }
    static void ModAl()
    {
        Scanner inp = new Scanner(System.in);
        int sayi,son=1,adet;
        System.out.println("kac adet sayı gırecegınızı yazınız:");
        adet= inp.nextInt();
        for (int i=1;i<=adet;i++)
        {
            System.out.println("sayıyı girin:");
            sayi=inp.nextInt();
            son%=sayi;

        }
        System.out.println("sonuc"+son);
    }
    static void AlanH()
    {
        Scanner inp = new Scanner(System.in);
        int son=1 ,sec,kenar;

        System.out.println("Alan için -1  , Cevre için -2");
        sec=inp.nextInt();
        if (sec==1)
        {
           for (int i=1;i<3 ;i++)
           {

               System.out.println(i+". kenarı gir");
               kenar= inp.nextInt();
               son=(kenar*son)/2;
           }
            System.out.println("alan:"+son);

        }
        else son=0;
            for (int i=1;i<=4;i++)
            {

                System.out.println(i+". kenarı gir");
                kenar= inp.nextInt();
                son=kenar+son;
            };
        System.out.println("cevre:"+son);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
do {


        System.out.println("işlem numarasını girin ");
        select=scan.nextInt();
        switch (select){
            case 1:Sum();break;
            case 2:cikarma();break;
            case 3:Carpma();break;
            case 4:Bolme();break;
            case 5:power();break;
            case 6:Fact();break;
            case 7:ModAl();break;
            case 8: AlanH();break;
            case 0: break;
            default:
                System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
        }
}while (select!=0);

    }
}
