package GroupProject2;

public class Square implements Shape {
    private double size;

    Square(double size) {
        this.size = size;

    }

    @Override
    public double calculateArea() {
        return size * size;
    }

    @Override
    public double calculateParameter() {
        return 4 * size;
    }
}

