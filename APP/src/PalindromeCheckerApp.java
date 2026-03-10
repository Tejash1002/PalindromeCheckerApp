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

        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        for (char c : clean.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String text) {
        if (strategy == null) throw new IllegalStateException("Strategy not set!");
        return strategy.isValid(text);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.println("=== UC12: Strategy Pattern Palindrome Checker ===");
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.println("Choose Algorithm: 1 for Stack, 2 for Deque");
        int choice = scanner.nextInt();

 
        if (choice == 1) {
            context.setStrategy(new StackStrategy());
            System.out.println("Using: Stack Strategy");
        } else {
            context.setStrategy(new DequeStrategy());
            System.out.println("Using: Deque Strategy");
        }

        if (context.check(text)) {
            System.out.println("Result: Success! It is a palindrome.");
        } else {
            System.out.println("Result: Failed. Not a palindrome.");
        }

        scanner.close();
    }
}
