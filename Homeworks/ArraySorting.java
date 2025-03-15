import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array (n): ");
        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Element: ");
            array[i] = input.nextInt();
        }

        Sorting(array);

        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void Sorting(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
