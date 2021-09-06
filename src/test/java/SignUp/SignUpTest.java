package SignUp;

import Pages.LoginPage;
import Pages.SignUpPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Common.TestData.SUCCESS_MSG;

public class SignUpTest extends BaseTest {

    @Test(description = "As a user I should be able to sign-up as a customer")
    public void signUpSuccessfully() {
        SignUpPage signUpPage = homePage.clickSignUpTab();
        signUpPage.signupDetails();
        LoginPage loginPage = signUpPage.clickSignUpButton();
        Assert.assertEquals(loginPage.getSuccessfulMsg(), SUCCESS_MSG);
    }

    @Test(description = "As a user I should be able to sign-up as a supplier")
    public void signUpAsASupplierSuccessful() {
        SignUpPage signUpPage = homePage.clickSignUpTab();
        signUpPage.signupDetails();
        signUpPage.selectSupplierAccountType();
        LoginPage loginPage = signUpPage.clickSignUpButton();
        Assert.assertEquals(loginPage.getSuccessfulMsg(), SUCCESS_MSG);
    }

    @Test(description = "As a user I should be able to sign-up as a agent")
    public void signUpAsAAgentSuccessful() {
        SignUpPage signUpPage = homePage.clickSignUpTab();
        signUpPage.signupDetails();
        signUpPage.selectAgentAccountType();
        LoginPage loginPage = signUpPage.clickSignUpButton();
        Assert.assertEquals(loginPage.getSuccessfulMsg(), SUCCESS_MSG);
    }
}