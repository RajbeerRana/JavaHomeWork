package HomeWorkClass9;

public class HomeWork4 {
    public static void main(String[] args) {
        // Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

        String [] cars={"Audi","Austin","BMW","Bugatti","Ferrari","Ford" };
        for (int i = 0; i <cars.length ; i++) {

            System.out.print(cars[i] + " ");

        }

        System.out.println();
        int j = 0;
        while(j<cars.length){
            System.out.print(cars[j] + " ");
            j++;
        }


    }
}
