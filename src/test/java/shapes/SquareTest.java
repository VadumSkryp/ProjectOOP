package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void testGetArea() {
        Square square = new Square(4.0, "Red");
        double expectedArea = 4.0 * 4.0;
        assertEquals(expectedArea, square.getArea(), 0.001, "Площа квадрата обчислюється неправильно");
    }

    @Test
    public void testGetSide() {
        Square square = new Square(3.0, "Blue");
        assertEquals(3.0, square.getSide(), "Довжина сторони квадрата повертається неправильно");
    }

    @Test
    public void testGetColor() {
        Square square = new Square(5.0, "Green");
        assertEquals("Green", square.getColor(), "Колір квадрата повертається неправильно");
    }


}