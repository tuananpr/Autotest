import Core.Support.General.Hooks;
import GlobeDr.Pages.Account.SelectAccount;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import GlobeDr.Pages.MedicalTest.UserMedicalTest;
import GlobeDr.Pages.Modules.Calendar;
import GlobeDr.Pages.Pages.UserPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MedicalTest extends Hooks {
    @BeforeTest
    public void setup() {
        before();
        beforeWeb();
    }
//    @AfterTest
//    public void tearDown(){
//        after();
//    }
    String UserID = "0963259524";
    String UserPassWord = "123456";
    String AccountName = "Tuan24";
    String OrgMedicalTest = "Diag";
    String MethodSampleTest = "Tại phòng xét nghiệm";
    String DateOrderMedicalTest = "10/07/2023" ;
    String GroupTest = "GÓI XÉT NGHIỆM";

    @Test (priority = 1)
    public void UserOrderMedicalTestAtlab() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login(UserID,UserPassWord);
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(false);
        UserMedicalTest userMedicalTest = new UserMedicalTest(false);
        Calendar calendar = new Calendar(false);
        SelectAccount selectAccount = new SelectAccount(false);

        userPage.clickonMedicalTest();
        userMedicalTest.clickonOrderMedicalTest();
        selectAccount.selectAccount(AccountName);
        userMedicalTest.selectMedilab(OrgMedicalTest);
        userMedicalTest.selectMethodSampleTest(MethodSampleTest);
        calendar.selectDate(DateOrderMedicalTest);
        userMedicalTest.clickonSelectATestType();
        userMedicalTest.selectGroupTest(GroupTest);
        userMedicalTest.sendNameMedicalTest("Điện Não Đồ");
    }
}
