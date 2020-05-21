import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = basePage.logOut();
        loginPage.isVisible(loginPage.logo);
    }

}
