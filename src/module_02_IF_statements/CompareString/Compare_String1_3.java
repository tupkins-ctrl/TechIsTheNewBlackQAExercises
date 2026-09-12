package module_02_IF_statements.CompareString;
import java.util.Scanner;
public class Compare_String1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stay Calm and");
        String answer = scanner.nextLine();

        boolean correct = answer.equals("Carry On");

        System.out.println("Stay Calm " + answer);
        System.out.println("Correct answer: " + correct);

        scanner.close();

    }
}
