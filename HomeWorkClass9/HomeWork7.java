package HomeWorkClass9;

public class HomeWork7 {
    public static void main(String[] args) {
        // From an array of integer elements find the largest number.

        int [] numbers={9,56,34,20,90,68,42};
         int largest = numbers[0];


        for (int i = 0; i < numbers.length ; i++) {

            if(numbers[i]>largest){

                largest=numbers[i];
            }
        }
        System.out.println(largest);
    }
}
