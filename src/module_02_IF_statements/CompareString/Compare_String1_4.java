package module_02_IF_statements.CompareString;
import java.util.Scanner;
public class Compare_String1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctAnswer = "String is a non-primitive data type where the value is a sequence of characters";

        System.out.println("What is a String?");
        String answer = scanner.nextLine();

        boolean isCorrect = answer.equals(correctAnswer);

        System.out.println(answer);
        System.out.println("Correct Answer? " + isCorrect);

        scanner.close();
    }
}
