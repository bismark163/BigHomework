package core;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeBrowser extends Browser {
    public RemoteWebDriver launchBrowser() {
        ChromeOptions options = new ChromeOptions();

        // Add the WebDriver proxy capability.
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("myhttpproxy:3337");
        options.setCapability("proxy", "");

        // Add a ChromeDriver-specific capability.
        ChromeDriver driver = new ChromeDriver(options);

        return new ChromeDriver(options);
    }
}
