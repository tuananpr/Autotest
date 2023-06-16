import Core.Support.General.Hooks;
import GlobeDr.Pages.Account.SelectAccount;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import GlobeDr.Pages.MedicalTest.OrgMedicalTest;
import GlobeDr.Pages.MedicalTest.UserMedicalTest;
import GlobeDr.Pages.Modules.Calendar;
import GlobeDr.Pages.Pages.OrgPage;
import GlobeDr.Pages.Pages.UserPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Medical_Test extends Hooks {
    @BeforeTest
    public void setup() {
        before();
        beforeWeb();
    }
    @AfterTest
    public void tearDown() {
        System.out.println("after..................................");
        after();
    }

    @DataProvider(name = "user_Order_MedicalTest" , parallel = false)
            public Object[][] data_user(){
        return new Object[][]{{"0963259524","123456", "Xét nghiệm", "Tuan24", "Diag", "Tại phòng xét nghiệm", "10/07/2023", "Amylase"}};
    }

    @DataProvider(name = "org_Diag_Assign_Sampling_Staff" , parallel = false)
            public Object[][] data_org(){
        return new Object[][]{{"0987654322","123456","Quản lý bệnh viện/phòng khám","Diag","Danh sách xét nghiệm","Chỉ định nhân viên"}};
    }
    String id ;

    @Test (priority = 1, dataProvider = "user_Order_MedicalTest")
    public void UserOrderMedicalTestAtlab(String userID,
                                          String userPassWord,
                                          String feature,
                                          String accountName,
                                          String orgName,
                                          String methodSampleTest,
                                          String dateOrderMedicalTest,
                                          String nameTest) throws InterruptedException {

        HomePage homePage = new HomePage(true);
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login(userID,userPassWord);

        UserPage userPage = new UserPage(false);
        userPage.selectFeature(feature);

        Calendar calendar = new Calendar(false);
        UserMedicalTest userMedicalTest = new UserMedicalTest(false);
        SelectAccount selectAccount = new SelectAccount(false);

        userMedicalTest.clickonOrderMedicalTest();
        selectAccount.selectAccount(accountName);
        userMedicalTest.selectMedilab(orgName);
        userMedicalTest.selectMethodSampleTest(methodSampleTest);
        calendar.selectDate(dateOrderMedicalTest);
        userMedicalTest.clickonSelectATestType();
        userMedicalTest.sendNameMedicalTest(nameTest);
        userMedicalTest.clickonView_ConfirmSelectedMedicalTest();
        id = userMedicalTest.getIDOrderMedicalTest();
    }

    @Test(priority = 2, dataProvider = "org_Diag_Assign_Sampling_Staff")
    public void OrgAssignSamplingStaff(String orgID,
                                       String orgPassWord,
                                       String role,
                                       String nameOrg,
                                       String feature,
                                       String assign) throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login(orgID,orgPassWord);
        loginPage.waitForPageLoadComplete();

        OrgPage orgPage = new OrgPage(true);
        orgPage.selectManagement(role,nameOrg,feature);

        OrgMedicalTest orgMedicalTest = new OrgMedicalTest(false);
        orgMedicalTest.searchMedicalTestByID(id);
        orgMedicalTest.selectOption(assign);
        orgMedicalTest.selectDiagStaff("NHÂN VIÊN ORG");
        Assert.assertTrue(OrgMedicalTest.getNameStaff().contains("Nhân viên Org"));
        System.out.println("SampingStaff: " + OrgMedicalTest.getNameStaff());
    }
}

