package HomeWorkClass18;

public class Teacher {
    // Write a Java program called Teacher.  Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes



    String name;
    String subject;
    int grade;
    String country;


    void mathClass(){
        System.out.println(name + " is from " + country + " he teaches Math");
    }

    void chemistryClass(){
        System.out.println(name + " has said we need to score at least " + grade);
    }

    void pianoClass(){
        System.out.println(subject+ " has all short classes ");
    }

    void studentClass(){
        System.out.println( name + " said most of students are from "+country+ " and they are enrolled in " + subject);
    }


}
