package module_02_IF_statements.ConditionalOperatorsPractice3;
import java.util.Scanner;
public class CondOperPractice3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which country are you traveling to?");
        String destinationCountry = scanner.nextLine();

        boolean isVisaRequired =
                destinationCountry.equals("China")
                || destinationCountry.equals("India")
                || destinationCountry.equals("Russia")
                || destinationCountry.equals("Brazil")
                || destinationCountry.equals("Vietnam");

        System.out.printf("A visa is required for both tourist and business purposes in %s: %b%n",
                destinationCountry, isVisaRequired);

        scanner.close();
    }
}
