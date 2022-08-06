package testCases.positive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class PlaceOrder {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        SignupPage signup = new SignupPage(driver);
        ItemPage item = new ItemPage(driver);
        CartPage cart = new CartPage(driver);

        home.clickLogin();

        Thread.sleep(3000);

        login.getSigninHead();
        login.enterLoginUsername("dicoba");
        login.enterLoginPassword("123456");
        login.clickLoginBtn();

        Thread.sleep(3000);

        home.clickCart();

        Thread.sleep(3000);

        cart.getProducts();
        cart.clickPlaceorder();

        Thread.sleep(3000);

        cart.enterName();
        cart.enterCountry();
        cart.enterCity();
        cart.enterCreditCard();
        cart.enterMonth();
        cart.enterYear();

        cart.clickPurchase();

        Thread.sleep(3000);

        cart.getThankyou();
        cart.clickOk();

        Thread.sleep(3000);

        driver.quit();

    }
}
