import java.util.Scanner;
import java.util.Arrays;

public class NearestLargSmall {

    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println("Enter a number: ");

        Scanner input = new Scanner(System.in);
        int TargetNumber = input.nextInt();

        int nearestSmaller = Integer.MIN_VALUE;
        int nearestLarger = Integer.MAX_VALUE;

        for (int number : list) {
            if (number < TargetNumber && number > nearestSmaller) {
                nearestSmaller = number;
            }
            if (number > TargetNumber && number < nearestLarger) {
                nearestLarger = number;
            }
        }

        System.out.println("Array: " + Arrays.toString(list));
        System.out.println("Given Number: " + TargetNumber);
        System.out.println("Nearest Smaller Number: " + nearestSmaller);
        System.out.println("Nearest Larger Number: " + nearestLarger);


    }
}
