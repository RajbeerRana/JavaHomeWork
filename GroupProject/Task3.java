package GroupProject;

public class Task3 {
    public static void main(String[] args) {
        // 3. Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.

        int [][] StudentsInClass= {{9,10,11,12,13,14,15,16,17,18,},
                                   {64, 65, 66, 67, 68, 69, 70, 71, 72, 73},
                                   {49, 50, 51, 52, 53, 54, 55, 56, 57, 58},
                                   { 82, 83, 84, 85, 86, 87, 88, 89, 90}
                };

        System.out.println("Even numbers are: ");
        for (int[] studentsInClassLeft : StudentsInClass)
            for (int i : studentsInClassLeft) {
            if( i%2==0){
                System.out.print(i + " ");
            }

        }
    }
}
