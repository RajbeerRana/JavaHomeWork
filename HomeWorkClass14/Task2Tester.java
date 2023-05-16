package HomeWorkClass14;

public class Task2Tester {
    public static void main(String[] args) {
        Task2 emailId = new Task2();
        emailId.createEmail("John","Snow","gmail");

        Task2 emailId1 = new Task2();
        String firstName = "John";
        String lastName = "Snow";
        String emailType = "gmail";

        emailId1.createEmail(firstName,lastName,emailType);
    }
}
