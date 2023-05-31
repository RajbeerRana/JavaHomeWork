package HomeWorkClass25;

public abstract class Insurance {

     String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract  void getQuote();

    abstract void cancelInsurance();

}

class Car extends Insurance{
     String carModel;

    public Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Hi Quote for your " + carModel + " will include 10% discount after purchase");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Hi your insurance "+insuranceName+" has been revoked for now but you have to make payments asap" );
    }
}
class Pet extends Insurance {
     String petType;

    public Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }


    @Override
    void getQuote() {
        System.out.println("As per the guidelines " + petType +" quotes are released every quarter");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Because of due payments on your "+insuranceName+" insurance has been cancelled from last week ");
    }
}

class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("It's not possible for us to release the quotes");
    }

    @Override
    void cancelInsurance() {
        System.out.println("You need to pay at least 4 installments to renew you" + insuranceName + "insurance");
    }
}