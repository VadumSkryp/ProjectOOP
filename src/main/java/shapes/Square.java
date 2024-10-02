package shapes;

public class Square extends Shape {

    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }


    public double getSide() {
        return side;
    }


    @Override
    public double getArea() {
        return side * side;
    }


    public String getInfoAboutShape() {
        return String.format("Фігура: %s, площа: %.2f кв. од., довжина сторони: %.2f од., колір: %s",
                this.getClass().getSimpleName(), getArea(), getSide(), getColor());
    }


}
