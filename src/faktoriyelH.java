import java.util.Scanner;
public class faktoriyelH {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = inp.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + " sayısının faktöriyeli: " + factorial);
    }
}
