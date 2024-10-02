package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testGetArea() {
        Triangle triangle = new Triangle(3.0, 4.0, "Red");
        double expectedArea = 0.5 * 3.0 * 4.0;
        assertEquals(expectedArea, triangle.getArea(), 0.001, "Очікуване значення площі не відповідає реальному");
    }

    @Test
    public void testGetHypotenuse() {
        Triangle triangle = new Triangle(3.0, 4.0, "Blue");
        double expectedHypotenuse = Math.sqrt(3.0 * 3.0 + 4.0 * 4.0); // 5.0
        assertEquals(expectedHypotenuse, triangle.getHypotenuse(), 0.001, "Очікуване значення гіпотенузи не відповідає реальному");
    }

    @Test
    public void testGetColor() {
        Triangle triangle = new Triangle(5.0, 6.0, "Green");
        assertEquals("Green", triangle.getColor(), "Очікуване значення кольору не відповідає реальному");
    }


}