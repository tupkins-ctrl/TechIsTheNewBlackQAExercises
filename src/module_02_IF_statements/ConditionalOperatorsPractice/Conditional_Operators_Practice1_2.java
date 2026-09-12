package module_02_IF_statements.ConditionalOperatorsPractice;
import java.util.Scanner;

public class Conditional_Operators_Practice1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        boolean logicalExpression = (A != B || C != D) && (A == C || B == D);

        System.out.println(logicalExpression);

        sc.close();
    }
}
