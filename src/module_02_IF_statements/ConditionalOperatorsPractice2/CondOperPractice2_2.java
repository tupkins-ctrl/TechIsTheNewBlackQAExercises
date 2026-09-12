package module_02_IF_statements.ConditionalOperatorsPractice2;
import java.util.Scanner;

public class CondOperPractice2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        boolean logicalExpression = (A < B && C > D) || (A > B && C < D);

        System.out.println(logicalExpression);

        scanner.close();
    }
}
