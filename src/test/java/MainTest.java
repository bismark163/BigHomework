import core.Browser;
import core.BrowserFactory;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
    public RemoteWebDriver driver;
    public RemoteWebDriver driver2;

    @BeforeTest
    public void start() {
        Browser browserObj1 = BrowserFactory.get();
        this.driver = browserObj1.launchBrowser();
    }

    @Test
    public void testA() {
        Browser browserObj2 = BrowserFactory.get("firefox");
        this.driver2 = browserObj2.launchBrowser();

        this.driver.get("https://ya.ru");
    }

    @Test
    public void testB() {
        this.driver.get("https://yandex.ru");
    }

    @AfterClass
    public void finish() {
        this.driver.quit();
        this.driver2.quit();
//        this.driver.close();
    }
}
