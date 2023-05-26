package GroupProject2;

public class RegistrationTester {
    public static void main(String[] args) {

        Registration registration = new Registration();
        registration.setEmail("Rajbeer@yahoo.com");
        System.out.println("Your new email id is " + registration.getEmail());

        registration.setUserName("Bruce Wayne");
        System.out.println("You have registered as " + registration.getUserName());


        registration.setPassword("rraagghhuui");
        System.out.println("Your new password is " + registration.getPassword());
    }
}
