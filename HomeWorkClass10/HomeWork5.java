package HomeWorkClass10;

public class HomeWork5 {
    public static void main(String[] args) {
       //  Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.

        int [][] oddAndEven={{2,7,60,9},
                             {12,3,28,31},
                             {21, 16, 11, 14}
        };

        System.out.print("Even numbers are: ");
        for (int i = 0; i < oddAndEven.length; i++) {
            for (int j = 0; j < oddAndEven[i].length ; j++) {
                if(oddAndEven[i][j]%2==0){
                    System.out.print(oddAndEven[i][j] + " ");
                }


            }

            
        }
    }
}
