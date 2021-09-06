package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static Common.TestData.*;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "first_name")
    WebElement firstNameField;
    @FindBy(how = How.NAME, using = "last_name")
    WebElement lastNameField;
    @FindBy(how = How.NAME, using = "phone")
    WebElement phoneField;
    @FindBy(how = How.NAME, using = "email")
    WebElement emailField;
    @FindBy(how = How.NAME, using = "password")
    WebElement passwordField;
    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")
    WebElement signUpButton;
    @FindBy(how = How.ID, using = "select2-account_type-container")
    WebElement accountTypeDropdown;
    @FindBy(how = How.XPATH, using = "//li[text()='Supplier']")
    WebElement supplierAccountType;
    @FindBy(how = How.XPATH, using = "//li[text()='Agent']")
    WebElement agentAccountType;

    public void signupDetails() {
        firstNameField.sendKeys(FIRSTNAME);
        lastNameField.sendKeys(LASTNAME);
        phoneField.sendKeys(PHONE);
        emailField.sendKeys(EMAIL);
        passwordField.sendKeys(PASSWORD);
    }

    public LoginPage clickSignUpButton() {
        signUpButton.click();
        return new LoginPage(driver);
    }

    public void selectSupplierAccountType() {
        accountTypeDropdown.click();
        supplierAccountType.click();
    }

    public void selectAgentAccountType() {
        accountTypeDropdown.click();
        agentAccountType.click();
    }
}