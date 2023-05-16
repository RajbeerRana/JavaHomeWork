package GroupProject;

public class Task2 {
    public static void main(String[] args) {
        // 2. Create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.

        double [] paymentsDue={43.99,90.00,172.80,54.76,43.33,72.00,65.71,31.00};
        int sum=0;

        for (double totalPaymentsPaid : paymentsDue) {
            sum+=totalPaymentsPaid;
        }
        System.out.println("Paid amount is " + sum);
    }
}
