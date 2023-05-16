package HomeWorkClass10;

public class HomeWork1 {
    // Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
    // Then your program should print name of the students that has A and B grade
    public static void main(String[] args) {
        String[][] names = {{"John", "James", "Bruce", "Alfred"},
                {"B", "E", "A", "D"}


        };
        for (int i = 0; i < names[0].length; i++) {
            if (names[1][i].equals("A") || names[1][i].equals("B")) {
                System.out.print(names[0][i] + " ");

            }


        }
    }

}
