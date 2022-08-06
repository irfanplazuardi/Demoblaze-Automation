package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    WebDriver driver;

    public ItemPage(WebDriver driver) { this.driver = driver; }

    By SamsungS6 = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By Addtocart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public void clickSamsungS6() {driver.findElement(SamsungS6).click();}
    public void clickAddtocart() {driver.findElement(Addtocart).click();}
}
