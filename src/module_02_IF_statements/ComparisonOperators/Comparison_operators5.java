package module_02_IF_statements.ComparisonOperators;
import java.util.Scanner;

public class Comparison_operators5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please generate OTP number to log in:");
        int otpNumber = scanner.nextInt();

        System.out.println("Please repeat the OTP number:");
        int otpConfirm = scanner.nextInt();

        boolean otpMatched = otpNumber == otpConfirm;

        System.out.println("OTP matched: " + otpMatched);

        scanner.close();
    }

}
