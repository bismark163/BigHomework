package core.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleObject extends AbstractPage {


    private RemoteWebDriver driver;


    public void enterLogin(String login) {

        WebElement loginField = driver.findElementById("identifierId");
        loginField.click();
        loginField.sendKeys(login);

    }

    public void enterPass(String pass) {

    }

    public void clickNext() {
        WebElement nextButton = driver.findElementById("identifierNext");
        nextButton.click();

    }

    public void checkInboxOpened() {


    }
}
