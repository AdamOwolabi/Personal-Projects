import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {

        System.out.println("Palindrome Checker:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        if (formatPal(input))
        {
            System.out.printf("\"%s\" is a palindrome", input);
        } else
        {
            System.out.printf("\"%s\" is not a palindrome!", input);
        }
    }

    private static boolean formatPal(String input) {
        String trimmed = input.toLowerCase().replaceAll("[^a-z]", "");
        return checkPal(trimmed);
    }

    private static boolean checkPal(String input) {

        if (input.length() <= 1) {
            return true;
        } else if (input.charAt(0) != input.charAt(input.length() -1)) {
            return false;
        } else {
            String subString = input.substring(1, input.length() - 1);
            return checkPal(subString);
        }
    }
}