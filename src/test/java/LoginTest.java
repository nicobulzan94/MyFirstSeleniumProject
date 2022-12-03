import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public void loginWithValidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector(".skip-link.skip-account .label")).click();
        driver.findElement(By.cssSelector("#header-account .links li:nth-child(6) a")).click();
        driver.findElement(By.id("email")).sendKeys("test@yopmail.com");
        driver.findElement(By.id("pass")).sendKeys("test123");
        driver.findElement(By.id("send2")).click();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector(".welcome-msg .hello strong"));

        String expectedText = "Hello, test test tester!";
        String actualText = welcomeTextElement.getText();

        if (actualText.equals(expectedText)){
            System.out.println("S-a logat cu success!");
        }else
            System.err.println("Nu s-a logat. ");

        Thread.sleep(2000);

        driver.close();
    }
}
