package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeBrowser extends Browser {
    public RemoteWebDriver launchBrowser() {
        return new ChromeDriver();
    }
}
