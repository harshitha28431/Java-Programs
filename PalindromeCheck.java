public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "madam";
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

