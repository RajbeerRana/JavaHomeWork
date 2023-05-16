package HomeWorkClass13;

public class Task1 {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        //  input=>This is sentence i want to reverse
        //  output=>sihT si ecnetnes i tnaw ot esrever
        String str="This is sentence i want to reverse";

        String [] word = str.split(" ");

        StringBuilder str1 = new StringBuilder();
        for (String words : word){
            StringBuilder str2 =new StringBuilder(words).reverse();
            str1.append(str2).append(" ");
        }
        String str3 = str1.toString().trim();
        System.out.println(str1);
    }
}
