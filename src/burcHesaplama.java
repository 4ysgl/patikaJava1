import java.util.Scanner;

public class burcHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

       /*

Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz*/

        int gun,ay;

        System.out.println("ay giriniz:");
        ay= inp.nextInt();
        System.out.println("gün giriniz:");
        gun= inp.nextInt();
        if (ay==1)
        {
            if (gun>=1 && gun<=31)
            {
               if (gun<22)
               {
                   System.out.println(  "oglak burcu");
               }
               else
                   System.out.println(  "kova burcu");
            }
        } else if (ay==2)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<20)
                {
                    System.out.println(  "kova burcu");
                }
                else
                    System.out.println(  "balık burcu");
            }
        } else if (ay==3)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<21)
                {
                    System.out.println(  "balık burcu");
                }
                else
                    System.out.println(  "koç burcu");
            }
        } else if (ay==4)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<22)
                {
                    System.out.println(  "koc burcu");
                }
                else
                    System.out.println(  "boga burcu");
            }
        }
        else if (ay==5)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<22)
                {
                    System.out.println(  "boga burcu");
                }
                else
                    System.out.println(  "ikizler burcu");
            }
        }
        else if (ay==6)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<22)
                {
                    System.out.println(  "ikizler burcu");
                }
                else
                    System.out.println(  "yengec burcu");
            }
        }
        else if (ay==7)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<22)
                {
                    System.out.println(  "yengec burcu");
                }
                else
                    System.out.println(  "aslan burcu");
            }
        }
        else if (ay==8)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<22)
                {
                    System.out.println(  "aslan burcu");
                }
                else
                    System.out.println(  "basak burcu");
            }
        }
        else if (ay==9)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<22)
                {
                    System.out.println(  "basak burcu");
                }
                else
                    System.out.println(  "terazı burcu");
            }
        }
        else if (ay==10)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<22)
                {
                    System.out.println(  "terazı burcu");
                }
                else
                    System.out.println(  "akrep burcu");
            }
        }
        else if (ay==11)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<22)
                {
                    System.out.println(  "akrep burcu");
                }
                else
                    System.out.println(  "yay burcu");
            }
        }
        else if (ay==12)
        {
            if (gun>=1 && gun<=31)
            {
                if (gun<22)
                {
                    System.out.println(  "yay burcu");
                }
                else
                    System.out.println(  "oglak burcu");
            }
        }

    }
}
