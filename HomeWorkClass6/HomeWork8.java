package HomeWorkClass6;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
      /*  HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
            Please complete this assignment in 2 ways: using if statement and switch case.   */

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

        if(operator=='+'){
            System.out.println("Based on your operator the result is " + sum1);
        } else if (operator=='-') {
            System.out.println("Based on your operator the result is " + sum2);
        } else if (operator=='*') {
            System.out.println("Based on your operator the result is " + sum3);
        } else if (operator=='/') {
            System.out.println("Based on your operator the result is " + sum4);
        }else{
            System.out.println("Please enter valid number or operator");
        }


    }
}
