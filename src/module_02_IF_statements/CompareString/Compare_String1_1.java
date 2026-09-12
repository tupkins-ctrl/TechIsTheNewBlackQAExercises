package module_02_IF_statements.CompareString;
import java.util.Scanner;
public class Compare_String1_1 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        String validWalletId = "0x742d35Cc6634C0532925a3b844Bc454e4438f44e";

        System.out.println("Please enter the crypto wallet ID of a receiver:");
        String enteredWalletId = scanner.nextLine();

        boolean transactionApproved = enteredWalletId.equals(validWalletId);

        System.out.println("Transaction Approved: " + transactionApproved);

        scanner.close();
    }

}
