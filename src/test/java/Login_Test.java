import Core.Support.General.Hooks;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test extends Hooks {
    @BeforeTest
    public void setup() {
        before();
        beforeWeb();
    }

    @AfterTest
    public void tearDown() {
        after();
        //        afterWeb();
    }

    @Test
    public void Login_successfully() throws InterruptedException {
        HomePage homePage = new HomePage(false);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259526", "123456");
        loginPage.waitForPageLoadComplete();
    }
}
