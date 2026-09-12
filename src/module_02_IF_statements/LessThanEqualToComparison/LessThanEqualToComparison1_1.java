package module_02_IF_statements.LessThanEqualToComparison;
import java.util.Scanner;
public class LessThanEqualToComparison1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minimumRainfall = 40;

        System.out.println("Please enter the average rainfall in your region:");
        double averageRainfall = scanner.nextDouble();

        boolean meetsRequirement = averageRainfall >= minimumRainfall;

        System.out.println("Does it meet the minimum requirement? " + meetsRequirement);

        scanner.close();
    }
}
