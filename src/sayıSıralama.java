import java.util.Scanner;

public class sayıSıralama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int a,b,c;
        System.out.println("1. sayı");
        a= inp.nextInt();
        System.out.println("2. sayı");
        b= inp.nextInt();
        System.out.println("3. sayı");
        c= inp.nextInt();

        if (a<b && a<c)
        {
            if (b<c)
            System.out.println("a<b<c");
            else
                System.out.println("a<c<b");
        }
        else if (b<a && b<c)
        {
            if (a<c)
                System.out.println("b<a<c");
            else
                System.out.println("b<c<a");
        }
        else if (c<a && c<b)
        {
            if (a<b)
                System.out.println("c<a<b");
            else
                System.out.println("c<b<a");
        }


    }
}
