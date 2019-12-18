package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeBrowser extends OpenBrowser {
    public RemoteWebDriver launchBrowser() {

        ChromeDriver driver = new ChromeDriver();

        return driver;
    }
}
