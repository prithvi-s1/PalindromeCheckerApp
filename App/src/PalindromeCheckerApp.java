import java.util.*;

interface PalindromeStrategy {
    boolean isValid(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        return input.equals(reversed.toString());
    }
}

class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) deque.addLast(c);

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

    public boolean validate(String input) {
        if (strategy == null) throw new IllegalStateException("Strategy not set");
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return strategy.isValid(clean);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeContext context = new PalindromeContext();
        String test = "Was it a car or a cat I saw";

        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " + context.validate(test));

        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy: " + context.validate(test));
    }
}