package HomeWorkClass25;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

class StudentTester{

    public static void main(String[] args) {

        Student student = new Student("Asghar","AB6784");
        Student student1 = new Student("Mozzam","CD75464");
        Student student2 = new Student("Sohail","EF34954");
        Student student3 = new Student("Assel","Gh27475");
        Student student4 = new Student("Sam","MI285724");


        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        //System.out.println(students);

        for (Student student5 : students) {
            System.out.println(student5.toString());

        }
    }
}

















