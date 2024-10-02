package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrapezoidTest {

    @Test
    public void testGetArea() {
        Trapezoid trapezoid = new Trapezoid(3.0, 4.0, 5.0, "Red");
        double expectedArea = 0.5 * (3.0 + 4.0) * 5.0;
        assertEquals(expectedArea, trapezoid.getArea(), 0.001, "Очікуване значення площі не відповідає реальному");
    }

    @Test
    public void testGetBase1() {
        Trapezoid trapezoid = new Trapezoid(6.0, 4.0, 5.0, "Blue");
        assertEquals(6.0, trapezoid.getBase1(), "Очікуване значення першої основи не відповідає реальному");
    }

    @Test
    public void testGetBase2() {
        Trapezoid trapezoid = new Trapezoid(6.0, 4.0, 5.0, "Blue");
        assertEquals(4.0, trapezoid.getBase2(), "Очікуване значення другої основи не відповідає реальному");
    }

    @Test
    public void testGetHeight() {
        Trapezoid trapezoid = new Trapezoid(6.0, 4.0, 5.0, "Blue");
        assertEquals(5.0, trapezoid.getHeight(), "Очікуване значення висоти не відповідає реальному");
    }

    @Test
    public void testGetColor() {
        Trapezoid trapezoid = new Trapezoid(6.0, 4.0, 5.0, "Green");
        assertEquals("Green", trapezoid.getColor(), "Очікуване значення кольору не відповідає реальному");
    }


}