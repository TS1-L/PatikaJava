import java.util.Scanner;

public class PowerRec {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent value: ");
        int exponent = input.nextInt();

        int result = power(base, exponent);

        System.out.println("Result: " + result);

        input.close();
    }

    public static int power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

}
