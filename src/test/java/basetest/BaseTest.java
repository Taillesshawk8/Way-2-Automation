package basetest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Applications.bankingapplication.BankingApplication;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    private WebDriver driver;
    protected BankingApplication app;

    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @BeforeEach
    public void goHome(){
        driver.navigate().to("https://www.way2automation.com/angularjs-protractor/banking/#/login");
        app = new BankingApplication(driver);
    }

    @AfterAll
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
