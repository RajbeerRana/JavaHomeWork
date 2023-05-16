package HomeWorkClass19;
//Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
public class StaticClass {
    static void staticCase(int num1, int num2, int num3){
        System.out.println(num1 + num2 + num3);
    }
    static  void staticCase(int num1 , double num2 , long num3){
        System.out.println((num1 - num2) + num3);
    }

    static void staticCase(String word, int num1){
        System.out.println(word + num1);
    }

    public static void main(String[] args) {

        staticCase(45,89,43);
        staticCase("today's temperature is ",28);
        staticCase(100,45.89,9000000L);

    }
}
