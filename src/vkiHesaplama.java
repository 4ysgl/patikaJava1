
import java.util.Scanner;
public class vkiHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Double vki,boy,kilo;


        System.out.println("boyunuzu giirin:");
        boy = inp.nextDouble();
        System.out.println("kilonuzu giirin:");
        kilo = inp.nextDouble();
        vki=kilo/boy*boy;
        System.out.println("Vücüt kitle ındexsınız: "+ vki);

    }
}
