package GroupProject2;

public class Task1Reverse {
    //Reverse a String: Write a function to reverse a given string. For
    //example, given the input "Hello", the output should be "olleH".
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse().toString();
        System.out.println(str1);
    }
}
