import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
/*
Opening the login page for Nop commerce and entering email Id and password.
We are also getting title of the page, current Url and page source
 */
public class EdgeClass {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F"; // saving nopcommerce url in string baseUrl
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe"); // setting up driver's property
        WebDriver driver = new EdgeDriver(); // set up driver object
        driver.get(baseUrl); // open URL
        System.out.println("Title of the page : "+driver.getTitle());// printing the title of the page
        System.out.println("Current Url Page  :  "+driver.getCurrentUrl());// printing the current url
        System.out.println("Page Source    :   "+ driver.getPageSource()); // printing the page source
        WebElement emailId = driver.findElement(By.id("Email"));
        emailId.sendKeys("myemail@yahoo.co.uk"); // entering the email address to email field
        WebElement emailPassword = driver.findElement(By.name("Password"));
        emailPassword.sendKeys("itsme123"); // entering password to password field
       driver.close(); // closing the browser



    }


}
