import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 1) System.out.println(number + " is not a perfect number");
        else {
            int sumofDivisors = 1;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumofDivisors += i;
                }
            }

            if (sumofDivisors == number) {
                System.out.println(number + " is a perfect number");
            }
            else {
                System.out.println(number + " is not a perfect number");
            }

        }


    }
}
