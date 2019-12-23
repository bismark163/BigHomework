package core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GoogleObject extends AbstractPage {


    public GoogleObject(RemoteWebDriver driver) {
        super(driver);
    }


    public void enterLogin(String login) {

        WebElement loginField = driver.findElementById("identifierId");
        loginField.click();
        loginField.sendKeys(login);


    }

    public void enterPass(String pass) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement passField = driver.findElementByName("password");
        passField.sendKeys(pass);

    }


    public void clickNext() {

        if (driver.findElementById("identifierId").isDisplayed()) {
            clickLoginNext();
        } else if (driver.findElementByName("password").isDisplayed()) {
            clickPassNext();
        } else {
            throw new IllegalArgumentException("Не могу нажать на кнопку");
        }

    }

    public void checkInboxOpened() {

        try {
            WebElement bbb = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-tooltip=\"Входящие\"]")));
            bbb.isDisplayed();
        } catch (Exception e) {
            throw new IllegalArgumentException("Не могу найти элемента");
        }

    }

    private void clickLoginNext() {

        WebElement identifierNext = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("identifierNext")));
        identifierNext.click();
    }

    private void clickPassNext() {


        WebElement passwordNext = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("passwordNext")));
        passwordNext.click();
    }
}
