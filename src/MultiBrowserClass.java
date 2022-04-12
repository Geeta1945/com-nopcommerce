import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserClass {

    static String browser= "Firefox";
    static String mainUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {

            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {

            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }

        driver.get(mainUrl);
        driver.manage().window().maximize();
        System.out.println("Title of the page : " + driver.getTitle());// Printing the title of the page
        System.out.println("Current Url Page : " + driver.getCurrentUrl());// printing the current Url
        System.out.println("Page Source : " + driver.getPageSource());// printing the page source


        WebElement emailField = driver.findElement(By.id("Email"));// find email field element
        emailField.sendKeys("myChromId789@hotmail.com");// Entering email id
        WebElement emailPassword = driver.findElement(By.name("Password"));// find password field element
        emailPassword.sendKeys("Itiswrong567");// entering password to password field*/
        driver.close();

    }
}