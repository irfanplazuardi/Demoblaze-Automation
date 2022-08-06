package pages;

import net.bytebuddy.implementation.bind.annotation.This;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) { this.driver = driver; }

    By Home = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]");

    By Contact = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");

    By AboutUs = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");

    By Cart = By.id("cartur");

    By Login = By.id("login2");

    By Signup = By.id("signin2");

    By logout = By.id("logout2");

    By Contactemail = By.id("recipient-email");
    By Contactname = By.id("recipient-name");
    By Contactmessage = By.id("message-text");
    By Sendmessage = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

    By Playbtn = By.xpath("//*[@id=\"example-video\"]/button");




    public void clickHome() { driver.findElement(Home).click(); }
    public void clickContact() {driver.findElement(Contact).click();}
    public void clickAboutUs() {driver.findElement(AboutUs).click();}
    public void clickCart() {driver.findElement(Cart).click();}
    public void clickLogin() {driver.findElement(Login).click();}
    public void clickSignup() {driver.findElement(Signup).click();}
    public void clickLogout() {driver.findElement(logout).click();}
    public void enterContactemail(String email) {driver.findElement(Contactemail).sendKeys(email);}
    public void enterContactname(String name) {driver.findElement(Contactname).sendKeys(name);}
    public void enterContactmessage(String message) {driver.findElement(Contactmessage).sendKeys(message);}
    public void clickSendmessage() {driver.findElement(Sendmessage).click();}
    public void clickPlaybtn() {driver.findElement(Playbtn).click();}

}
