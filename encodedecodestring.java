import java.util.Scanner;
import java.util.Stack;

public class encodedecodestring {

    // ---------- Core decode method ----------
    public static String decodeString(String s) {
        Stack<Integer> countStack     = new Stack<>();         // repetition counts
        Stack<StringBuilder> strStack = new Stack<>();         // previous string states
        StringBuilder curr = new StringBuilder();              // current working string
        int num = 0;                                           // current number being built

        for (char ch : s.toCharArray()) {

            // 1) Build multi‑digit numbers (e.g., "12[ab]")
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // 2) Opening bracket: push state, reset builders
            else if (ch == '[') {
                countStack.push(num);          // store repetition count
                num = 0;                       // reset for next number
                strStack.push(curr);           // store current string context
                curr = new StringBuilder();    // start fresh for inner substring
            }

            // 3) Closing bracket: pop, repeat, append
            else if (ch == ']') {
                int repeat = countStack.pop();     // how many times to repeat
                StringBuilder temp = curr;         // decoded inner substring
                curr = strStack.pop();             // previous context
                while (repeat-- > 0) {
                    curr.append(temp);             // append repeated substring
                }
            }

            // 4) Regular characters: keep building current string
            else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }

    // ---------- Main / driver ----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter encoded string: ");
        String encoded = sc.nextLine();
        String decoded = decodeString(encoded);
        System.out.println("Decoded output: " + decoded);
    }
}
