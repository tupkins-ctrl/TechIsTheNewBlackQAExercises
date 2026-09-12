package module_02_IF_statements.CompareString;
import java.util.Scanner;
public class Compare_String1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flaggedPlate = "123LA";

        System.out.println("Please enter your plate number:");
        String enteredPlate = scanner.nextLine();

        boolean willTow = enteredPlate.equals(flaggedPlate);

        System.out.println("We will have to tow your car: " + willTow);

        scanner.close();

    }
}
