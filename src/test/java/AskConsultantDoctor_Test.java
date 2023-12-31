import Core.Support.General.Hooks;
import GlobeDr.Pages.AskConsultantDoctor.Doctor;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AskConsultantDoctor_Test extends Hooks {
    @BeforeTest

    public void setup(){
        before();
        beforeWeb();
    }

    @AfterTest

    public void tearDown(){
        after();
    }
    String id = "413946";

//    @Test (priority = 1)
//    public void UserAskConsultantDoctor() throws InterruptedException {
//        HomePage homePage = new HomePage(false);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login("0963259524","123456");
//
//        UserPage userPage = new UserPage(false);
//        userPage.selectFeature("Hỏi bác sĩ tư vấn");
//
//        UserAskConsultantDoctor userAskConsultantDoctor = new UserAskConsultantDoctor(false);
//        SelectAccount selectAccount = new SelectAccount(false);
//        userAskConsultantDoctor.clickonCreateNewQuestion();
//        selectAccount.selectAccount("Tuan");
//        userAskConsultantDoctor.send_Height("178");
//        userAskConsultantDoctor.send_Weight("78");
//        userAskConsultantDoctor.send_Temperature("38");
//        userAskConsultantDoctor.send_Question("[Auto] Câu hỏi về răng miệng, tôi muốn biết răng tôi dạo này hay đau nhức");
//        userAskConsultantDoctor.clickon_ChooseDisease("Răng miệng");
//        userAskConsultantDoctor.send_ImageQuestion("avatar.png");
//        userAskConsultantDoctor.clickon_Create();
//        id = userAskConsultantDoctor.get_IDConsultant();
//    }

//    @Test (priority = 2)
//    public void CoordinatorEditSpecialty() throws InterruptedException {
//        HomePage homePage = new HomePage(true);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login("096325952516","123456");
//
//        OrgPage orgPage = new OrgPage(false);
//        orgPage.selectManagement("Vào trang điều phối viên","","Điều phối viên");
//
//        Coordinator coordinator = new Coordinator(false);
//        coordinator.clickon_Dropdown(id);
//        coordinator.clickon_Dropdown_EditSpecialty();
//        coordinator.select_EditSpecialty("Nhi khoa","Tự động");
//        coordinator.clickon_Dropdown(id);
//        coordinator.clickon_Dropdown_InviteDoctor("BS.TUAN.27");
//        id = coordinator.get_IDConsultant(id);
//    }

    @Test (priority = 3)
    public void Doctor() throws InterruptedException{
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("09632595251","123456");
        loginPage.waitForPageLoadComplete();

        Doctor doctor = new Doctor(false);
        doctor.select_Role("Vào trang hành nghề");
        doctor.clickon_AnswerConsultant();
        doctor.click_SearchName();
        doctor.send_ID(id);
        doctor.clickon_Dropdown(id);
        doctor.clickon_ViewDetail();
        doctor.clickon_Accept();
        doctor.send_AnswerQuestion("Bạn cần phải đi xét nghiệm máu nha.");
        doctor.clickon_PrescribeTest();
        doctor.select_Hospital("BỆNH VIỆN TRƯNG VƯƠNG");
        doctor.send_NamePrescribeTest("Mỡ Máu","LIPID - MỠ MÁU","Cholesterol");
        doctor.clickon_Completed();
        id = doctor.get_IDConsultant();
    }

//    @Test (priority = 4)
//    public void CordinatorInviteAuditor() throws InterruptedException{
//        HomePage homePage = new HomePage(false);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.waitForPageLoadComplete();
//        loginPage.login("096325952516","123456");
//
//        Coordinator coordinator = new Coordinator(false);
//        coordinator.clickon_Role("Vào trang điều phối viên");
//        coordinator.clickon_Coordinator();
//        coordinator.clickon_SearchByName();
//        coordinator.send_IDConsultant(id);
//        coordinator.clickon_Dropdown(id);
//        coordinator.clickon_ViewDetail();
//        coordinator.clickon_InviteAuditor();
//        coordinator.send_NameAuditor("Tuấn");
//        coordinator.clickon_SearchAuditor();
//        coordinator.select_Auditor("MR TUẤN(AUDITOR)");
//        id = coordinator.get_IDConsultant(id);
//    }
//
//    @Test (priority = 5)
//    public void Auditor() throws InterruptedException{
//        HomePage homePage = new HomePage(true);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.waitForPageLoadComplete();
//        loginPage.login("0963259525128","123456");
//
//        Auditor auditor = new Auditor(false);
//        auditor.clickon_Auditor();
//        auditor.clickon_SearchByName();
//        auditor.send_ID(id);
//        auditor.clickon_Dropdown();
//        auditor.clickon_ViewDetail();
//        auditor.clickon_AgreeWithThisAnswer();
//        id = auditor.get_IDConsultant();
//    }
//
//    @Test (priority = 5)
//    public void CoordinatorCloseQuestion() throws InterruptedException{
//        HomePage homePage = new HomePage(true);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.waitForPageLoadComplete();
//        loginPage.login("096325952516","123456");
//
//        Coordinator coordinator = new Coordinator(false);
//        coordinator.clickon_Role("Vào trang điều phối viên");
//        coordinator.clickon_Coordinator();
//        coordinator.clickon_SearchByName();
//        coordinator.send_IDConsultant(id);
//        coordinator.clickon_Dropdown(id);
//        coordinator.clickon_CloseQuestion();
//        Assert.assertTrue(Coordinator.getToastMessage().contains("Thành công"),"Thành công");
//        System.out.println("CoordinatorCloseQuestion" + Coordinator.getToastMessage());
//    }
}
