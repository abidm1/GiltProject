import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class BaseClass {

    public static WebDriver driver;

    public void openBrowser(String URL) {
        driver = new ChromeDriver();
        driver.get(URL);
    }



//    void closeBrowser(){
//        driver.quit();
//    }
    }
