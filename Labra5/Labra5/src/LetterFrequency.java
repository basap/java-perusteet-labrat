import java.util.HashMap;
import java.util.Map;

public class LetterFrequency {
    public static Map<Character, Integer> frequencies(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        if (s == null) return freq;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);

                if (freq.containsKey(lower)) {
                    freq.put(lower, freq.get(lower) + 1);
                } else {
                    freq.put(lower, 1);
                }
            }
        }
        return freq;
    }
}
