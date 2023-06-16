import Core.Support.General.Hooks;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import GlobeDr.Pages.MedicalTest.OrgMedicalTest;
import GlobeDr.Pages.Pages.OrgPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Clear_Data_Test extends Hooks {
    @BeforeTest
    public void setup(){
        before();
        beforeWeb();
    }

//    @AfterMethod
//    public void tearDown(){
//        after();
//    }

//    @Test
//    public void Clear_Data_Consultant() throws InterruptedException {
//        List<String> data = new ArrayList<>();
//        data.add("Đã gửi bác sĩ");
//        data.add("Đã tiếp nhận");
//        data.add("Bác sĩ đã trả lời");
//        data.add("Bác sĩ đã nhận");
//        data.add("Gửi cố vấn duyệt");
//
//        HomePage homePage = new HomePage(true);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login("096325952516", "123456");
//
//        PracticePage Approver = new PracticePage(false);
//        ApproverPage approverPage = new ApproverPage(false);
//        Approver.select_role("Vào trang điều phối viên");
//        Approver.select_feature("Điều phối viên");
//        approverPage.send_Name("BN.Tuan.26");
//        approverPage.clear_Data(data,"BN.Tuan.26");
//    }

//    @Test
//    public void Clear_Data_RCE() throws InterruptedException {
//        List<String> status = new ArrayList<>();
//        status.add("Mới");
//        status.add("Chờ xác nhận");
//        status.add("Đang chờ xác nhận");
//        status.add("Đang chờ tư vấn");
//        HomePage homePage = new HomePage(true);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login("0969617267", "123456");
//
//        OrgPage orgPage = new OrgPage(false);
//        orgPage.selectManagement("Quản lý bệnh viện/phòng khám","Diag","Danh sách xét nghiệm");
//
//        RCEPersonalPage rcePersonalPage = new RCEPersonalPage(true);
//        rcePersonalPage.waitForPageLoadComplete();
//        rcePersonalPage.clickon_Cancel_All_Order_RCE(status);
//    }

    @Test
    public void Clear_Data_MedicalTest() throws InterruptedException{
        List<String> status = new ArrayList<>();
        status.add("MỚI");
        status.add("BÁC SĨ ĐÃ CHỈ ĐỊNH");


        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0987654322", "123456");

        OrgPage orgPage = new OrgPage(false);
        orgPage.selectManagement("Quản lý bệnh viện/phòng khám","Diag","Danh sách xét nghiệm");
        OrgMedicalTest orgMedicalTest = new OrgMedicalTest(false);
        orgMedicalTest.clickonCancelOrderMedical(status);
    }
}
