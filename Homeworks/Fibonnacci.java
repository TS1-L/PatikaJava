import java.util.Scanner;

public class Fibonnacci {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how long the fibonacci number you want to display: ");
        int number = input.nextInt();

        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 1; i < number; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + b + " ");
        }


    }
}
