import java.util.Scanner;

public class havaOner {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
     /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/


        int hava;
        System.out.println("havanın derecesını gır");
        hava= inp.nextInt();
      if (hava<5)
      {
          System.out.println("kayak");
      }
      else if (hava<=5 && hava<15)
      {
          System.out.println("sinema");
      }
      else if (hava<=15 && hava<25)
      {
          System.out.println("piknik");
      }
      else
          System.out.println("yüzme");
    }
}
