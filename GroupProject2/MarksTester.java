package GroupProject2;

public class MarksTester {
    public static void main(String[] args) {
        Marks marks = new A(78.00,85.00,88.00);
        double result = marks.avgPercentage();
        System.out.println("The total average of student A is " + result);

        Marks marks1 = new B(78.00,85.00,88.00,55.00);
        double result1 = marks1.avgPercentage();
        System.out.println("The total average of student B is " + result1);



    }
}
