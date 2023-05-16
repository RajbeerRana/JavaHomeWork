package GroupProject;

public class Task8 {
    public static void main(String[] args) {
        // 8. Maximum and minimum number in the array?

        int[] numbers = {67, 841, 999, 4395, 90, 12, 630, 5490, 5};
        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            {
                if (numbers[i] > maxNumber) {
                    maxNumber = numbers[i];
                } else if (numbers[i] < minNumber) {
                    minNumber = numbers[i];
                }
            }


        }
        System.out.println("Maximum number is " + maxNumber);
        System.out.println("Minimum number is " + minNumber);

    }
}
