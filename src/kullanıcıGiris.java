import java.util.Scanner;
public class kullanıcıGiris
{
    public static void main(String[] args) {
/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı
  olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı,
  lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
        Scanner inp=new Scanner(System.in);

      int sifre=123,a,num;


        System.out.println(" şifre :");
        a= inp.nextInt();
if (a==sifre)
{
    System.out.println("girilen sifre dogru");
}
else {
    System.out.println("girilen şifre yanlış .tekrar şifre girmek istiyor sanız 1 e basın");
    num= inp.nextInt();
    switch (num)
    {
        case 1:
            System.out.println("lütfen yeni şifrenizi girin");
            a= inp.nextInt();
            if (a==sifre){
                System.out.println("Şifre oluşturulamadı,\n" +
                        "  lütfen başka şifre giriniz ");


            }
            else System.out.println("şifre olusturuldu");
            break;
        case 2:
            System.out.println("Sistemden çıkıldı");
            break;
    }
}
    }
}
