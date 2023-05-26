package GroupProject2;

import java.util.Scanner;

public class Task3CountWords {
    // Count the Number of Words in a String: Write a function to count the
    //number of words in a given string. Words are separated by spaces or
    //punctuation. For example, the input "Hello, world!" should return 2.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the words : ");
        String words = scan.nextLine();

        String [] word = words.split(" ");
        System.out.println("The number of words in the given String are : " + word.length);




    }
}
