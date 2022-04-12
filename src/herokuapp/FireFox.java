package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.SQLOutput;

public class FireFox {
    public static void main(String[] args) {
       String baseUrl= "http://the-internet.herokuapp.com/login";
       System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");//setting path for Firefox driver
        WebDriver driver= new FirefoxDriver();//CREATING object
        driver.get(baseUrl);//openning the given url
        System.out.println("Title of the page: " + driver.getTitle());//getting page title
        System.out.println("Current Url: " + driver.getCurrentUrl());//getting current url
        System.out.println("Page Source:"+driver.getPageSource());//getting page source
        WebElement emailField= driver.findElement(By.name("username"));
        emailField.sendKeys("JaiHind");
        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.sendKeys("Bharat");
        driver.close();


    }
}
