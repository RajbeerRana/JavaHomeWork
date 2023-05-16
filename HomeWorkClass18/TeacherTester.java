package HomeWorkClass18;

public class TeacherTester {
    public static void main(String[] args) {

        Teacher firstTest = new Teacher();
        firstTest.name="JACK";
        firstTest.country="Canada";
        firstTest.grade= 80;
        firstTest.mathClass();
        firstTest.chemistryClass();


        MathTeacher secondTest = new MathTeacher();
        secondTest.subject ="Java";
        secondTest.name="Asghar";
        secondTest.country="Pakistan";
        secondTest.pianoClass();
        secondTest.studentClass();

        ChemistryClass thirdTest = new ChemistryClass();
        thirdTest.subject="Selenium";
        thirdTest.name="Sohail";
        thirdTest.grade=85;
        thirdTest.chemistryClass();
        thirdTest.pianoClass();

        PianoClass fourthTest = new PianoClass();
        fourthTest.name="Sohail";
        fourthTest.country="India";
        fourthTest.subject="Manual testing";
        fourthTest.mathClass();
        fourthTest.studentClass();
    }



}
