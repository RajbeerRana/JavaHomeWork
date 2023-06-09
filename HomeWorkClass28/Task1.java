package HomeWorkClass28;

public class Task1 {
// Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception age is less than 16.
    public static void main(String[] args) {

      try{
          int age = 15;
          ageEligibility(age);
          System.out.println("You are eligible for this course");
      }catch (RuntimeException e){
          e.printStackTrace();
      }

    }

    static void ageEligibility(int age) throws RuntimeException{
        if(age <16){
            throw new RuntimeException("Your Age should more than 16 to enroll in this course");
        }
    }


}
