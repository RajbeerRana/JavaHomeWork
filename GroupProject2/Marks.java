package GroupProject2;

public abstract class Marks {

    // We have to calculate the average of marks obtained in three subjects
    //by student A and by student B. Create class 'Marks' with an abstract
    //method 'getPercentage' that will be returning the average percentage
    //of marks. Provide implementation of abstract method in classes 'A'
    //and 'B'. The constructor of student A takes the marks in three
    //subjects as its parameters and the marks in four subjects as its
    //parameters for student B. Test your code


   abstract double avgPercentage();
}

class A extends Marks{

   private double subjectMark1;
   private double subjectMark2;
   private double subjectMark3;

   public A(double subjectMark1, double subjectMark2, double subjectMark3) {
      this.subjectMark1 = subjectMark1;
      this.subjectMark2 = subjectMark2;
      this.subjectMark3 = subjectMark3;
   }

   @Override
   double avgPercentage() {
      return (subjectMark1 + subjectMark2 + subjectMark3) /3;
   }
}

class B extends Marks{

   private double subjectMark1;
   private double subjectMark2;
   private double subjectMark3;
   private double subjectMark4;

   public B(double subjectMark1, double subjectMark2, double subjectMark3, double subjectMark4) {
      this.subjectMark1 = subjectMark1;
      this.subjectMark2 = subjectMark2;
      this.subjectMark3 = subjectMark3;
      this.subjectMark4 = subjectMark4;
   }

   @Override
   double avgPercentage() {
      return (subjectMark1 + subjectMark2 + subjectMark3 + subjectMark4) / 4;
   }
}
