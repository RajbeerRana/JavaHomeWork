package HomeWorkClass14;

public class Task1 {
    //  Create a method that will say Hello in different language based on the country that will passed when method is executed.

    void countryName(String word) {
        if (word.equals("Canada")) {
            System.out.println("Hello");
        } else if (word.equals("India")) {
            System.out.println("Namaste");
        } else if (word.equals("Pakistan")) {
            System.out.println("Asalaam-walaikum");
        } else if (word.equals("France")) {
            System.out.println("Bonjour");
        } else if (word.equals("Mexico")) {
            System.out.println("Hola");
        } else if (word.equals("Brazil")) {
            System.out.println("Ola");
        } else if (word.equals("Italy")) {
            System.out.println("Ciao");
        }else if (word.equals("Russia")) {
            System.out.println("Privet");
        }
    }
}