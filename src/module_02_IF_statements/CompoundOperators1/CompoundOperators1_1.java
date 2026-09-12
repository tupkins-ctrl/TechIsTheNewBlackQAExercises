package module_02_IF_statements.CompoundOperators1;
import java.util.Scanner;

public class CompoundOperators1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sale amount for transaction 1:");
        double total = scanner.nextDouble();

        System.out.println("Enter the sale amount for transaction 2:");
        total += scanner.nextDouble();

        System.out.println("Enter the sale amount for transaction 3:");
        total += scanner.nextDouble();

        System.out.println("Total is " + total);

        scanner.close();
    }
}