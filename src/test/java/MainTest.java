import core.ChromeBrowser;
import core.pages.AbstractPage;
import core.pages.PageFactory;
import core.users.Users;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
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
        AbstractPage page = PageFactory.getSystemEnvironment(driver);
        this.driver.get(Users.getInstance().getUrl());
        page.enterLogin(Users.getInstance().getLogin());

        page.clickNext();
        page.enterPass(Users.getInstance().getPass());
        page.clickNext();
        page.checkInboxOpened();
    }


    @AfterTest
    public void finish() {
        this.driver.close();
        this.driver.quit();
    }


}
