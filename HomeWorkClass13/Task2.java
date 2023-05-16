package HomeWorkClass13;

public class Task2 {
    public static void main(String[] args) {
        // How would you check if String is palindrome or not? aba=> true
        //Abbc =>false


        String sentence = "A man a plan a canal Panamas ";
        sentence = sentence.replaceAll("  ", "");

        String sentence1 = "";
        sentence1 = sentence1.replaceAll(" ", "");

        for (int i = sentence.length() - 1; i >= 0; i--) {
            sentence1 += sentence.charAt(i);

        }


        boolean Palindrome;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != sentence1.charAt(i)) {
                Palindrome = false;
            }
        }
        if (Palindrome = true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }


    }
}
