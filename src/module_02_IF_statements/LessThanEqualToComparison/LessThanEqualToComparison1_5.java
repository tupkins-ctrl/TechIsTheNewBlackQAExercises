package module_02_IF_statements.LessThanEqualToComparison;
import java.util.Scanner;
public class LessThanEqualToComparison1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxCharacters = 280;

        System.out.println("Please enter the number of words you want to tweet:");
        int characterCount = scanner.nextInt();

        boolean tweeted = characterCount <= maxCharacters;

        System.out.println("Tweeted: " + tweeted);

        scanner.close();
    }
}
