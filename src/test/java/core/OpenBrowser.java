package core;

import org.openqa.selenium.remote.RemoteWebDriver;

abstract class OpenBrowser {
    public RemoteWebDriver launchBrowser() {
        throw new IllegalArgumentException("Browser is not set");
    }
}
