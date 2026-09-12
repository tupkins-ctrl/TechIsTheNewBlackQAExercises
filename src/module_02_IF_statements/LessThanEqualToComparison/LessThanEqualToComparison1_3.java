package module_02_IF_statements.LessThanEqualToComparison;
import java.util.Scanner;
public class LessThanEqualToComparison1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minWindForTurbines = 11;

        System.out.println("Please enter the average wind speed in your region:");
        double regionWindSpeed = scanner.nextDouble();

        boolean shouldInstallTurbines = regionWindSpeed >= minWindForTurbines;

        System.out.println("Your region should install wind turbines: " + shouldInstallTurbines);

        scanner.close();
    }
}
