package module_02_IF_statements.ComparisonLessMoreThan;
import java.util.Scanner;

public class Comparison_Less_More_Than1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your current height:");
        double currentHeight = scanner.nextDouble();

        System.out.println("Please enter the average height of their age group:");
        double averageHeight = scanner.nextDouble();

        boolean tallerThanAverage = currentHeight > averageHeight;

        System.out.println("You are taller than the average height of their age group: " + tallerThanAverage);

        scanner.close();
    }

}
