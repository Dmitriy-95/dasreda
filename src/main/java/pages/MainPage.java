package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public WebDriver driver;

    @FindBy(id = "PH_logoutLink")
    public WebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage logOut() {
        retryingFindClick(logoutButton);
        return new LoginPage(driver);
    }


}
