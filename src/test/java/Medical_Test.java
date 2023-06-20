import Core.Support.General.Hooks;
import GlobeDr.Pages.Account.DataProviderFactory;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import GlobeDr.Pages.MedicalTest.OrgMedicalTest;
import GlobeDr.Pages.Pages.OrgPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Medical_Test extends Hooks {


    @BeforeMethod
    public void setup() {
        before();
        beforeWeb();
    }

//    @AfterMethod
//    public void tearDown() {
//        after();
//    }

    String id = "217794" ;

//    @Test (priority = 1, dataProvider = "mergedDataProvider" ,dataProviderClass = DataProviderFactory.class)
//    public void UserOrderMedicalTestAtlab(HashMap<String, String> data) throws InterruptedException {
//
//        HomePage homePage = new HomePage(true);
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login(data.get("userId"),data.get("userPass"));
//
//        UserPage userPage = new UserPage(false);
//        userPage.selectFeature(data.get("medicalTest"));
//
//        Calendar calendar = new Calendar(false);
//        UserMedicalTest userMedicalTest = new UserMedicalTest(false);
//        SelectAccount selectAccount = new SelectAccount(false);
//
//        userMedicalTest.clickonOrderMedicalTest();
//        selectAccount.selectAccount(data.get("selectMainAccount"));
//        userMedicalTest.selectMedilab(data.get("selectOrgMedicalTest"));
//        userMedicalTest.selectMethodSampleTest(data.get("selectMethodSampleTest"));
//        calendar.selectDate(data.get("selectDateOrderMedicalTest"));
//        userMedicalTest.clickonSelectATestType();
//        userMedicalTest.sendNameMedicalTest(data.get("selectNameMedicalTest"));
//        userMedicalTest.clickonView_ConfirmSelectedMedicalTest();
//        id = userMedicalTest.getIDOrderMedicalTest();
//        Assert.assertTrue(UserMedicalTest.getToastMessage().contains("Thành công"),"Thành công");
//    }

    @Test(priority = 2, dataProvider = "mergedDataProvider", dataProviderClass = DataProviderFactory.class)
    public void OrgAssignSamplingStaff(HashMap<String, String> data) throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login(data.get("orgId"),data.get("orgPass"));
        loginPage.waitForPageLoadComplete();

        OrgPage orgPage = new OrgPage(false);
        orgPage.selectManagement(data.get("ManageHospital/Clinic"),data.get("OrgDiag"),data.get("MedicalTestOrder"));

        OrgMedicalTest orgMedicalTest = new OrgMedicalTest(false);
        orgMedicalTest.searchMedicalTestByID(id);
        orgMedicalTest.selectOption(data.get("AssignSamplingStaff"));
        orgMedicalTest.selectDiagStaff(data.get("nameStaffDiag"));
        Assert.assertTrue(OrgMedicalTest.getNameStaff().contains("Nhân viên Org"));
        System.out.println("SampingStaff: " + OrgMedicalTest.getNameStaff());
    }
}

