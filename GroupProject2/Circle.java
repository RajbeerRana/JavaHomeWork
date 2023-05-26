package GroupProject2;

public class Circle implements Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateParameter() {
        return 2 * Math.PI * radius;
    }
}
