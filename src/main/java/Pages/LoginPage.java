package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static Common.TestData.EMAIL;
import static Common.TestData.PASSWORD;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "email")
    WebElement loginEmail;
    @FindBy(how = How.NAME, using = "password")
    WebElement loginPassword;
    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success signup']")
    WebElement signUpSuccessfulMsg;
    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")
    WebElement loginButton;


    public void loginDetails() {
        loginEmail.sendKeys(EMAIL);
        loginPassword.sendKeys(PASSWORD);
    }

    public DashboardPage clickLoginButton() {
        loginButton.click();
        return new DashboardPage(driver);
    }

    public String getSuccessfulMsg() {
        return signUpSuccessfulMsg.getText();
    }
}