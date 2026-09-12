package module_01_math_operators;

public class FormatSpecifiers_d1 {
    public static void main(String[] args) {
        int wallLength = 300;
        int wallHeight = 200;

        int brickLength = 20;
        int brickHeight = 10;

        int bricks = (wallLength * wallHeight) / (brickLength * brickHeight);

        System.out.printf("The number of bricks needed to build the wall is: %d\n", bricks);
    }
}
