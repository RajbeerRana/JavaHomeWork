package GroupProject;

public class Task9 {
    public static void main(String[] args) {
        // 9. Write a java program to find the second largest number in the array?

        int [] numbers = {67, 84, 99, 90, 12, 630, 549, 5};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] > largest){
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
            }

        }
        System.out.println("Second largest numbers is " + secondLargest);
    }
}
