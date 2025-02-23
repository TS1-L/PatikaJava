import java.util.Scanner;

public class CombinationCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get values of n and r from the user
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        System.out.print("Enter the value of r: ");
        int r = input.nextInt();

        if (r > n || r < 0) {
            System.out.println("Invalid input! r cannot be greater than n or negative.");
        } else {

            int nFactorial = 1;
            for (int i = 2; i <= n; i++) {
                nFactorial *= i;
            }

            int rFactorial = 1;
            for (int i = 2; i <= r; i++) {
                rFactorial *= i;
            }

            int nMinusRFactorial = 1;
            for (int i = 2; i <= (n - r); i++) {
                nMinusRFactorial *= i;
            }
            
            int combination = nFactorial / (rFactorial * nMinusRFactorial);

            System.out.println("C(" + n + ", " + r + ") = " + combination);
        }


    }
}
