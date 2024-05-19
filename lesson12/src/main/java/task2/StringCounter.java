package task2;

import java.util.HashMap;
import java.util.Map;

public class StringCounter {
    public Map<String, Boolean> countStringInArray(String[] arr) {
        Map<String,Boolean> stringCounter = new HashMap<>();

        for (String string: arr) {
            if (!stringCounter.containsKey(string)) {
                stringCounter.put(string, false);
            } else {
                stringCounter.put(string, true);
            }
        }
        return stringCounter;
    }
}
