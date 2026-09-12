package module_02_IF_statements.ComparisonLessMoreThan;
import java.util.Scanner;

public class Comparison_Less_More_Than1_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the expected salary:");
        double expectedSalary = scanner.nextDouble();

        System.out.println("Please enter the offered salary:");
        double offeredSalary = scanner.nextDouble();

        boolean shouldNegotiate = expectedSalary > offeredSalary;

        System.out.println("Should I negotiate? " + shouldNegotiate);

        scanner.close();
    }

}
