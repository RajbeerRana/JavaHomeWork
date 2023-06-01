package HomeWorkClass26;

import java.util.ArrayList;
import java.util.Collection;

public class CollectIntegers {
    public static void main(String[] args) {

        Collection<Integer> numbers=new ArrayList<>();
        numbers.add(54);
        numbers.add(45);
        numbers.add(89);
        numbers.add(72);
        numbers.add(94);
        numbers.add(451);
        numbers.add(980);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all integers are " + sum);
    }
}
