package shapes;

import java.util.Random;

public class ShapeGenerator {
    private static final String[] COLORS = {"синій", "жовтий", "червоний", "зелений"};
    private static final Random RANDOM = new Random();

    public static Shape getRandomShape() {
        String color = COLORS[RANDOM.nextInt(COLORS.length)];
        ShapeType shapeType = ShapeType.values()[RANDOM.nextInt(ShapeType.values().length)];

        return switch (shapeType) {
            case SQUARE -> new Square(getRandomSquareSide(), color);
            case TRIANGLE -> new Triangle(getRandomTriangleBase(), getRandomTriangleHeight(), color);
            case CIRCLE -> new Circle(getRandomCircleRadius(), color);
            case TRAPEZOID -> new Trapezoid(getRandomTrapezoidBase1(), getRandomTrapezoidBase2(), getRandomTrapezoidHeight(), color);
        };
    }

    private static double getRandomSquareSide() {
        return 1 + (4 * RANDOM.nextDouble()); // 1 to 5
    }

    private static double getRandomTriangleBase() {
        return 1 + (9 * RANDOM.nextDouble()); // 1 to 10
    }

    private static double getRandomTriangleHeight() {
        return 1 + (9 * RANDOM.nextDouble()); // 1 to 10
    }

    private static double getRandomCircleRadius() {
        return 1 + (4 * RANDOM.nextDouble()); // 1 to 5
    }

    private static double getRandomTrapezoidBase1() {
        return 1 + (4 * RANDOM.nextDouble()); // 1 to 5
    }

    private static double getRandomTrapezoidBase2() {
        return 1 + (4 * RANDOM.nextDouble()); // 1 to 5
    }

    private static double getRandomTrapezoidHeight() {
        return 1 + (4 * RANDOM.nextDouble()); // 1 to 5
    }
}
