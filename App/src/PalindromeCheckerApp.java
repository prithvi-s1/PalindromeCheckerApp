public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        String cleanInput = normalize(input);
        boolean result = checkPalindrome(cleanInput);

        System.out.println("Original: " + input);
        System.out.println("Normalized: " + cleanInput);
        System.out.println("Is Palindrome: " + result);
    }

    private static String normalize(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    private static boolean checkPalindrome(String str) {
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