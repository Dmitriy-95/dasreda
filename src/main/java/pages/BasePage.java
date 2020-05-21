package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MainPage login(String email, String password) {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.successLogin(email, password);
    }

    public LoginPage logOut() {
        MainPage mainPage = new MainPage(driver);
        return mainPage.logOut();
    }

    public boolean retryingFindClick(WebElement element) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 3) {
            try {
                element.click();
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;
    }

    public boolean isVisible(WebElement element) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 3) {
            try {
                element.isDisplayed();
                result = true;
                break;
            } catch (NullPointerException e) {
            }
            attempts++;
        }
        return result;
    }

}
