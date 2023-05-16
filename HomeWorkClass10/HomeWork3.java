package HomeWorkClass10;

public class HomeWork3 {
    public static void main(String[] args) {
        // Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops

        String[][] veggies = {{"broccoli", "cauliflower", "spinach", "carrots", "zucchini", "cucumber", "bell pepper"},
                {"apple", "banana", "orange", "strawberry", "blueberry", "raspberry", "mango"},
                {"milk", "cheese", "yogurt", "butter", "sour cream", "cream cheese", "cottage cheese"},
                {"chocolate", "candy", "cake", "cookies", "pie", "brownies", "donuts", "marshmallows", "jelly beans"}
        };
        for (int i = 0; i < veggies.length; i++) {
            for (int j = 0; j < veggies[i].length; j++) {
                System.out.print(veggies[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println();

        for (String[] veggiesAndOthers : veggies)
            for (String weekGrocery : veggiesAndOthers) {
                System.out.print(weekGrocery + " ");

            }
        System.out.println();

        {

        }

    }
}
