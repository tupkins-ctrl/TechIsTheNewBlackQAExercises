package module_01_math_operators;

public class FormatSpecifiers_c1 {
    public static void main(String[] args) {
        char upShiftSign = '+';
        char downShiftSign = '-';

        String upShiftDescription = "paddle, the gearbox will shift up to the next higher gear";
        String downShiftDescription = "paddle will result in a downshift to a lower gear";

        System.out.printf("%c %s\n", upShiftSign, upShiftDescription);
        System.out.printf("%c %s\n", downShiftSign, downShiftDescription);
    }
}
