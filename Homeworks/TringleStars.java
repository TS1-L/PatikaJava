import java.util.Scanner;

public class TringleStars {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int number = input.nextInt();

        for (int i = number; i >= 1; i--) {

            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
