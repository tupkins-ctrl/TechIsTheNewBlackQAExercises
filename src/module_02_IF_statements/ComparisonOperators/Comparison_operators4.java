package module_02_IF_statements.ComparisonOperators;
import java.util.Scanner;

public class Comparison_operators4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please create a pin number:");
        int pinNumber = scanner.nextInt();

        System.out.println("Please repeat the pin number:");
        int pinConfirm = scanner.nextInt();

        boolean pinsDoNotMatch = pinNumber != pinConfirm;

        System.out.println("Pin Numbers do not match: " + pinsDoNotMatch);

        scanner.close();
    }

}
