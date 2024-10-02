package shapes;

public abstract class Shape {

    private final String color;

    public Shape(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;

    }

    public abstract double getArea();

    public abstract String getInfoAboutShape();


}
