package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(id = "mailbox:login")
    public WebElement emailField;

    @FindBy(id = "mailbox:password")
    public WebElement passwordField;

    @FindBy(xpath = ".//label[@id='mailbox:submit']/input")
    public WebElement submitButton;

    @FindBy(id = "logo")
    public WebElement logo;

    public MainPage successLogin(String email, String password) {
        isVisible(emailField);
        emailField.sendKeys(email);
        retryingFindClick(submitButton);
        isVisible(passwordField);
        passwordField.sendKeys(password);
        retryingFindClick(submitButton);
        return new MainPage(driver);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
