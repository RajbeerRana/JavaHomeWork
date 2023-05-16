package HomeWorkClass16;

public class Task2 {
    // Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.

    private String vowels(String str){
        String str1 =str.toLowerCase();
        String result = "";

        for( int i = 0; i <str1.length();i++){
            char c = str1.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u'){
                result += str1.charAt(i);
            }
        }return result;
    }


    public static void main(String[] args) {
        Task2 obj = new Task2();
        System.out.println(obj.vowels("Welcome to Syntax Bootcamp"));


    }
}
