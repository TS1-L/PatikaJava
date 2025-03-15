import java.util.HashSet;
import java.util.Set;

public class RepeatingEven {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10, 2, 4, 12, 14, 6};
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> repeatingEvenNumbers = new HashSet<>();

        for (int number : numbers) {

            if (number % 2 == 0) {

                if (!uniqueNumbers.add(number)) {
                    repeatingEvenNumbers.add(number);
                }
            }
        }


        System.out.println("Repeating even numbers: " + repeatingEvenNumbers);

    }
}
