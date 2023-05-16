package GroupProject;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // 6. Write a java program to check whether a given number is prime or not?

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int n = input.nextInt();

        boolean prime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

    }
}
