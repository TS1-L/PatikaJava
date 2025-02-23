import java.util.Scanner;

public class EvenAndFour {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 0;
        int total = 0;
        do {
            System.out.println("Enter a number: ");
            n = input.nextInt();

            if (n % 2 == 1) {
                break;
            }
            else if (n % 4 == 0) {
                total += n;
            }



        } while (n % 2 == 0);

        System.out.println("The Total is: " + total);





    }
}
