import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector(".skip-link.skip-account .label")).click();
        driver.findElement(By.cssSelector("#header-account .links li:nth-child(6) a")).click();
        driver.findElement(By.id("email")).sendKeys("test@yopmail.com");
        driver.findElement(By.id("pass")).sendKeys("test123");
        driver.findElement(By.id("send2")).click();

    }

}
