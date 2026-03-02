// UC3: Palindrome Check Using String Reverse

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String Concatenation
        }
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to palindrome checker app Management System");
    }
}
