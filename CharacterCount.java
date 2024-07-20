package anudippractice;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static Map<Character, Integer> countCharacters(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }

    public static void main(String[] args) {
        String inputString = "hello";
        Map<Character, Integer> result = countCharacters(inputString);
        System.out.println(result);
    }
}