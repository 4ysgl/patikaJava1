import java.util.Scanner;

public class artıkYılHesaplama {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int yil;
        System.out.println(" yılı giriniz");
        yil= inp.nextInt();
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0))
        {
            System.out.println(yil+" "+"Artık yıldır");

        }
        else System.out.println("artık yıl degıldır");
    }
}
