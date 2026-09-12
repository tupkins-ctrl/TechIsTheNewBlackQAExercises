package module_02_IF_statements.ComparisonOperators;
import java.util.Scanner;

public class Comparison_operators3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of visa applications they have submitted:");
        int applicationsSubmitted = scanner.nextInt();

        System.out.println("Please enter the number of visa applications they have approved:");
        int applicationsApproved = scanner.nextInt();

        boolean perfectApprovalRate = applicationsSubmitted == applicationsApproved;

        System.out.printf("You have a 100%% approval rate: %b%n", perfectApprovalRate);

        scanner.close();
    }

}
