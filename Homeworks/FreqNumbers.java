import java.util.HashMap;
import java.util.Map;

public class FreqNumbers {
  
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20, 5, 10};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            if (frequencyMap.containsKey(num)) {

                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {

                frequencyMap.put(num, 1);
            }
        }


        System.out.println("Frequency of elements:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}
