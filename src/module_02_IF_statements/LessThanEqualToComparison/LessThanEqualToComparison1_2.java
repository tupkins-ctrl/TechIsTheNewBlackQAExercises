package module_02_IF_statements.LessThanEqualToComparison;
import java.util.Scanner;
public class LessThanEqualToComparison1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxWindApricotCanWithstand = 30;

        System.out.println("Please enter the maximum wind speed in your region:");
        double regionWindSpeed = scanner.nextDouble();

        boolean canGrowApricot = regionWindSpeed <= maxWindApricotCanWithstand;

        System.out.println("You can grow apricot: " + canGrowApricot);

        scanner.close();
    }
}
