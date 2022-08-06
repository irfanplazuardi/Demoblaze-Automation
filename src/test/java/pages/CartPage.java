package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) { this.driver = driver; }

    By Products = By.xpath("//*[@id=\"page-wrapper\"]/div/div[1]/h2");
    By Placeorder = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By Name = By.id("name");
    By Country = By.id("country");
    By City = By.id("city");
    By CreditCard = By.id("card");
    By Month = By.id("month");
    By Year = By.id("year");
    By Purchase = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By Thankyou = By.xpath("/html/body/div[10]/h2");
    By Ok = By.xpath("/html/body/div[10]/div[7]/div/button");

    public String getProducts() {
        String productshead= driver.findElement(Products).getText();
        return productshead;
    }
    public void clickPlaceorder() {driver.findElement(Placeorder).click();}
    public void enterName() { driver.findElement(Name).sendKeys("Irfan"); }
    public void enterCountry() { driver.findElement(Country).sendKeys("Indonesia"); }
    public void enterCity() { driver.findElement(City).sendKeys("Jakarta"); }
    public void enterCreditCard() { driver.findElement(CreditCard).sendKeys("123456"); }
    public void enterMonth () { driver.findElement(Month).sendKeys("August"); }
    public void enterYear() { driver.findElement(Year).sendKeys("2022"); }
    public void clickPurchase() {driver.findElement(Purchase).click();}
    public String getThankyou() {
        String Thankyouver= driver.findElement(Thankyou).getText();
        return Thankyouver;
    }
    public void clickOk() {driver.findElement(Ok).click();}



}
