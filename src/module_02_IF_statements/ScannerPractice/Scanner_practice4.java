package module_02_IF_statements.ScannerPractice;
import java.util.Scanner;
public class Scanner_practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Question 1: What is the capital of France?");
        System.out.println("A. Paris");
        System.out.println("B. London");
        System.out.println("C. Rome");
        System.out.println("Enter your answer:");
        char answer1 = scanner.next().charAt(0);

        System.out.println();

        System.out.println("Question 2: What is the square root of 16?");
        System.out.println("A. 2");
        System.out.println("B. 4");
        System.out.println("C. 8");
        System.out.println("Enter your answer:");
        char answer2 = scanner.next().charAt(0);

        System.out.println();

        System.out.println("Question 3: What is the correct syntax to output \"Hello World\" in Java?");
        System.out.println("A. print(\"Hello World\");");
        System.out.println("B. Console.WriteLine(\"Hello World\");");
        System.out.println("C. System.out.println(\"Hello World\");");
        System.out.println("Enter your answer:");
        char answer3 = scanner.next().charAt(0);

        scanner.close();
    }
}
