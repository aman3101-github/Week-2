import java.util.Scanner;
public class PalindromeChecker {
	
    // Encapsulated attribute
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Removing spaces and converting to lowercase for comparison
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        int length = cleanedText.length();

        // Checking for palindrome by comparing characters from both ends
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - i - 1)) {
                return false; // Not a palindrome
            }
        }
        return true; // It's a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Taking user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String userInput = scanner.nextLine();

        // Creating an instance of PalindromeChecker
        PalindromeChecker palindromeChecker = new PalindromeChecker(userInput);

        // Displaying the result
        palindromeChecker.displayResult();

        // Closing the scanner
        scanner.close();
    }
}
