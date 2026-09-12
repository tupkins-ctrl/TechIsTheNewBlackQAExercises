package module_01_math_operators;

public class FormatSpecifiers_f2 {
    public static void main(String[] args) {
        double radius = 5.5;
        double pi = 3.14159265359;
        double area = pi * radius * radius;

        System.out.printf("The area of the circle is %.3f\n", area);
    }
}
