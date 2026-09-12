package module_02_IF_statements.CompareString;
import java.util.Scanner;
public class Compare_String1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the brand of your computer hardware:");
        String hardware = scanner.nextLine();

        boolean isCompatible = hardware.equals("Macbook");

        System.out.printf("macOs is compatible with %s: %b%n", hardware, isCompatible);

        scanner.close();
    }
}
