package shapes;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;


public class ShapeGeneratorTest {

    @RepeatedTest(20)
    public void testRandomShapeIsNotNull() {
        Shape shape = ShapeGenerator.getRandomShape();
        assertNotNull(shape, "Фігура не повинна бути нульовою");
    }

    @RepeatedTest(20)
    public void testRandomShapeHasValidColor() {
        Shape shape = ShapeGenerator.getRandomShape();
        String[] expectedColors = {"синій", "жовтий", "червоний", "зелений"};
        assertTrue(java.util.Arrays.asList(expectedColors).contains(shape.getColor()),
                "Колір фігури повинен бути одним з очікуваних кольорів");
    }

    @RepeatedTest(20)
    public void testRandomShapeIsCorrectType() {
        Shape shape = ShapeGenerator.getRandomShape();
        assertTrue(shape instanceof Square || shape instanceof Triangle ||
                        shape instanceof Circle || shape instanceof Trapezoid,
                "Фігура повинна бути однією з: Квадрат, Трикутник, Коло або Трапеція");
    }


}


