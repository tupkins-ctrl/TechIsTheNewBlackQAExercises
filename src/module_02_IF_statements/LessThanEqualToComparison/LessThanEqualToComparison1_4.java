package module_02_IF_statements.LessThanEqualToComparison;
import java.util.Scanner;
public class LessThanEqualToComparison1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minSolarIntensity = 1200;

        System.out.println("Please enter the average solar intensity in your region:");
        double regionSolarIntensity = scanner.nextDouble();

        boolean shouldInstallSolar = regionSolarIntensity >= minSolarIntensity;

        System.out.println("Your region should install solar panels: " + shouldInstallSolar);

        scanner.close();
    }
}
