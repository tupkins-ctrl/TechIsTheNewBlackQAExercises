package module_02_IF_statements.ScannerNextBoolean;
import java.util.Scanner;
public class Scanner_nextBoolean1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is Burj Khalifa the tallest building in the world?");
        boolean answer = scanner.nextBoolean();

        System.out.println(answer);
    }
}
