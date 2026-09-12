package module_02_IF_statements.ScannerNextBoolean;
import java.util.Scanner;
public class Scanner_nextBoolean1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you married?");
        boolean isMarried = scanner.nextBoolean();

        System.out.println(isMarried);

        scanner.close();
    }
}
