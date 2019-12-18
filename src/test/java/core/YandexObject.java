package core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class YandexObject implements PageObject {

    private RemoteWebDriver driver;


    public void enterLogin(String login) {
        WebElement loginField = driver.findElementById("identifierId");
        loginField.click();
        loginField.sendKeys(login);
    }

    public void enterPass(String pass) {

    }

    public void clickNext() {

    }

    public void checkInboxOpened() {


        WebElement nextButton = driver.findElementById("identifierNext");

    }
}