package GroupProject2;

public interface WebDriver {

    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends  WebDriver{
    void navigate();
}

interface TakesScreenShort extends RemoteWebDriver{
    void getScreenShot();
}

class ChromeDriver implements RemoteWebDriver{


    @Override
    public void open() {
        System.out.println("Chrome tab is opening....");
    }

    @Override
    public void close() {
        System.out.println("Chrome tab is closing..........");
    }

    @Override
    public String getTitle() {
        return "Getting the Instagram url........";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to the Instagram url.......");
    }
}
class FireFox implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("FireFox tab is opening....");
    }

    @Override
    public void close() {
        System.out.println("FireFox tab is closing..........");
    }

    @Override
    public String getTitle() {
        return "Getting the YouTube url........";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to the YouTube url.......");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Safari tab is opening....");
    }

    @Override
    public void close() {
        System.out.println("Safari tab is closing..........");
    }

    @Override
    public String getTitle() {
        return "Getting the facebook url........";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to facebook url.......");
    }
}

