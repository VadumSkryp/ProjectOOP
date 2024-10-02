package shapes;

public class Triangle extends Shape {
    private final double base;
    private final double height;


    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }


    public double getHypotenuse() {
        return Math.sqrt(base * base + height * height);
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    public String getInfoAboutShape() {
        return String.format("Фігура: %s, площа: %.2f кв. од., гіпотенуза: %.2f од., колір: %s",
                this.getClass().getSimpleName(), getArea(), getHypotenuse(), getColor());
    }

}
