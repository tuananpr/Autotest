import Core.Support.General.Hooks;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Test extends Hooks {
    @BeforeMethod
    public void setup() {
        before();
        beforeWeb();
    }

    @AfterMethod
    public void tearDown() {
        after();

    }
    String userID = "987654326";
    String userEmail = "nvnthm@hm.vn";
    String pass = "123456";
    @Test (priority = 1)
    public void Login_successfully_ID() throws InterruptedException {
        HomePage homePage = new HomePage(false);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login(userID,pass);
        loginPage.waitForPageLoadComplete();
        loginPage.label_personalPage(userID);
    }

//    @Test (priority = 2)
//    public void Login_successfully_Email() throws InterruptedException {
//        HomePage homePage = new HomePage(false);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login(userEmail,pass);
//        loginPage.waitForPageLoadComplete();
//        loginPage.label_personalPage(userEmail);
//    }
}
