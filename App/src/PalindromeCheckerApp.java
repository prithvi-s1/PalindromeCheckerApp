import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a word");
        String input = sc.nextLine(); // Example input

        char[] charArray = input.toCharArray();

        boolean isPalindrome = checkPalindrome(charArray);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    private static boolean checkPalindrome(char[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}