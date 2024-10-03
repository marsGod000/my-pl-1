import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name="", nameSet="";
        while (true) {
            System.out.println("Enter a name: ");
            name = scanner.nextLine();
            if (name.equals("Quit")) {
                break;
            } else {
                nameSet = nameSet.concat(name);
                System.out.println(nameSet);
            }
        }
        scanner.close();
    }
}