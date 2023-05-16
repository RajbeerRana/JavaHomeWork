package HomeWorkClass4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is name of your city?");
        String city=scan.nextLine();
        System.out.println("what is temperature in your city");
        double fahrenheit= scan.nextDouble();
        double celsius=(fahrenheit-32)*5/9;

        System.out.println("The temperature of my city "+city+"is "+celsius+" celsius");









    }


}

