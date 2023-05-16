package HomeWorkClass12;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
/*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY */

        Scanner scan= new Scanner(System.in);
        System.out.println("What is Mom's first name?");
        String momFirst= scan.next();
        System.out.println("What is Dad's first name?");
        String dadFirst = scan.next();
        System.out.println("Are you expecting boy or girl");
        String baby = scan.next();


        String SuggestedName;
        if(baby.equals("boy")){
            SuggestedName = dadFirst.substring(0,3) +momFirst.substring(momFirst.length() -2);
        }else if(baby.equals("girl")){
            SuggestedName = momFirst.substring(0,3) +dadFirst.substring(dadFirst.length() -3);
        }else{
            SuggestedName = "Please enter valid answer";
        }
        System.out.println("Suggested baby name is " + SuggestedName);









    }
}
