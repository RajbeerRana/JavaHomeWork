package GroupProject2;

public class WebDriverTester {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        SafariDriver driver1 = new SafariDriver();
        FireFox driver2 = new FireFox();

        driver.open();
        driver.close();
        System.out.println(driver.getTitle());
        driver.navigate();

        driver1.open();
        driver1.close();
        System.out.println(driver1.getTitle());
        driver1.navigate();

        driver2.open();
        driver2.close();
        System.out.println(driver2.getTitle());
        driver2.navigate();
    }
}
