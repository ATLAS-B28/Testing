package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://profile.w3schools.com/login?redirect_url=https%3A%2F%2Fwww.w3schools.com%2F");

    }

    @AfterClass
    public void tearDown() {
       // driver.quit();
       // driver.close();
    }

    @Test
    public void testLoggingIntoApp() throws InterruptedException {
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.name("email"));
        //write the object
        email.sendKeys("dummy@htomail.com");
        var password = driver.findElement(By.name("password"));
        password.sendKeys("secret");
        driver.findElement(By.tagName("button")).click();
        //verify with testng
        Thread.sleep(2000);
        String actualRes = driver.findElement(By.className("WHUyzc")).getText();
        String expectedRes = "Sign in with Google";
        Assert.assertEquals(actualRes, expectedRes); //assertEquals(actualRes, expectedRes);
    }
}
