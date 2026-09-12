package module_02_IF_statements.ConditionalOperatorsPractice;
import java.util.Scanner;
public class Conditional_Operators_Practice1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many followers does the user have?");
        int followerCount = scanner.nextInt();

        System.out.println("Is Email Verified?");
        boolean isEmailVerified = scanner.nextBoolean();

        boolean eligibleForBlueIcon = followerCount >= 100000 && isEmailVerified;

        System.out.println("User is eligible for a verified blue icon: " + eligibleForBlueIcon);

        scanner.close();
    }
}
