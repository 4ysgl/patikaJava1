import java.util.Scanner;

public class sınıfGecme {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        /*
        fizik,mat,turkce,kimya müzik
         */
      int mat,fiz,tur,muz,kim,ort,gecerliDersSayisi=0;
      int toplam=0;


        System.out.println("Mat NOTU:");
        mat= inp.nextInt();
        if (mat>=0 && mat<=100  )
        {
          toplam=toplam +mat;
          gecerliDersSayisi++;
        }

        System.out.println("Muzık NOTU:");
        muz= inp.nextInt();
      if (muz>=0 && muz<=100  )
      {
        toplam=toplam +muz;
        gecerliDersSayisi++;
      }

        System.out.println("turkce NOTU:");
        tur= inp.nextInt();

      if (tur>=0 && tur<=100  )
      {
        toplam=toplam +tur;
        gecerliDersSayisi++;
      }
        System.out.println("kimya NOTU:");
        kim= inp.nextInt();
      if (kim>=0 && kim<=100  )
      {
        toplam=toplam +kim;
        gecerliDersSayisi++;
      }
        System.out.println("fizik NOTU:");
        fiz= inp.nextInt();
      if (fiz>=0 && fiz<=100  )
      {
        toplam=toplam +fiz;
        gecerliDersSayisi++;
      }
      ort=toplam/gecerliDersSayisi;
      if (ort>55)
      {
        System.out.println("sınıfı gectın .gecer not"+ort);

      }
      else
        System.out.println("kaldınız");


    }
}
