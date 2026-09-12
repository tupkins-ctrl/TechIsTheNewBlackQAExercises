package module_02_IF_statements.ConditionalOperatorsPractice2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CondOperPractice2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double propertyForSale = 15000000.00;
        String propertyLocation = "Beverly Hills";

        System.out.println("Enter your desired location");
        String desiredLocation = scanner.nextLine();

        System.out.println("Enter your budget:");
        double budget = scanner.nextDouble();

        boolean suitableProperty = budget >= propertyForSale && desiredLocation.equals(propertyLocation);

        System.out.println("Suitable property found: " + suitableProperty);

        scanner.close();
    }
}
