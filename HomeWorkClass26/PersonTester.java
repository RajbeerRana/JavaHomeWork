package HomeWorkClass26;

import java.util.LinkedHashMap;
import java.util.Map;

public class PersonTester {

    public static void main(String[] args) {


        Map<Integer, Person> personId = new LinkedHashMap<>();

        Person person1 = new Person("Asghar", "Khan", 35, 4500.00);
        Person person2 = new Person("Sohail", "Abbasi", 38, 5000.00);
        Person person3 = new Person("Vlad", "Volaski", 32, 6400.00);
        Person person4 = new Person("Sarah", "smith", 28, 9000.00);
        Person person5 = new Person("John", "Wayne", 41, 7800.00);


        personId.put(1,person1);
        personId.put(2,person2);
        personId.put(3,person3);
        personId.put(4,person4);
        personId.put(5,person5);

        for (var details: personId.entrySet()){
            System.out.println(details.getKey()+" = "+details.getValue());
        }


    }
}
