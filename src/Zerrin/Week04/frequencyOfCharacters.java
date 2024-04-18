package Zerrin.Week04;

import java.util.HashMap;

public class frequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (char key : frequency.keySet()) {
            result.append(key).append(frequency.get(key));
        }

        System.out.println("Frequency of Characters: " + result);
    }
}

