package GroupProject2;

public class Task2Palindrome {
    public static void main(String[] args) {
      //  Check if a String is Palindrome: Determine whether a given string is
      //  a palindrome, which means it reads the same forwards and
      //  backward. For example, "madam" is a palindrome.

        String visitor = "madam";
        String str ="";

        for (int i = visitor.length()-1; i >=0; i--) {
            str += visitor.charAt(i);
        }

        boolean isPalindrome = true;

        for (int i = 0; i <=visitor.length()-1 ; i++) {
            if(visitor.charAt(i) != str.charAt(i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("It's Palindrome");
        }else{
            System.out.println("It's not Palindrome");
        }
    }
}
