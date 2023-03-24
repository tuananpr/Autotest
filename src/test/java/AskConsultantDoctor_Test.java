import Core.Support.General.Hooks;
import GlobeDr.Pages.AskConsultantDoctor.Auditor;
import GlobeDr.Pages.AskConsultantDoctor.Coordinator;
import GlobeDr.Pages.AskConsultantDoctor.Doctor;
import GlobeDr.Pages.AskConsultantDoctor.UserAskConsultantDoctor;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AskConsultantDoctor_Test extends Hooks {
    @BeforeMethod
    public void setup(){
        before();
        beforeWeb();
    }

    @AfterMethod
    public void tearDown(){
        after();
    }
    String id;

    @Test (priority = 1)
    public void UserAskConsultantDoctor() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();
        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0987654326","123456");
        loginPage.waitForPageLoadComplete();

        UserAskConsultantDoctor userAskConsultantDoctor = new UserAskConsultantDoctor(false);
        userAskConsultantDoctor.clickon_Appointment();
        userAskConsultantDoctor.clickon_CreateNewQuestion();
        userAskConsultantDoctor.select_User("BN.Tuan.26");
        userAskConsultantDoctor.send_Height("178");
        userAskConsultantDoctor.send_Weight("78");
        userAskConsultantDoctor.send_Temperature("38");
        userAskConsultantDoctor.send_Question("[Auto] Câu hỏi về răng miệng, tôi muốn biết răng tôi dạo này hay đau nhức");
        userAskConsultantDoctor.clickon_ChooseDisease("Răng miệng");
        userAskConsultantDoctor.send_ImageQuestion("avatar.png");
        userAskConsultantDoctor.clickon_Create();
        id = userAskConsultantDoctor.get_IDConsultant();
    }

    @Test (priority = 2)
    public void CoordinatorEditSpecialty() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();
        LoginPage loginPage = new LoginPage(true);
        loginPage.login("096325952516","123456");
        loginPage.waitForPageLoadComplete();

        Coordinator coordinator = new Coordinator(false);
        coordinator.clickonRole("Vào trang điều phối viên");
        coordinator.clickonCoordinator();
        coordinator.clickonSearchByName();
        coordinator.sendIDConsultant(id);
        coordinator.clickonFilter();
        coordinator.clickonDropdown();
        coordinator.clickon_Edit_Specialty();
        coordinator.select_Edit_Specialty("Tâm lý");
        coordinator.clickonInviteDoctor();
        coordinator.clickonSearchDoctor();
        coordinator.selectDoctor("BS TÂM");
        coordinator.clickon_Done();
        Assert.assertTrue(Coordinator.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("CoordinatorInviteDoctor" + Coordinator.getToastMessage());
    }

    @Test (priority = 2)
    public void CoordinatorInviteDoctor() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();
        LoginPage loginPage = new LoginPage(true);
        loginPage.login("096325952516","123456");
        loginPage.waitForPageLoadComplete();

        Coordinator coordinator = new Coordinator(false);
        coordinator.clickonRole("Vào trang điều phối viên");
        coordinator.clickonCoordinator();
        coordinator.clickonSearchByName();
        coordinator.sendIDConsultant(id);
        coordinator.clickonFilter();
        coordinator.clickonDropdown();
        coordinator.clickonViewDetail();
        coordinator.clickonInviteDoctor();
        coordinator.clickonSearchDoctor();
        coordinator.selectDoctor("BS TÂM");
        coordinator.clickon_Done();
        Assert.assertTrue(Coordinator.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("CoordinatorInviteDoctor" + Coordinator.getToastMessage());
    }

    @Test (priority = 3)
    public void Doctor() throws InterruptedException{
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("09632595251","123456");
        loginPage.waitForPageLoadComplete();

        Doctor doctor = new Doctor(false);
        doctor.selectRole("Vào trang hành nghề");
        doctor.clickonAnswerConsultant();
        doctor.clickSearchName();
        doctor.sendID(id);
        doctor.clickonFilter();
        doctor.clickonDropdown();
        doctor.clickonViewDetail();
        doctor.clickonAccept();
        doctor.clickonYes();
        doctor.sendAnswerQuestion("Bạn cần phải đi xét nghiệm máu nha.");
        doctor.clickonSend();
        doctor.clickonPrescribeTest();
        doctor.selectHospital("BỆNH VIỆN TRƯNG VƯƠNG");
        doctor.sendNamePrescribeTest("Mỡ Máu","LIPID - MỠ MÁU","Cholesterol");
        doctor.clickonConfirmTest();
        doctor.clickonCompleted();
        doctor.clickonYes();
        Assert.assertTrue(Coordinator.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("Doctor" + Coordinator.getToastMessage());
    }

    @Test (priority = 4)
    public void CordinatorInviteAuditor() throws InterruptedException{
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.waitForPageLoadComplete();
        loginPage.login("096325952516","123456");

        Coordinator coordinator = new Coordinator(false);
        coordinator.clickonRole("Vào trang điều phối viên");
        coordinator.clickonCoordinator();
        coordinator.clickonSearchByName();
        coordinator.sendIDConsultant(id);
        coordinator.clickonFilter();
        coordinator.clickonDropdown();
        coordinator.clickonViewDetail();
        coordinator.clickonInviteAuditor();
        coordinator.sendNameAuditor("Tuấn");
        coordinator.clickonSearchAuditor();
        coordinator.selectAuditor("Mr Tuấn(Auditor)");
        coordinator.clickon_Done();
        Assert.assertTrue(Coordinator.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("CordinatorInviteAuditor" + Coordinator.getToastMessage());
    }

    @Test (priority = 5)
    public void Auditor() throws InterruptedException{
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.waitForPageLoadComplete();
        loginPage.login("0963259525128","123456");

        Auditor auditor = new Auditor(false);
        auditor.clickonAuditor();
        auditor.clickonSearchByName();
        auditor.sendID(id);
        auditor.clickonDropdown();
        auditor.clickonViewDetail();
        auditor.clickonAgreeWithThisAnswer();
        auditor.clickonAccept();
        Assert.assertTrue(Coordinator.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("Auditor" + Coordinator.getToastMessage());
    }

    @Test (priority = 5)
    public void CoordinatorCloseQuestion() throws InterruptedException{
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.waitForPageLoadComplete();
        loginPage.login("096325952516","123456");

        Coordinator coordinator = new Coordinator(false);
        coordinator.clickonRole("Vào trang điều phối viên");
        coordinator.clickonCoordinator();
        coordinator.clickonSearchByName();
        coordinator.sendIDConsultant(id);
        coordinator.clickonFilter();
        coordinator.clickonDropdown();
        coordinator.clickonViewDetail();
        coordinator.clickonCloseQuestion();
        coordinator.clickonOK();
        Assert.assertTrue(Coordinator.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("CoordinatorCloseQuestion" + Coordinator.getToastMessage());
    }
}
