public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "deified";

        boolean result = isPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + result);
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return isPalindrome(str.substring(1, str.length() - 1));
    }
}