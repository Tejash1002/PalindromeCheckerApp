import java.util.*;

interface PalindromeStrategy {
    boolean isValid(String input);
}


class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);
public class  PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC13: Performance Comparison (Algorithm Benchmark) ===");
        System.out.print("Enter a long string to benchmark: ");
        String input = scanner.nextLine();

class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
 
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

class PalindromeContext {
    private PalindromeStrategy strategy;
 
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
 
        long startTime = System.nanoTime();
        boolean res1 = checkTwoPointer(clean);
        long endTime = System.nanoTime();
        long durationTwoPointer = endTime - startTime;

 
        startTime = System.nanoTime();
        boolean res2 = checkStack(clean);
        endTime = System.nanoTime();
        long durationStack = endTime - startTime;
 

        startTime = System.nanoTime();
        boolean res3 = checkReversal(clean);
        endTime = System.nanoTime();
        long durationReversal = endTime - startTime;

 
        System.out.println("\n--- Performance Results (in Nanoseconds) ---");
        System.out.printf("%-20s : %d ns\n", "Two-Pointer", durationTwoPointer);
        System.out.printf("%-20s : %d ns\n", "Stack (LIFO)", durationStack);
        System.out.printf("%-20s : %d ns\n", "String Reversal", durationReversal);

        System.out.println("\nNote: Two-Pointer is usually fastest as it avoids extra memory allocation.");

        scanner.close();
    }

 
        if (choice == 1) {
            context.setStrategy(new StackStrategy());
            System.out.println("Using: Stack Strategy");
        } else {
            context.setStrategy(new DequeStrategy());
            System.out.println("Using: Deque Strategy");
    public static boolean checkTwoPointer(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

 
    public static boolean checkStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    public static boolean checkReversal(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
