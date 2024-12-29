import java.util.Scanner;

public class tekVeKattoplamları {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
 ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
 ekrana basan programı yazıyoruz.
 */

        int sayi, i, top=0;


        do {
            System.out.println("sayı gırın: ");
            sayi = inp.nextInt();
            if ( sayi%4==0)
            {
                top+=sayi;
            }

        }
        while (sayi%2==0);

        System.out.println("4 un katları toplamuı:" +top);
    }
}
