package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    WebDriver driver;

    public SignupPage(WebDriver driver) { this.driver = driver; }

    By SignupHead = By.id("signInModalLabel");

    By SignupUsername = By.id("sign-username");

    By SignupPassword = By.id("sign-password");

    By SignupBtn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");



    public String getSignupHead() {
        String signuphead= driver.findElement(SignupHead).getText();
        return signuphead;
    }

    public void enterSignupUsername(String username) { driver.findElement(SignupUsername).sendKeys(username); }
    public void enterSignupPassword(String password) { driver.findElement(SignupPassword).sendKeys(password); }
    public void clickSignUpBtn() {driver.findElement(SignupBtn).click();}
}
