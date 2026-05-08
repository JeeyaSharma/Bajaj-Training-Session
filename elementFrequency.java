import java.util.HashMap;
import java.util.Map;

public class elementFrequency {
     public void printFrequencies(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : a) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> k : map.entrySet()) {
            System.out.println("Element: " + k.getKey() + " Frequency: " + k.getValue());
        }
    }
}
