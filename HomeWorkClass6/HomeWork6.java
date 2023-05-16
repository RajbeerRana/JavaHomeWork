package HomeWorkClass6;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        // Ask user to enter their country and capture it. Once values are captured print which language user speaks.




        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the name of your Country?");
        String Country=scan.next();

        switch (Country){
            case "Canada":
                System.out.println("You speak English");
                break;
                case "India":
                System.out.println("You speak Hindi");
                    break;
            case "Romania":
                System.out.println("You speak Romanian");
                break;
            case "Brazil":
                System.out.println("You speak Portuguese");
                break;
            case "China":
                System.out.println("You speak Mongolian");
                break;
            case "Egypt":
                System.out.println("You speak Arabic");
                break;
            case "Germany":
                System.out.println("You speak German");
                break;
            case "Iran":
                System.out.println("You speak Persian");
                break;
            case "Russia":
                System.out.println("You speak Russian");
                break;

        }
        
    }
}
