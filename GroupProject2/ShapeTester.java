package GroupProject2;

public class ShapeTester {
    public static void main(String[] args) {

        Circle shape = new Circle(14.8);
        System.out.println("The total area of the Circle is "+shape.calculateArea());
        System.out.println("The total Parameter of the circle is " + shape.calculateParameter());


        Square shape1 = new Square(8.40);
        System.out.println("The total area of the Square is " + shape1.calculateArea());
        System.out.println("The total Parameter of the square is " + shape1.calculateParameter());
    }
}
