package module_02_IF_statements.ScannerNextCharAt;
import java.util.Scanner;
public class Scanner_next_charAt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("" + firstInitial + lastInitial);

        scanner.close();
    }
}
