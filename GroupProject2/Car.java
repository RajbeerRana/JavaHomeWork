package GroupProject2;

public  class Car {
    // Create a Class Car that would have the following fields: carPrice and
    //color and method calculateSalePrice() which should be returning a
    //price of the car.
    //Create 2 sub classes: Sedan and Truck. The Truck class has a field
    //as weight and has its own implementation of calculateSalePrice()
    //method in which returned price is calculated as following: if
    //weight>2000 then returned price car should include 10% discount,
    //otherwise 20% discount.
    //The Sedan class has field as length and also does it is own
    //implementation of calculateSalePrice(): if length of sedan is >20 feet
    //then returned car price should include 5% discount, otherwise 10%
    //discount

    protected int carPrice;
    protected String carColor;
    public Car(int carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }
    double calculateSalePrice  (){
        return carPrice;
    }
}

class Sedan extends Car{

  private double length;
    public Sedan(int carPrice, String carColor, double length) {
        super(carPrice, carColor);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            return carPrice * 0.95;
        }else{
            return carPrice * 0.90;
        }
    }


}

class Truck extends Car {
    private int weight;

    public Truck(int carPrice, String carColor, int weight) {
        super(carPrice, carColor);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
        if(weight>2000){
            return carPrice * 0.90;
        }else{
            return carPrice  * 0.80;
        }
    }


}
