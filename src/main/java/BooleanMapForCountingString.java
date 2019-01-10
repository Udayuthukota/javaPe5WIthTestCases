import java.util.Map;
import java.util.*;

public class BooleanMapForCountingString {

    public Map<String,Boolean> numberCount(String[] inputString) {


       // String[] inp= {"a", "b", "c", "d", "a", "c", "c"};

        Map<String, Boolean> words = new HashMap<>();
        for (String str :inputString ) {
            if (words.containsKey(str)) {
                words.put(str, true);
            } else {
                words.put(str, false);
            }
        }
// System.out.println(words);
        return words;

    }


    public  static void main(String[] args)
    {

        BooleanMapForCountingString boolieanMapForCountingString=new BooleanMapForCountingString();
         Map<String, Boolean> actualValue = new HashMap<String, Boolean>();
        String[] inputArray={"a", "b", "c", "d", "a", "c", "c"};
        actualValue=boolieanMapForCountingString.numberCount(inputArray);
        System.out.println(actualValue);
    }
}
