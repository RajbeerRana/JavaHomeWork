package HomeWorkClass9;

public class HomeWork6 {
    public static void main(String[] args) {
        // Create an array on integers and calculate the sum of all elements in an array

        int [] grades={45,90,88,120,76,87,830,85,96};
        int sum=0;
        for (int i = 0; i < grades.length ; i++) {
            sum=sum+grades[i];

        }
        System.out.println(sum);
    }
}
