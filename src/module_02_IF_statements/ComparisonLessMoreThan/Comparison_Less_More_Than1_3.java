package module_02_IF_statements.ComparisonLessMoreThan;
import java.util.Scanner;

public class Comparison_Less_More_Than1_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your annual income:");
        double annualIncome = scanner.nextDouble();

        System.out.println("Please enter your credit score:");
        int creditScore = scanner.nextInt();

        boolean meetsIncome = annualIncome >= 50000.00;
        boolean meetsCreditScore = creditScore >= 700;

        System.out.printf("You meet the minimum income requirements: %b%n", meetsIncome);
        System.out.printf("You meet the minimum credit score requirements: %b%n", meetsCreditScore);

        scanner.close();
    }

}
