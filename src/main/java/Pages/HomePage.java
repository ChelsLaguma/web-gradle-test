package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@class='theme-btn theme-btn-small waves-effect']")
    WebElement signupTab;
    @FindBy(how = How.XPATH, using = "//a[@class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']")
    WebElement loginTab;


    public SignUpPage clickSignUpTab() {
        signupTab.click();
        return new SignUpPage(driver);
    }

    public LoginPage clickLoginTab() {
        loginTab.click();
        return new LoginPage(driver);
    }
}