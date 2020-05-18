import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    String CHROMEDRIVER_PATH = Constants.CHROMEDRIVER_PATH;
    String BASE_URL = Constants.BASE_URL;
    WebDriver driver;

    @BeforeClass
    public void before() {
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @AfterClass
    public void after(){
        driver.quit();
    }
}
