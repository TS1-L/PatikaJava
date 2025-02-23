import java.util.Scanner;

public class FourAndFive {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int end = 0;
        int i = 1;
        int j = 1;

        do {

            System.out.println("4^"+ end + " is: " +i);
            i *= 4;
            System.out.println("5^"+ end + " is: " +j);
            j *= 5;
            end++;

        } while (end != n);








    }
}
