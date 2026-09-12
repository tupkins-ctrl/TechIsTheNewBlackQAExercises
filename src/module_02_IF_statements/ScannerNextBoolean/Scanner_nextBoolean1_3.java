package module_02_IF_statements.ScannerNextBoolean;
import java.util.Scanner;
public class Scanner_nextBoolean1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to play again? (true/false)");
        boolean playAgain = scanner.nextBoolean();

        System.out.println(playAgain);

        scanner.close();
    }
}
