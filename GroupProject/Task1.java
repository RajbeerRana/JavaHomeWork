package GroupProject;

public class Task1 {
    public static void main(String[] args) {
        // 1. Create a program that uses an array to store a list of temperatures for a week, and then uses a loop to find
        //the highest and lowest temperature for the week.

        double [] weekTemperature={20.0,18.5,31.6,22.0,18.3,20.24,10.8};
        
        double highestTemperature=weekTemperature[0];
        double lowestTemperature=weekTemperature[0];

        for (int i = 0; i <weekTemperature.length ; i++) {
            if(weekTemperature[i] > highestTemperature){
                highestTemperature = weekTemperature[i];
            } else if (weekTemperature[i] < lowestTemperature ) {
                lowestTemperature = weekTemperature[i];
                
            }

        }
        System.out.println("Highest temperature of the week is " + highestTemperature);
        System.out.println("Lowest temperature of the week is " + lowestTemperature);
    }
}
