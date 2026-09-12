package module_02_IF_statements.ConditionalOperators3;
import java.util.Scanner;
public class Conditional_Operators1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Does your room have a balcony view?");
        boolean hasBalconyView = scanner.nextBoolean();

        System.out.println("Does your room have a king sized bed?");
        boolean hasKingBed = scanner.nextBoolean();

        boolean eligibleForUpgrade = hasBalconyView || hasKingBed;

        System.out.println("You are eligible for a premium upgrade: " + eligibleForUpgrade);

        scanner.close();
    }
}
