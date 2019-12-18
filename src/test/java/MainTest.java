import core.ChromeBrowser;
import core.Users;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
    public RemoteWebDriver driver;


    @BeforeTest
    public void start() {
        ChromeBrowser browserObj = new ChromeBrowser();
        this.driver = browserObj.launchBrowser();



    }

    @Test
    public void testA() {
        this.driver.get(Users.getInstance().getUrl());
        enterLogin(Users.getInstance().getLogin());

    }

    @Test
    public void testB() {
        this.driver.get("https://yandex.ru");
    }

    @AfterClass
    public void finish() {
        this.driver.quit();

//        this.driver.close();
    }

    public void enterLogin(String login) {

        WebElement loginField = driver.findElementById("identifierId");
        loginField.click();
        loginField.sendKeys(login);
    }
}
