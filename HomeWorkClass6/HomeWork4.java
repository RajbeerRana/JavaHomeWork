package HomeWorkClass6;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        /* Write a program for user to enter his/hers birth month. Based on the month define the season.
       Example: if user is born in March, April, May → season =”Spring”
       if user is born in June, July, August →
      season =”Summer”  etc …
       At the end of the program we should see 1 output as “You were born is season __”.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = scan.next();

        if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println("You wore born in season Spring");
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("You wore born in season Summer");
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            System.out.println("You wore born in season Fall");
        } else if (month.equals("December") || month.equals("January") || month.equals("February")) {
            System.out.println("You wore born in season Winter");
        }
    }


}

