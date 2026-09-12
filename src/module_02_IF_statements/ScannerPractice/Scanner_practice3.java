package module_02_IF_statements.ScannerPractice;
import java.util.Scanner;
public class Scanner_practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature in Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("The temperature in Fahrenheit is " + fahrenheit + " degrees.");

        scanner.close();
    }
}
