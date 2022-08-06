package testCases.positive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class Contact {

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

        home.clickContact();

        Thread.sleep(3000);

        home.enterContactemail("irfanplazuardi@gmail.com");
        home.enterContactname("irfan");
        home.enterContactmessage("good");
        home.clickSendmessage();

        Thread.sleep(3000);

        driver.quit();

    }
}
