import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome test, please enter some text:");
        String text="", letters="", lettersReverse="";
        char tempLetter;
        text = scanner.nextLine();
        // Extract each letters in sequence without spaces and punctuation
        for (int i=0; i < text.length(); i++) {
            tempLetter = text.charAt(i);
            if ((tempLetter >= 'A' && tempLetter <= 'Z') || (tempLetter >= 'a' && tempLetter <= 'z')) {
                letters = letters + tempLetter;
            } else {
                continue;
            }            
        }
        
        // Extract each letters in reverse without spaces and punctuation
        for (int j=text.length()-1; j >= 0; j--) {
            tempLetter = text.charAt(j);
            if ((tempLetter >= 'A' && tempLetter <= 'Z') || (tempLetter >= 'a' && tempLetter <= 'z')) {
                lettersReverse = lettersReverse + tempLetter;
            } else {
                continue;
            }            
        }
        
        // Compare the two letter strings with ignoring the case.
        if (lettersReverse.equalsIgnoreCase(letters)) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
        scanner.close();
    }
}