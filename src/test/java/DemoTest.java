import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {
    private WebDriver driver;

    @BeforeMethod
    public void before() {
        driver = new FirefoxDriver();
    }

    @Test
    public void test() {
        driver.get("https://www.ukr.net/");
        Assert.assertTrue(driver.getCurrentUrl().contains("ukr.net"));
    }

    @AfterMethod
    public  void after(){
        driver.quit();
    }
}
