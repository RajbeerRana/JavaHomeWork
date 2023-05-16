package HomeWorkClass21;

public class Lenovo extends Computer{
    public Lenovo(String name, int price,String edition, double RAM){
        super(name,price,edition,RAM);
    }

    @Override
    void start(){
        System.out.println("Starting Lenovo by using power button which is on the side panel");
    }
    @Override
    void speed(){
        System.out.println("checking the speed of Lenovo by 5 different ways");
    }
    @Override
    void close(){
        System.out.println("After shutting down computer it shows power light for few seconds");
    }

    void power(){
        System.out.println("Lenovo showing it has best power consumption function");
    }

}
