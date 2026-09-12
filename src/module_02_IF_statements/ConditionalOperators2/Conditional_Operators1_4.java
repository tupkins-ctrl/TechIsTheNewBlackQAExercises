package module_02_IF_statements.ConditionalOperators2;
import java.util.Scanner;

public class Conditional_Operators1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        boolean d = scanner.nextBoolean();

        boolean expression1 = (a && b) || !(c || d);
        boolean expression2 = (a && b) || ((c || d) && !(a || b));

        System.out.println("A - " + a);
        System.out.println("B - " + b);
        System.out.println("C - " + c);
        System.out.println("D - " + d);
        System.out.println("Expression 1 - " + expression1);
        System.out.println("Expression 2 - " + expression2);

        scanner.close();
    }
}
