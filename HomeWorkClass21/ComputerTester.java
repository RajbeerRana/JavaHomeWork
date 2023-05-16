package HomeWorkClass21;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] computer ={ new Apple("Mac",1200,"M2",24.00),
                 new Lenovo("Legion",1000,"X Series",32),
                new HP("Pavilion",1450,"Elite",32),
                new Dell("Dell G15",1200,"XPS",64)

        };

        for(Computer laptop : computer){

            if(laptop instanceof Apple){
                ((Apple)laptop).upgrade();
            }else if (laptop instanceof Lenovo){
                ((Lenovo)laptop).power();
            }else if (laptop instanceof HP){
                ((HP)laptop).security();
            } else if (laptop instanceof Dell) {
                ((Dell)laptop).graphics();
            }

            laptop.start();
            laptop.speed();
            laptop.close();
        }
    }
}
