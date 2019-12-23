package core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class YandexObject extends AbstractPage {


    public YandexObject(RemoteWebDriver driver) {
        super(driver);
        //this.driver = super.driver;
    }


    public void enterLogin(String login) {

        openEnterLogin();
        if (checkLoginFieldVisible()) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement loginField = driver.findElementById("passp-field-login");
//            loginField.click();
            loginField.sendKeys(login);
        } else {
            throw new IllegalArgumentException("Поле ввода логина не отобразилось");
        }

    }

    public void enterPass(String pass) {

        if (checkPassFieldVisible()) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement loginField = driver.findElementById("passp-field-passwd");
//            loginField.click();
            loginField.sendKeys(pass);
        } else {
            throw new IllegalArgumentException("Что-то пошло не так");
        }
    }

    public void clickNext() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement enterButton = driver.findElement(By.xpath("//*[@type='submit']"));
        enterButton.click();
    }

    public void checkInboxOpened() {


        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.findElementByXPath("//*[@data-title=\"Входящие\"]").isDisplayed();
        } catch (Exception e) {
            throw new IllegalArgumentException("Не могу найти элемента");
        }

    }

    private boolean checkLoginFieldVisible() {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElementById("passp-field-login").isDisplayed();
        } catch (Exception e) {
            throw new IllegalArgumentException("Элемент ещё не виден");
        }

        return true;
    }

    private void openEnterLogin() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement enterButton = driver.findElementByLinkText("Войти");
        enterButton.click();
    }

    private boolean checkPassFieldVisible() {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElementById("passp-field-passwd").isDisplayed();
        } catch (Exception e) {
            throw new IllegalArgumentException("Элемент ещё не виден");
        }

        return true;
    }
}