import java.util.Scanner;

public class HarmonicNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = input.nextInt();

        double sum = 0.0;

        while (n > 0) {

            sum += (1/n);
            n--;
        }

        System.out.println("The sum of all numbers is: " + sum);



    }
}
