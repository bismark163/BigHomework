package core.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

public class PageFactory {


    public static AbstractPage getSystemEnvironment(RemoteWebDriver driver) {
        String environment = System.getenv("environment");
        return getRequiredPage(environment, driver);
    }


    private static AbstractPage getRequiredPage(String environment, RemoteWebDriver driver) {
        if (environment.equals("mail")) {
            return new MailObject(driver);
        } else if (environment.equals("yandex")) {
            return new YandexObject(driver);
        } else if (environment.equals("google")) {
            return new GoogleObject(driver);
        } else {
            throw new IllegalArgumentException("Cannot launch object for environment " + environment);
        }
    }
}
