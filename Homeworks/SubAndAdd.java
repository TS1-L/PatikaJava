import java.util.Scanner;

public class SubAndAdd {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        subtractAndAdd(n, n, true);

        input.close();
    }

    public static void subtractAndAdd(int n, int original, boolean isSubtracting) {
        System.out.print(n + " ");

        if (n <= 0 && isSubtracting) {
            subtractAndAdd(n + 5, original, false); 
        }
        else if (n < original && !isSubtracting) {
            subtractAndAdd(n + 5, original, false); 
        }
        else if (n > 0 && isSubtracting) {
            subtractAndAdd(n - 5, original, true); 
        }
        else if (n == original && !isSubtracting) {
            return; 
        }
    }

}
