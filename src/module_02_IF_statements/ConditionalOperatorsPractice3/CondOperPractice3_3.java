package module_02_IF_statements.ConditionalOperatorsPractice3;
import java.util.Scanner;

public class CondOperPractice3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your loyalty status:");
        String loyaltyStatus = scanner.nextLine();

        System.out.println("Please enter your purchase amount:");
        double purchaseAmount = scanner.nextDouble();

        boolean isEligibleForDiscount =
                (loyaltyStatus.equals("gold") && purchaseAmount >= 100.00)
                        || (loyaltyStatus.equals("silver") && purchaseAmount >= 50.00);

        System.out.println("You are eligible for a discount: " + isEligibleForDiscount);

        scanner.close();
    }
}
