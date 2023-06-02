import Core.Support.General.Hooks;
import GlobeDr.Pages.Account.SelectAccount;
import GlobeDr.Pages.Appointment.OrgAppointment;
import GlobeDr.Pages.Appointment.UserAppointment;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import GlobeDr.Pages.Pages.OrgPage;
import GlobeDr.Pages.Pages.Payment;
import GlobeDr.Pages.Pages.UserPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Appointment_Test extends Hooks {
    @BeforeMethod
    public void setup() {
        before();
        beforeWeb();
    }

    @AfterMethod
    public void tearDown() {
        after();
    }
    String id ;

    @Test(priority = 1)
    public void UserAppointment_Firsttimeexamination() throws InterruptedException {
        HomePage homePage = new HomePage(false);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259526", "123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(false);
        userPage.clickonAppointment_User();

        UserAppointment appointment = new UserAppointment(true);
        SelectAccount selectAccount = new SelectAccount(false);
        appointment.clickonCreateAppointment();
        selectAccount.selectAccount("Nam");
        appointment.selectHospitalClinic("BỆNH VIỆN TRƯNG VƯƠNG");
        appointment.selectServices("Khám lần đầu","","T2","","Buổi chiều","BS Tâm");
        appointment.sendPhoneNumber("18001668");
        appointment.clickonBillingInfoTax();
        appointment.sendCompanyName("Globedr");
        appointment.sendCompanyAddress("Sky Center");
        appointment.sendCompanyTaxCode("0303963259526");
        appointment.clickonPaymentAppointment();
        Payment payment = new Payment(false);
        payment.clickPayment("4111-1111-1111-1111","Vu Thuy My","05","25","787");
        id = appointment.getIDAppointment();
    }

    @Test(priority = 2)
    public void OrgAppointment_Firsttimeexamination() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0987654322", "123456");
        loginPage.waitForPageLoadComplete();

        OrgPage orgPage = new OrgPage(true);
        orgPage.clickonAppointment();

        OrgAppointment orgAppointment = new OrgAppointment(true);
        orgAppointment.sendIDAppointment(id);
        orgAppointment.clickonDone();
        orgAppointment.clickonSave();
        Assert.assertTrue(OrgAppointment.getToastMessage().contains("Thành công"));
        System.out.println(OrgAppointment.getToastMessage());

    }

    @Test(priority = 3)
    public void UserAppointment_Reemamination() throws InterruptedException {
        HomePage homePage = new HomePage(false);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259526", "123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(false);
        userPage.clickonAppointment_User();

        UserAppointment appointment = new UserAppointment(true);
        SelectAccount selectAccount = new SelectAccount(false);
        appointment.clickonCreateAppointment();
        selectAccount.selectAccount("Nam con (Con)");
        appointment.selectHospitalClinic("BỆNH VIỆN TRƯNG VƯƠNG");
        appointment.selectServices("Tái khám","Gây mê","","26/01/2023","","");
        appointment.selectSession("Buổi sáng, 07h30-11h30");
        appointment.sendPhoneNumber("18001668");
        appointment.clickonBillingInfoTax();
        appointment.sendCompanyName("Globedr");
        appointment.sendCompanyAddress("Sky Center");
        appointment.sendCompanyTaxCode("0303963259526");
        appointment.clickonPaymentAppointment();
        Payment payment = new Payment(false);
        payment.clickPayment("4111-1111-1111-1111","Vu Thuy My","05","25","787");
        id = appointment.getIDAppointment();
    }

    @Test(priority = 4)
    public void OrgAppointment_Reemamination() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0987654322", "123456");
        loginPage.waitForPageLoadComplete();

        OrgPage orgPage = new OrgPage(true);
        orgPage.clickonAppointment();

        OrgAppointment orgAppointment = new OrgAppointment(true);
        orgAppointment.sendIDAppointment(id);
        orgAppointment.clickonDone();
        orgAppointment.clickonSave();
        Assert.assertTrue(OrgAppointment.getToastMessage().contains("Thành công"));
        System.out.println(OrgAppointment.getToastMessage());
    }
}
