import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {



    public void addToWishListTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector(".skip-link.skip-account .label")).click();
        driver.findElement(By.cssSelector("#header-account .links li:nth-child(6) a")).click();
        driver.findElement(By.id("email")).sendKeys("test@yopmail.com");
        driver.findElement(By.id("pass")).sendKeys("test123");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".nav-primary li.parent:nth-child(5) a")).click();
        driver.findElement(By.cssSelector("h2.product-name a")).click();
        driver.findElement(By.cssSelector(".add-to-links .link-wishlist")).click();
        Thread.sleep(2000);

        driver.close();




    }
}
