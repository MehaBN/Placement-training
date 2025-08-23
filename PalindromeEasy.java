import java.util.Scanner;

public class PalindromeEasy {

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            char chLeft = input.charAt(left);
            char chRight = input.charAt(right);

            // Skip non-letter or digit from the left
            if (!Character.isLetterOrDigit(chLeft)) {
                left++;
                continue;
            }

            // Skip non-letter or digit from the right
            if (!Character.isLetterOrDigit(chRight)) {
                right--;
                continue;
            }

            // Compare characters (case insensitive)
            if (Character.toLowerCase(chLeft) != Character.toLowerCase(chRight)) {
                return false; // Not a palindrome
            }

            // Move both pointers
            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
