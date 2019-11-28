import core.Browser;
import core.BrowserFactory;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
    public RemoteWebDriver driver;

    @BeforeTest
    public void start() {
        Browser browserObj = BrowserFactory.get();
        this.driver = browserObj.launchBrowser();
    }

    @Test
    public void testA() {
        this.driver.get("https://ya.ru");
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
}
