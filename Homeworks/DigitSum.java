import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
      
        int total = 0;
      
        while (num != 0) {
            total += num % 10;
            num /= 10;
        }
      
        System.out.println("The total of each digit is: " + total);



    }
}
