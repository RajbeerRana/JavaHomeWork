package HomeWorkClass13;

public class Task3 {
    public static void main(String[] args) {

        // How would you swap  2 strings without a temporary variable?

        String str = "Asghar is";
        String str1 = "Java instructor";

        // Before Swapping
        System.out.println(str);
        System.out.println(str1);

        str = str + str1;
        str1 = str.substring(0, str.length() - str1.length());
        str = str.substring(str1.length());

        // After Swapping
        System.out.println(str);
        System.out.println(str1);
    }
}
