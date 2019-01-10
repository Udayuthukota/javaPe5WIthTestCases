
import java.util.*;

public class NumberCounts {

    public Map<String, Integer> numberCount(String input) {
        if (input == null) {
            return null;
        } else {
            String result = input.replaceAll("[^\\w\\s]+", " ");
            String result1 = result.replaceAll("[_ ]+", " ");
            String a[] = result1.split(" ");
            Map<String, Integer> words = new HashMap<>();
            for (String str : a) {
                if (words.containsKey(str)) {
                    words.put(str, 1 + words.get(str));
                } else {
                    words.put(str, 1);
                }
            }
// System.out.println(words);
            return words;

        }
    }
}