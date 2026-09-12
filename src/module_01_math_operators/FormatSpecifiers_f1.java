package module_01_math_operators;

public class FormatSpecifiers_f1 {
    public static void main(String[] args) {
        double height = 2.03;
        double weight = 113.0;
        double bmi = weight / (height * height);

        System.out.printf("Lebron James' height is %.2f meters\n", height);
        System.out.printf("Lebron James' weight is %.1f kg\n", weight);
        System.out.printf("Lebron James' BMI is %.1f\n", bmi);
    }
}
