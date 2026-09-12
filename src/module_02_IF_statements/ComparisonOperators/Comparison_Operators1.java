package module_02_IF_statements.ComparisonOperators;
import java.util.Scanner;
public class Comparison_Operators1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of miles they have traveled:");
        int milesTraveled = scanner.nextInt();

        System.out.println("Please enter the number of miles they plan to travel:");
        int milesPlanned = scanner.nextInt();

        boolean hasTraveledPlanned = milesTraveled == milesPlanned;

        System.out.println("You have traveled the planned miles already: " + hasTraveledPlanned);

        scanner.close();
    }
}
