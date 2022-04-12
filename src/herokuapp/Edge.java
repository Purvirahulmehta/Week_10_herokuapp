package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String baseUrl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");//setting path for edge driver
        WebDriver driver=new EdgeDriver();
        driver.get(baseUrl);//opening the given url
        String title=driver.getTitle();
        System.out.println("Title of the given url is:" + title);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
        WebElement emailField=driver.findElement(By.name("username"));
        emailField.sendKeys("JaiHind");
        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.sendKeys("Bharat");
        driver.close();

    }
}
