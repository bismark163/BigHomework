package core.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class MailObject extends AbstractPage {

    public MailObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void enterLogin(String login) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement loginField = driver.findElementById("mailbox:login");
        loginField.click();
        loginField.sendKeys(login);

    }

    public void enterPass(String pass) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement passField = driver.findElementById("mailbox:password");
        passField.click();
        passField.sendKeys(pass);

    }

    public void clickNext() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement nextButton = driver.findElementById("mailbox:submit");
        nextButton.click();
    }

    public void checkInboxOpened() {

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElementByClassName("compose-button__wrapper").isDisplayed();
        } catch (Exception e) {
            throw new IllegalArgumentException("Не могу найти элемента");
        }

    }
}
