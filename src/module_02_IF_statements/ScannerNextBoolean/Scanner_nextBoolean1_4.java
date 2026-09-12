package module_02_IF_statements.ScannerNextBoolean;
import java.util.Scanner;
public class Scanner_nextBoolean1_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input \"true\" or \"false\" to indicate if you are ready to continue:");
        boolean isReady = scanner.nextBoolean();

        System.out.println(isReady);
        System.out.println("Welcome to the next part of the program!");

        scanner.close();
    }
}
