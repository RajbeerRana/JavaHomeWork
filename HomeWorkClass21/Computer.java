package HomeWorkClass21;

public class Computer {

//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.


    String name;
    int price;
    String edition;
    double RAM;

    public Computer(String name, int price, String edition , double RAM){
        this.name=name;
        this.price=price;
        this.edition=edition;
        this.RAM=RAM;
    }

    public void printInfo(){
        System.out.println(name + " " + price +" " + edition + " " + RAM);
    }

    void start(){
        System.out.println(" To start the computer it should pe plugged in");
    }
    void speed(){
        System.out.println("Delete all junk files from Computer to get high speed");
    }
    void close(){
        System.out.println(" Before Shut Down all windows should be closed");
    }
}
