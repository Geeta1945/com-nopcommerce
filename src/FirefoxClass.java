import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
Opening the login page for Nop commerce and entering email Id and password.
We are also getting title of the page, current Url and page source
 */
public class FirefoxClass {

    public static void main(String[] args) {
        String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver_FireFox = new FirefoxDriver();
        driver_FireFox.get(baseUrl); // open URL
        System.out.println("Title of the page  : "+driver_FireFox.getTitle());// printing the title of the page
        System.out.println("Current Url page : "+driver_FireFox.getCurrentUrl());// printing the current url
        System.out.println("Page Source : "+driver_FireFox.getPageSource());// printing the page source
        WebElement emailId= driver_FireFox.findElement(By.id("Email")); //find email element
        emailId.sendKeys("mygoogle@gmail.com");// entering the email address
        WebElement emailPassword = driver_FireFox.findElement(By.name("Password")); // finding password element from the Url
        emailPassword.sendKeys("Iamback456");// entering password to password field
        driver_FireFox.close();// closing the Url
    }
}
