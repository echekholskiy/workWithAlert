import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class workWithAlert {
    static WebDriver driver;
    static WebDriverWait wait1;
    static WebDriverWait wait2;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        driver = new FirefoxDriver();
        //driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://plavnik.by/");
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("confirm('Are you stupid?')");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();

    }



}
