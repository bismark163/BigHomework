package core;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxBrowser extends Browser {
    public RemoteWebDriver launchBrowser() {
        FirefoxOptions options = new FirefoxOptions()
                .addPreference("browser.startup.page", 1)
                .addPreference("browser.startup.homepage", "https://www.google.co.uk");

        return new FirefoxDriver(options);
    }
}
