package shapes;

public class Trapezoid extends Shape {
    private final double base1;
    private final double base2;
    private final double height;

    public Trapezoid(double base1, double base2, double height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    public String getInfoAboutShape() {
        return String.format("Фігура: %s, трапеція, площа: %.2f кв. од., колір: %s",
                this.getClass().getSimpleName(), getArea(), getColor());
    }
}
