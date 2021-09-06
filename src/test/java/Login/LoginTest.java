package Login;

import Pages.LoginPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginSuccessfully() {
        LoginPage loginPage = homePage.clickLoginTab();
        loginPage.loginDetails();
        loginPage.clickLoginButton();
    }
}