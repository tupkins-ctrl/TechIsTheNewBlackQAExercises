package module_02_IF_statements.ConditionalOperators2;
import java.util.Scanner;

public class Conditional_Operators1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have life insurance?");
        boolean hasLifeCoverage = scanner.nextBoolean();

        System.out.println("Do you have auto insurance?");
        boolean hasAutoCoverage = scanner.nextBoolean();

        boolean eligibleForDiscount = hasLifeCoverage || hasAutoCoverage;

        System.out.printf("Is user eligible for a 20%% discount? %b%n", eligibleForDiscount);

        scanner.close();
    }
}
