import java.util.Scanner;

public class hackerra {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.println("n sayısı gir");
    n= inp.nextInt();

    if (n>=2 && n<=5)
    {
        System.out.println("not weird");
    } else if (n>5 && n<21) {
        System.out.println("weird");
    }
    else
        System.out.println("not weird");
    }
}
