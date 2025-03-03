import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;

        while (num1 != num2) {
            
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        int gcd = num1;

        int lcm = (originalNum1 * originalNum2) / gcd;

        System.out.println("GCD (EBOB) of " + originalNum1 + " and " + originalNum2 + " is: " + gcd);
        System.out.println("LCM (EKOK) of " + originalNum1 + " and " + originalNum2 + " is: " + lcm);

    }
}
