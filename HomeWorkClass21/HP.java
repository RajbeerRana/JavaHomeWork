package HomeWorkClass21;

public class HP extends Computer{
    public HP(String name, int price, String edition, double RAM) {
        super(name, price, edition, RAM);
    }

    @Override
    void start(){
        System.out.println("Starting Computer when plugged in");
    }
    @Override
    void speed(){
        System.out.println("We can check the speed of Lenovo by 5 different ways");
    }
    @Override
    void close(){
        System.out.println("going to close it by pressing only ALT+f4 together");

    }

    void security(){
        System.out.println("HP computer keeps showing security updates from last 2 days");
    }
}
