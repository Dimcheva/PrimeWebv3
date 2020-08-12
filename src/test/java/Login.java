import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.InterruptedIOException;

public class Login {

    public static void main(String[] args) throws InterruptedIOException {


        System.setProperty("webdriver.chrome.driver", "C:\\myWork\\project assets\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


         driver.get("http://dev-prime.protal.biz/login");
         driver.manage().window().fullscreen();
         driver.findElement(By.id("email")).sendKeys("irina.dimcheva@primeholding.com");
         driver.findElement(By.id("password")).sendKeys(("GehK#z@9Kv7Jry22"));
         driver.findElement(By.cssSelector("[class='button-text']")).click();
         driver.findElement(By.className("agreement-text")).click();


    }
}



