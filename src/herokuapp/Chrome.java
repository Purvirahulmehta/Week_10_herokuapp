package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");//getting path for chrome driver
        WebDriver driver= new ChromeDriver();//creating object for Chrome driver
        driver.get(baseUrl);//open given URL
        String currentUrl=driver.getCurrentUrl();//getting current url
        System.out.println(currentUrl);
        String pageSource=driver.getPageSource();//getting page source
        System.out.println(pageSource);
        WebElement emailField=driver.findElement(By.name("username"));
        emailField.sendKeys("Jaihind");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Bharat");
        driver.close();
        }

    }

