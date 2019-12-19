import core.ChromeBrowser;
import core.pages.AbstractPage;
import core.pages.PageFactory;
import core.users.Users;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
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
        AbstractPage page = PageFactory.getEnv();
        this.driver.get(Users.getInstance().getUrl());
        page.enterLogin(Users.getInstance().getLogin());
//        enterLogin(Users.getInstance().getLogin());
//        clickNext();


    }

    @Test
    public void testB() {
        this.driver.get("https://yandex.ru");
    }


    // public void finish() {
    // this.driver.quit();

//        this.driver.close();
    //  }

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


}
