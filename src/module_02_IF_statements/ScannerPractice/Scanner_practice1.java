package module_02_IF_statements.ScannerPractice;
import java.util.Scanner;
public class Scanner_practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your job title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.printf("Dear %s,%n", fullName);
        System.out.printf("Welcome to Google!%n");
        System.out.printf("We are delighted to have you as a %s. Your starting salary is $%.2f%n", jobTitle, salary);
        System.out.printf("%n");
        System.out.printf("Sincerely,%n");
        System.out.printf("Google HR Representative%n");

        scanner.close();
    }
}
