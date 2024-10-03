import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("You entered: " + name);
        for (int i=name.length()-1; i >= 0; i=i-2) {
           System.out.println(name.charAt(i));
        }
        scanner.close();
    }
}