package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testGetArea() {
        Circle circle = new Circle(5.0, "Red");
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.getArea(), 0.001, "Площа кола обчислюється неправильно");
    }

    @Test
    public void testGetRadius() {
        Circle circle = new Circle(3.0, "Blue");
        assertEquals(3.0, circle.getRadius(), "Радіус кола повертається неправильно");
    }


}