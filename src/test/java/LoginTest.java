import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("ivanovp-80@bk.ru", "A2RayoibIS3");
        MainPage mainPage = new MainPage(driver);
        mainPage.logOut();
    }


}
