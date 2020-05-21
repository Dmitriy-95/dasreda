import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    String CHROMEDRIVER_PATH = Constants.CHROMEDRIVER_PATH;
    String BASE_URL = Constants.BASE_URL;
    WebDriver driver;
    BasePage basePage;

    @BeforeClass
    public void before() {
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        basePage = new BasePage(driver);
        basePage.login(Constants.EMAIL, Constants.PASSWORD);
    }

    @AfterClass
    public void after() {
        driver.quit();
    }
}
