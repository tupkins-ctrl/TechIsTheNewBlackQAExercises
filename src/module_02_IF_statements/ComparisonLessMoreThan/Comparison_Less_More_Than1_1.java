package module_02_IF_statements.ComparisonLessMoreThan;
import java.util.Scanner;

public class Comparison_Less_More_Than1_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your current weight:");
        double currentWeight = scanner.nextDouble();

        System.out.println("Please enter your ideal weight:");
        double idealWeight = scanner.nextDouble();

        boolean currentLessThanIdeal = currentWeight < idealWeight;

        System.out.println("Your current weight is less than your ideal weight: " + currentLessThanIdeal);

        scanner.close();
    }

}
