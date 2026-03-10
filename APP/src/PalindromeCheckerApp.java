import java.util.Scanner;
import java.util.Stack;

/**
 * PalindromeService encapsulates the validation logic.
 * This demonstrates Encapsulation and Single Responsibility.
 */
class PalindromeService {

    /**
     * UC11 Method: Uses a Stack data structure to validate the palindrome.
     * Logic: Push all chars to stack, then pop and compare with original string.
     */
    public boolean checkPalindrome(String input) {
        // Normalization (from UC10)
        String cleanString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanString.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : cleanString.toCharArray()) {
            stack.push(c);
        }

        // Pop and compare (Stack is LIFO, so it reverses the order)
        for (char c : cleanString.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate the Service Object
        PalindromeService service = new PalindromeService();

        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");
        System.out.print("Enter string: ");
        String userInput = scanner.nextLine();

        // Call the encapsulated method
        boolean result = service.checkPalindrome(userInput);

        System.out.println("\n--- Result ---");
        if (result) {
            System.out.println("Success! \"" + userInput + "\" is a palindrome.");
        } else {
            System.out.println("Failed. \"" + userInput + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}