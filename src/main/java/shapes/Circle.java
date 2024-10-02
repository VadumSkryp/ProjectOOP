package shapes;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


    public String getInfoAboutShape() {
        return String.format("Фігура: %s, площа: %.2f кв. од., радіус: %.2f од., колір: %s",
                this.getClass().getSimpleName(), getArea(), getRadius(), getColor());
    }
}
