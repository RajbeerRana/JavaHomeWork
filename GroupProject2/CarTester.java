package GroupProject2;

public class CarTester {
    public static void main(String[] args) {

        Car car = new Sedan(40000,"Black",21.00);
        double finalPrice = car.calculateSalePrice();
        System.out.println("The final price of Sedan is " +finalPrice);

        Car car1 = new Truck(65000,"White",2300);
        double finalPrice1 = car1.calculateSalePrice();
        System.out.println("THe final price of Truck is " + finalPrice1);
    }
}
