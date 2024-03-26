import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomeTest extends BaseClass{

    HomePage home;

    @BeforeMethod
    void setUp(){
        openBrowser("https://www.gilt.com/");
        home = PageFactory.initElements(BaseClass.driver, HomePage.class);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();}

    @Test
    void testLogin(){
        home.logIn();
    }

    @Test
    void test1(){
        Assert.assertTrue(true);
    }

    @Test
    void test2(){
        Assert.assertTrue(true);
    }
}
