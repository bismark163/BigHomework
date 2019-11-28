package core;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxBrowser extends Browser {
    public RemoteWebDriver launchBrowser() {
        return new FirefoxDriver();
    }
}
