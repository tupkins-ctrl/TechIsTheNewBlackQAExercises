package module_02_IF_statements.ConditionalOperators2;
import java.util.Scanner;

public class Conditional_Operators1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Have you finished WeDevX?");
        boolean finishedWedevx = scanner.nextBoolean();

        System.out.println("Do you have a Strong Resume?");
        boolean hasStrongResume = scanner.nextBoolean();

        boolean eligibleForSenior = finishedWedevx && hasStrongResume;

        System.out.println("Candidate is eligible for senior-level position: " + eligibleForSenior);

        scanner.close();
    }
}
