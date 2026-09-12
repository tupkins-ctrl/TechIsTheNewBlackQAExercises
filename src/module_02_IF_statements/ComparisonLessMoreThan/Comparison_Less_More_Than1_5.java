package module_02_IF_statements.ComparisonLessMoreThan;
import java.util.Scanner;

public class Comparison_Less_More_Than1_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your current heart rate:");
        int currentHeartRate = scanner.nextInt();

        System.out.println("Please enter the average heart rate for their age group:");
        int averageHeartRate = scanner.nextInt();

        boolean lowerThanAverage = currentHeartRate < averageHeartRate;

        System.out.println("Your heart rate is lower than the average heart rate for your age group: " + lowerThanAverage);

        scanner.close();
    }

}
