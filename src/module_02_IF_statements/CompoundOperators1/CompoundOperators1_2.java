package module_02_IF_statements.CompoundOperators1;
import java.util.Scanner;

public class CompoundOperators1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 118000.00;

        System.out.println("Please enter the first transaction amount:");
        balance -= scanner.nextDouble();

        System.out.println("Please enter the second transaction amount:");
        balance -= scanner.nextDouble();

        System.out.println("Please enter the third transaction amount:");
        balance -= scanner.nextDouble();

        System.out.println("Your Remaining Balance: $" + balance);

        scanner.close();
    }
}