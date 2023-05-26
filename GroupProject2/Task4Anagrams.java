package GroupProject2;

import java.util.Arrays;

public class Task4Anagrams {
    //Check if Two Strings are Anagrams: Given two strings, determine if
    //they are anagrams, meaning they contain the same characters in a
    //different order. For example, "listen" and "silent" are anagrams.
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";



        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if (c1.length != c2.length){
            System.out.println(s1 + " and " + s2 +" are not anagram strings");
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i <c1.length ; i++) {
            if(c1[i] == c2[i]){
                System.out.println(s1 + " and " + s2 +" are  anagram strings");
            }else{
                System.out.println(s1 + " and " + s2 +" are not anagram strings");
            }
        }

    }
}
