import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String testInput = "A man a plan a canal Panama".repeat(1000);
        String cleanInput = testInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        long startStack = System.nanoTime();
        checkWithStack(cleanInput);
        long endStack = System.nanoTime();

        long startTwoPointer = System.nanoTime();
        checkWithTwoPointer(cleanInput);
        long endTwoPointer = System.nanoTime();

        System.out.println("--- Benchmarking Results (Nanoseconds) ---");
        System.out.println("Stack Approach:       " + (endStack - startStack) + " ns");
        System.out.println("Two-Pointer Approach: " + (endTwoPointer - startTwoPointer) + " ns");
    }

    private static boolean checkWithStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    private static boolean checkWithTwoPointer(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left++) != input.charAt(right--)) return false;
        }
        return true;
    }
}