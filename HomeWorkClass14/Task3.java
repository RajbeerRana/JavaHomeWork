package HomeWorkClass14;

public class Task3 {
    //Write a method to return whether given number is prime or not?

    boolean primeNumber(int num){
      boolean  isPrime = true;
        if(num<=1){
            isPrime=false;
        }else{
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

        }return true;
    }
}
