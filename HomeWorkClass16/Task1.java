package HomeWorkClass16;

public class Task1 {
    // Create a method that will take a String as a parameter and returns reversed String. Method should be available to all classes within your project and accessible by class name.

  public static String str(String s){
        StringBuilder reverseStr = new StringBuilder(s);
        String reverseStr1 =reverseStr.reverse().toString();
        return reverseStr1;
    }

}
