package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MobileChromeBrowser extends Browser {
    public RemoteWebDriver launchBrowser() {
        ChromeOptions options = new ChromeOptions();

        // Add a ChromeDriver-specific capability.
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(400, 800));

        return driver;
    }
}
