import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = input.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        if(n <= 0) {
            System.out.println("Invalid number");
            return;
        }


        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". number = ");
            int number = input.nextInt();
            if (number > max) {
                max = number;
            }
            else if (number < min) {
                min = number;
            }

        }

        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);



    }
}
