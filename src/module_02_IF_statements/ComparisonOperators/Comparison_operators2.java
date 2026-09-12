package module_02_IF_statements.ComparisonOperators;
import java.util.Scanner;
public class Comparison_operators2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of countries they have visited:");
        int countriesVisited = scanner.nextInt();

        System.out.println("Please enter the number of countries they plan to visit:");
        int countriesPlanned = scanner.nextInt();

        boolean differentFromPlanned = countriesVisited != countriesPlanned;

        System.out.println("You either have more or fewer countries than planned: " + differentFromPlanned);

        scanner.close();
    }

}
