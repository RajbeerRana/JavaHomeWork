package HomeWorkClass4;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the amount of the loan required");
        int amount=scan.nextInt();

        if(amount<=200000){
            System.out.println("Lend the money");
        }else{
            System.out.println("Reject the client");
        }

    }


}

