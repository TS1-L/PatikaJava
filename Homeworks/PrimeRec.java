import java.util.Scanner;

public class PrimeRec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }

    public static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return (number == 2); // 2 is prime, numbers less than 2 are not
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }

        return isPrime(number, divisor + 1);
    }

}
