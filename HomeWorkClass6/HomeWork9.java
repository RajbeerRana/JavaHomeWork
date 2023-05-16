package HomeWorkClass6;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter to first number  for Calculations");
        double number1=scan.nextDouble();
        System.out.println();
        System.out.println("Please enter to second number  for Calculations");
        double number2=scan.nextDouble();
        System.out.println();
        System.out.println("Please enter the operator for Calculations");
        char operator=scan.next().charAt(0);

        double sum1=number1 + number2;
        double sum2=number1 - number2;
        double sum3=number1 * number2;
        double sum4=number1 / number2;

        switch(operator){
            case '+':
            System.out.println("Based on your operator the result is " + sum1);
            break;
            case '-':
                System.out.println("Based on your operator the result is "+ sum2);
            case '*':
                System.out.println("Based on your operator the result is "+ sum3);
            case '/':
                System.out.println("Based on your operator the result is " + sum4);
            default:
                System.out.println("The number you entered is invalid");
        }
    }
}
