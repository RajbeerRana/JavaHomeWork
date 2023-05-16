package HomeWorkClass4;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();

        if(age>=18){
            System.out.println("I will issue a driver licence to you");
        }else{
            System.out.println("I will offer you to get a licence permit");
        }
    }


}

