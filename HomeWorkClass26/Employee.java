package HomeWorkClass26;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {

        Map<String, Integer> highestSal = new HashMap<>();
        highestSal.put("James Wick", 45000);
        highestSal.put("John Wick", 65000);
        highestSal.put("Jack Smith", 85000);
        highestSal.put("John Trump", 95000);
        highestSal.put("John Smith", 100000);
        highestSal.put("Ronald Mikes", 55000);



        String empHighSal = "";
        Integer highSal = 0;

        for(var e : highestSal.entrySet()){
            if(e.getValue() > highSal){
                highSal = e.getValue();
                empHighSal=e.getKey();
            }
        }

        System.out.println(empHighSal + "=$" + highSal);

    }
}