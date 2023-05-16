package HomeWorkClass10;

public class HomeWork4 {
    public static void main(String[] args) {
        // Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int [][] grades = {{10,20,30},
                           {40,50,60},
                           {70,80,90}
        };
        int sum = 0;

        for (int i = 0; i < grades.length ; i++) {
            for (int j = 0; j < grades[i].length ; j++) {
                sum=sum+grades[i][j];

            }


        }System.out.println(sum);
    }
}
