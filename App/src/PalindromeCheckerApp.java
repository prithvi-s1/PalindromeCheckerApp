import java.util.Stack;
import java.util.Scanner;


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Use Case 5: Stack Based Palindrome Checker ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase for accurate checking
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // 1. Push characters into stack
        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }

        // 2. Pop and compare
        StringBuilder reversedInput = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedInput.append(stack.pop());
        }

        // 3. Print result
        System.out.println("Original (cleaned): " + cleanedInput);
        System.out.println("Reversed: " + reversedInput.toString());

        if (cleanedInput.equals(reversedInput.toString())) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}