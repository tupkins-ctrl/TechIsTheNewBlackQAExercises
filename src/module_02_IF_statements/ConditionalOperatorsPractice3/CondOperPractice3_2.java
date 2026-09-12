package module_02_IF_statements.ConditionalOperatorsPractice3;
import java.util.Scanner;

public class CondOperPractice3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your major?");
        String major = scanner.nextLine();

        System.out.println("What is your GPA?");
        double gpa = scanner.nextDouble();

        boolean eligibleForHonors =
                (major.equals("computer science") && gpa >= 3.0)
                        || (major.equals("engineering") && gpa >= 3.5);

        System.out.println("You are eligible for the honors program: " + eligibleForHonors);

        scanner.close();
    }
}
