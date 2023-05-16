package GroupProject;

public class Task7 {
    public static void main(String[] args) {
     //    7. Write a Java Program to print the first 10 numbers of  Fibonacci series.

        int n = 10; // Number of terms to print
        int num = 0; // First term
        int num1 = 1; // Second term


        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");


            int num3 = num + num1;
            num = num1;
            num1 = num3;
        }

    }
}
