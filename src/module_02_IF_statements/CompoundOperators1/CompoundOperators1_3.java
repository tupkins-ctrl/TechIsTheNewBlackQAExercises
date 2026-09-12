package module_02_IF_statements.CompoundOperators1;
import java.util.Scanner;
public class CompoundOperators1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance traveled (miles): ");
        double distance = scanner.nextDouble();
        System.out.println(distance);

        System.out.print("Enter the time taken (hours): ");
        double time = scanner.nextDouble();
        System.out.println(time);

        double speed = distance / time;

        System.out.println("The speed of the car is " + speed + " mph.");

        scanner.close();
    }
}