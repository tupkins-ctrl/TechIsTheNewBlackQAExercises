package module_02_IF_statements.ScannerPractice;
import java.util.Scanner;
public class Scanner_practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;

        System.out.println("The result is " + result);

        scanner.close();
    }
}
