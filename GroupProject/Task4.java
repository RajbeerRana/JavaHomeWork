package GroupProject;

public class Task4 {
    public static void main(String[] args) {
        // 4. Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array.

        int [][] StudentsInClass= {{9,10,11,12,13,14,15,16,17,18,},
                {64, 65, 66, 67, 68, 69, 70, 71, 72, 73},
                {49, 50, 51, 52, 53, 54, 55, 56, 57, 58},
                { 82, 83, 84, 85, 86, 87, 88, 89, 90}
        };

        System.out.println("Sum of Even and Odd numbers are: ");
        int sum=0;
        int sum1=0;
        for (int[] studentsInClassLeft : StudentsInClass)
            for (int i : studentsInClassLeft) {
                if( i%2==0) {
                    sum += i;
                }else if (i%2!=0) {
                    sum1+=i;
                }
            }System.out.println(sum);
        System.out.println(sum1);
    }
}
