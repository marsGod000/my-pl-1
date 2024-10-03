import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String password = scanner.nextLine();
        boolean upper=false, lower=false, digit=false;
        while (true) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                        upper = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                        lower = true;
                } else if (Character.isDigit(password.charAt(i))) {
                        digit = true;
                } 
            }

            if ((password.length() >= 8) && (upper == true) && (lower == true) && (digit == true)) {
                System.out.println("Password is valid");
                break;
            } else {
                System.out.println("Password is invalid. Needs to be at least 8 characters long. And includes at least one uppercase letter, at least one lowercase letter and at least one digit.");
                System.out.println("Please enter a new password: ");
                password = scanner.nextLine();
            }          
        }
        scanner.close();
    }
}