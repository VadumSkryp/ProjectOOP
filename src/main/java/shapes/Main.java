package shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Random random = new Random();

        int randomNumberOfShapes = random.nextInt(5) + 1;

        for (int i = 0; i < randomNumberOfShapes; i++) {
            shapes.add(ShapeGenerator.getRandomShape());
        }

        shapes.forEach(shape -> System.out.println(shape.getInfoAboutShape()));


    }
}
