public class Permutations {

    public static void permute(String str, String answer) {
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            permute(left + right, answer + ch);
        }
    }

    public static void main(String[] args) {
        System.out.println("Permutations of 'abc':");
        permute("abc", "");
    }
}
