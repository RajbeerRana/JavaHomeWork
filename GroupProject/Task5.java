package GroupProject;

public class Task5 {
    public static void main(String[] args) {
        // 5. Write a program to swap 2 numbers without a temporary variable?

        //Before swapping.
        int i = 10;
        int j = 20;
        System.out.println("Before Swapping Value of i is " + i +" &" +" "+"Value of j is " + j);

        i= i + j;
        j= i - j;
        i= i - j;

        // After swapping.
        System.out.println("After Swapping Value of i is " + i +" &" +" "+"Value of j is " + j);

    }

}
