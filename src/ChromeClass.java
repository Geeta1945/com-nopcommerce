import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Opening the login page for Nop commerce and entering email Id and password.
We are also getting title of the page, current Url and page source
 */

public class ChromeClass {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver_Chrome = new ChromeDriver();// set up driver object
        driver_Chrome.get(baseUrl); // OpenUrl
        System.out.println("Title of the page : " + driver_Chrome.getTitle());// Printing the title of the page
        System.out.println("Current Url Page : " + driver_Chrome.getCurrentUrl());// printing the current Url
        System.out.println("Page Source : " + driver_Chrome.getPageSource());// printing the page source
        WebElement emailField = driver_Chrome.findElement(By.id("Email"));// find email field element
        emailField.sendKeys("myChromId789@hotmail.com");// Entering email id
        WebElement emailPassword = driver_Chrome.findElement(By.name("Password"));// find password field element
        emailPassword.sendKeys("Itiswrong567");// entering password to password field*/

        driver_Chrome.close();

    }
}
