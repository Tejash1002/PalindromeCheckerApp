import java.util.Scanner;

public class  PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (Case & Space Insensitive) ---");
        System.out.print("Enter a string: ");
        String originalInput = scanner.nextLine();

        // Step 1: Normalize the string
        // We use regex [^a-zA-Z0-9] to remove everything except alphanumeric characters
        String normalizedString = originalInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Apply Palindrome Logic (Two-Pointer Technique)
        boolean isPalindrome = checkPalindrome(normalizedString);

        // Output results
        System.out.println("\nNormalized String: " + normalizedString);
        if (isPalindrome) {
            System.out.println("Result: Success! \"" + originalInput + "\" is a palindrome.");
        } else {
            System.out.println("Result: Failed. \"" + originalInput + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Logic to check if a string reads the same forwards and backwards
     */
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}