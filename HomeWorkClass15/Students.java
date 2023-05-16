package HomeWorkClass15;
//Create a Class called Students
//Create three  variables  Name , ID  and  numberOfStudents
//Create three objects of the Students Class
//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//Print out  total number of students
public class Students {
    String studentName;
    String studentId;
    static  int numberOfStudents;


    public static void main(String[] args) {
        Students classOne = new Students();
        classOne.studentName = "Jack";
        classOne.studentId = "GW3456";
        numberOfStudents++;

        Students classTwo = new Students();
        classTwo.studentName = "Josh";
        classTwo.studentId = "im095874";
        numberOfStudents++;

        Students classThree = new Students();
        classThree.studentName = "Jack";
        classThree.studentId = "GW3456";
        numberOfStudents++;


        System.out.println(Students.numberOfStudents);




    }
}
