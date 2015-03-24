package pack;

/**
 * Created by prashanth_sams on 04/03/15.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTest {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.co.in";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void Test01() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.name("q")).sendKeys("Prashanth Sams");
        driver.findElement(By.name("q")).clear();
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Selenium Essentials");
        driver.findElement(By.name("q")).clear();
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Seleniumworks.com");
        driver.findElement(By.name("q")).clear();
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("ByPassHacker");
        System.out.println("I am one");
    }

    @Test
    public void Test02() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.name("q")).sendKeys("Prashanth Sams");
        driver.findElement(By.name("q")).clear();
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Selenium Essentials");
        driver.findElement(By.name("q")).clear();
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Seleniumworks.com");
        driver.findElement(By.name("q")).clear();
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("ByPassHacker");
        System.out.println("I am two");
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}

