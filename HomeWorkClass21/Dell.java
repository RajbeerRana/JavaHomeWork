package HomeWorkClass21;

public class Dell extends Computer{

    public Dell(String name, int price, String edition, double RAM) {
        super(name, price, edition, RAM);
    }


    @Override
    void start(){
        System.out.println("To start the Dell press the button beneath the screen");
    }
    @Override
    void speed(){
        System.out.println("We are checking the speed through Performance tool");
    }
    @Override
    void close(){
        System.out.println("shutting down after updating the computer");

    }

    void graphics(){
        System.out.println("computer is showing graphic processor needs to update new version");
    }
}
