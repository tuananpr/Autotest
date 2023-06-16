import Core.Support.General.Hooks;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import GlobeDr.Pages.Pages.OrgPage;
import GlobeDr.Pages.Pages.UserPage;
import GlobeDr.Pages.RCE.RCEOrganizationPage;
import GlobeDr.Pages.RCE.RCEPersonalPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RCE_Test extends Hooks {
    @BeforeMethod
    public void setup() {
        before();
        beforeWeb();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("after..................................");
        after();
    }
    String ID;
    @Test (priority = 1)
    public void RCEopenNewOrder() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.waitForPageLoadComplete();
        loginPage.login("0963259526", "123456");

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonRCE_User();

        RCEPersonalPage rcePersonalPage = new RCEPersonalPage(true);
        rcePersonalPage.clickonRCEOrder();
        rcePersonalPage.sendImageOrderMedical("doremon.jpg");
        rcePersonalPage.sendPrecriptionNeedBuy("1 Hộp hoạt huyết dưỡng não");
        rcePersonalPage.sendNameRecipient("Ngô Anh");
        rcePersonalPage.sendPhoneRecipient("0963259526");
        rcePersonalPage.sendAddress("100 Trần Công An, Thành phố Biên Hòa, Đồng Nai");
        rcePersonalPage.sendNotesDelivery("Gần ngã tư");
        Assert.assertTrue(RCEPersonalPage.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("RCEopenNewOrder" + RCEPersonalPage.getToastMessage());
        ID = rcePersonalPage.getIDRCE();
    }

    @Test (priority = 2)
    public void RCEopenOrgPage() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0987654322", "123456");

        OrgPage orgPage = new OrgPage(true);
        orgPage.waitForPageLoadComplete();
        orgPage.clickonRCEOrg();

        RCEOrganizationPage rceOrganizationPage = new RCEOrganizationPage(true);
        rceOrganizationPage.sendIDOrderRCE(ID);
        rceOrganizationPage.clickonPresQuotation();
        rceOrganizationPage.sendPresComposed("sieunhan.jpg");
        rceOrganizationPage.sendNote("Nhà thuốc gửi đơn và báo giáo cho quý khách");
        rceOrganizationPage.sendPresPriceAndPackSize("69000");
        rceOrganizationPage.selectPrescriptionType("Theo toa");
        rceOrganizationPage.clickonSendPresQuotation();
        Assert.assertTrue(RCEOrganizationPage.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("RCEopenNewOrder" + RCEOrganizationPage.getToastMessage());
    }

    @Test (priority = 3)
    public void RCEUserAcceptBuy() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259526", "123456");

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonRCE_User();

        RCEPersonalPage rcePersonalPage = new RCEPersonalPage(true);
        rcePersonalPage.waitForPageLoadComplete();
        rcePersonalPage.clickonSelectPharmacy();
        rcePersonalPage.clickokChat();
        rcePersonalPage.sendChat("Nhà thuốc giao nhanh giúp đơn thuốc này nha!");
        rcePersonalPage.clickonBack();
        rcePersonalPage.clickonPayment();
        rcePersonalPage.clickonDelivery();
        rcePersonalPage.clickokOrder();
        rcePersonalPage.clickokOrder();
        Assert.assertTrue(RCEPersonalPage.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("RCEopenNewOrder" + RCEPersonalPage.getToastMessage());
    }

    @Test (priority = 4)
    public void RCEOrgFindDelivery() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0987654322", "123456");

        OrgPage orgPage = new OrgPage(true);
        orgPage.waitForPageLoadComplete();
        orgPage.clickonRCEOrg();

        RCEOrganizationPage rceOrganizationPage = new RCEOrganizationPage(true);
        rceOrganizationPage.waitForLoadingComplete();
        rceOrganizationPage.sendIDOrderRCE("180960");
        rceOrganizationPage.clickonChat();
        rceOrganizationPage.sendInputContent("Ok, đơn hàng đang chuẩn bị giao cho quý khách");
        rceOrganizationPage.clickonFindDelivery();
        rceOrganizationPage.clickonCancelFindDelivery();
        Assert.assertTrue(RCEOrganizationPage.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("RCEopenNewOrder" + RCEOrganizationPage.getToastMessage());
    }


    @Test (priority = 6)
    public void RCERepareData() throws InterruptedException {
        List<String> status = new ArrayList<>();
        status.add("Mới");
        status.add("Chờ xác nhận");
        status.add("Đang chờ xác nhận");
        status.add("Đang chờ tư vấn");
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0969617267", "121314");

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonRCE_User();

        RCEPersonalPage rcePersonalPage = new RCEPersonalPage(true);
        rcePersonalPage.waitForPageLoadComplete();

        rcePersonalPage.clickon_Cancel_All_Order_RCE(status);
    }

    //Test cancel_order_Rce_User 29
    @Test (priority = 6)
    public void RCEUserCancelOrder() throws InterruptedException {
    String status = "";

        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0969617267", "121314");

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonRCE_User();

        RCEPersonalPage rcePersonalPage = new RCEPersonalPage(true);
        rcePersonalPage.waitForPageLoadComplete();

        rcePersonalPage.clickon_Cancel_Order_RCE(status);
    }
}
