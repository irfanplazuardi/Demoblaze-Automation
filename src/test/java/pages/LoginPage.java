package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) { this.driver = driver; }

    By LoginHeading = By.id("logInModalLabel");
    By LoginUsername = By.id("loginusername");
    By LoginPassword = By.id("loginpassword");
    By LoginBtn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    public String getSigninHead() {
        String loginhead= driver.findElement(LoginHeading).getText();
        return loginhead;
    }

    public void enterLoginUsername(String User) { driver.findElement(LoginUsername).sendKeys(User); }
    public void enterLoginPassword(String Pass) { driver.findElement(LoginPassword).sendKeys(Pass); }
    public void clickLoginBtn() {driver.findElement(LoginBtn).click();}
}
