package module_02_IF_statements.ScannerNextCharAt;
import java.util.Scanner;
public class Scanner_next_charAt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        System.out.println(word);
        char firstLetter = word.charAt(0);

        System.out.println("The first letter of the word is " + firstLetter);

        scanner.close();
    }
}
