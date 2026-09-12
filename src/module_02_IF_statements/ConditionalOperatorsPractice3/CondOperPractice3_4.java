package module_02_IF_statements.ConditionalOperatorsPractice3;
import java.util.Scanner;

public class CondOperPractice3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your coupon:");
        String customerEnteredCoupon = scanner.nextLine();

        boolean isValidCoupon =
                customerEnteredCoupon.equals("10OFFNOW")
                        || customerEnteredCoupon.equals("SPRINGSALE")
                        || customerEnteredCoupon.equals("SAVEBIG2022")
                        || customerEnteredCoupon.equals("FEBRUARY25")
                        || customerEnteredCoupon.equals("SUMMERSALE21");

        System.out.println("The Coupon is valid: " + isValidCoupon);

        scanner.close();
    }
}
