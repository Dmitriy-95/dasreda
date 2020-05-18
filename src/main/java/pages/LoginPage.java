package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "mailbox:login")
    public WebElement emailField;

    @FindBy(id = "mailbox:password")
    public WebElement passwordField;

    @FindBy(xpath = ".//label[@id='mailbox:submit']/input")
    public WebElement submitButton;

    @FindBy(id = "logo")
    public WebElement logo;

    public void successLogin(String email, String password){
        weitForElementWisible(emailField);
        emailField.sendKeys(email);
        submitButton.click();
        weitForElementWisible(passwordField);
        passwordField.sendKeys(password);
        submitButton.click();
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
