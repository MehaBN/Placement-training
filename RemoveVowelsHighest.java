import java.util.*;

public class RemoveVowelsHighest {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange"};
        StringBuilder sb = new StringBuilder();

        for (String word : arr) {
            for (char c : word.toCharArray()) {
                if (!"aeiouAEIOU".contains(c + "")) {
                    sb.append(c);
                }
            }
        }

        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);
        String result = new StringBuilder(new String(chars)).reverse().toString();
        System.out.println("Highest word: " + result);
    }
}
