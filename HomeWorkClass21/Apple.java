package HomeWorkClass21;

public class Apple extends Computer {
    public Apple(String name, int price, String edition, double RAM) {
        super(name, price, edition, RAM);
    }

    @Override
    void start(){
        System.out.println("Starting Apple by  using different startup method");
    }
    @Override
    void speed(){
        System.out.println("checking the speed with use of Activity Monitor");
    }
    @Override
    void close(){
        System.out.println("After shutting down computer is not showing power light");
    }

    void upgrade(){
        System.out.println("It's getting hard to upgrade Apple computer because of storage drive");
    }
}

