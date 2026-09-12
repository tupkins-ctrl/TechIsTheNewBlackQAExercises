package module_02_IF_statements.ScannerNextCharAt;
import java.util.Scanner;
public class Scanner_next_charAt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your gender:");
        String gender = scanner.nextLine();

        char genderInitial = gender.charAt(0);

        System.out.println("Your gender is " + genderInitial);

        scanner.close();
    }
}
