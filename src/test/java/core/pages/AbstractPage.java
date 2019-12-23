package core.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

public class AbstractPage implements PageObject {

    protected RemoteWebDriver driver;

    public AbstractPage(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public void enterLogin(String login) {

    }

    public void enterPass(String pass) {
    }

    ;

    public void clickNext() {
    }

    ;

    public void checkInboxOpened() {
    }


}
