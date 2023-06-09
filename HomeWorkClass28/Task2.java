package HomeWorkClass28;

public class Task2 {
//Create a method checkUserName that will throw a runtime exception. Method should throw an exception when entered username is less than 5 characters.

    public static void main(String[] args) {

        try{
            String name= "Sam";
            checkUserName(name);
            System.out.println("Your user name is valid, Please proceed");
        }catch (RuntimeException e){
            e.printStackTrace();
           // e.getMessage();
        }
    }

    static void checkUserName(String name) throws RuntimeException{
        if(name.length() < 5){
            throw new RuntimeException("Your user name is not valid");
        }
    }
}
