import java.util.Scanner;
import java.util.Stack;


class PalindromeService {

    public boolean checkPalindrome(String input) {
       
        String cleanString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanString.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

       
        for (char c : cleanString.toCharArray()) {
            stack.push(c);
        }

       
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

       
        PalindromeService service = new PalindromeService();

        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");
        System.out.print("Enter string: ");
        String userInput = scanner.nextLine();

      
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
