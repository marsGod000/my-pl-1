import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter your name:");
         String name = scanner.nextLine();
         if (name.equals("Louis")) {
            System.out.println("Are you French?");
         } else {
            System.out.println("You have a great name!");
         }
         scanner.close();
    }
}