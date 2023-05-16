package HomeWorkClass14;

public class Task2 {
    // Create a method createEmail(). Based on values of users firstName, lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    void createEmail( String firstName, String lastName, String emailType){
        System.out.println(firstName+lastName+"@"+emailType+".com");
    }
}
