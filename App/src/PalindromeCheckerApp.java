class PalindromeService {

    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        String clean = normalize(input);
        return validate(clean);
    }

    private String normalize(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    private boolean validate(String str) {
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

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        String testString = "No 'x' in Nixon";
        boolean isPalindrome = service.checkPalindrome(testString);

        System.out.println("Input: " + testString);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}