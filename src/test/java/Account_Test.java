import Core.Support.General.Hooks;
import GlobeDr.Pages.Account.ManageFamilyMember;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import GlobeDr.Pages.Pages.UserPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Account_Test extends Hooks {
    @BeforeMethod
    public void setup() {
        before();
        beforeWeb();
    }

    @AfterMethod
    public void tearDown() {
        after();
    }


//    @Test (priority = 1)
//    public void MainAccountUpdateInfo() throws InterruptedException {
//        HomePage homePage = new HomePage(true);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login("0963259529", "123456");
//        loginPage.waitForPageLoadComplete();
//
//        UserPage userPage = new UserPage(false);
//        userPage.clickon_ManageMember_User();
//
//        UserUpdateInfoPage User_UpdateInfoPage = new UserUpdateInfoPage(true);
//        User_UpdateInfoPage.clickon_EditData();
//        User_UpdateInfoPage.send_Name("Nam");
//        User_UpdateInfoPage.send_Title("Ngô");
//        User_UpdateInfoPage.send_AvatarImage("Wolverine.PNG");
//        User_UpdateInfoPage.send_Email("ngonam@demo.globedr.com");
//        User_UpdateInfoPage.clickon_DayofBirth("16/12/1990");
//        User_UpdateInfoPage.select_Gender("Nam");
//        User_UpdateInfoPage.send_PhoneNumber("0963269526");
//        User_UpdateInfoPage.send_WorkPhoneNumber("19006880");
//        User_UpdateInfoPage.select_MeasurementUnit("VN (kg/m)");
//        User_UpdateInfoPage.select_VisitCountry("Việt Nam");
//        User_UpdateInfoPage.select_Country("Việt Nam");
//        User_UpdateInfoPage.select_City("Thành phố Hồ Chí Minh");
//        User_UpdateInfoPage.select_District("Quận Tân Bình");
//        User_UpdateInfoPage.select_Ward("Phường 10");
//        User_UpdateInfoPage.send_Address("5B Đ. P. Quang, Phường 2, Tân Bình, Thành phố Hồ Chí Minh");
//        User_UpdateInfoPage.clickon_Save();
//        Assert.assertTrue(UserUpdateInfoPage.getToastMessage().contains("Thành công"),"Thành công");
//        System.out.println("MainAccountUpdateInfo" + UserUpdateInfoPage.getToastMessage());
//    }

//    @Test (priority = 2)
//    public void ShareMainAccount() throws InterruptedException {
//        HomePage homePage = new HomePage(true);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login("0963259529", "123456");
//        loginPage.waitForPageLoadComplete();
//
//        UserPage userPage = new UserPage(false);
//        userPage.clickon_ManageMember_User();
//
//        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(true);
//        manageFamilyMember.clickon_ShareAccount("Nam");
//        manageFamilyMember.share_AccountWithUser("tuan27");
//        manageFamilyMember.share_Method("Xem & chỉnh sửa");
//        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
//        System.out.println("ShareMainAccount" + ManageFamilyMember.getToastMessage());
//    }

//    @Test (priority = 3)
//    public void EditShare_MainAccount() throws InterruptedException{
//        HomePage homePage = new HomePage(true);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login("0963259529", "123456");
//        loginPage.waitForPageLoadComplete();
//
//        UserPage userPage = new UserPage(false);
//        userPage.clickon_ManageMember_User();
//
//        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(true);
//        manageFamilyMember.clickon_Edit_ShareAccount("Nam");
//        manageFamilyMember.share_Method("Chỉ xem");
//    }
//
//    @Test (priority = 4)
//    public void StopShare() throws InterruptedException {
//        HomePage homePage = new HomePage(true);
//        homePage.waitForPageLoadComplete();
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login("0963259529", "123456");
//        loginPage.waitForPageLoadComplete();
//
//        UserPage userPage = new UserPage(false);
//        userPage.clickon_ManageMember_User();
//
//        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(true);
//        manageFamilyMember.clickon_Edit_ShareAccount("Nam");
//        manageFamilyMember.share_Method("Dừng chia sẻ");
//        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
//        System.out.println("ShareMainAccount" + ManageFamilyMember.getToastMessage());
//    }
//
    @Test (priority = 5)
    public void CreateSubAccount() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259529", "123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(false);
        userPage.clickon_ManageMember_User();

        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(true);
        manageFamilyMember.clickon_SubAccountNew();
        manageFamilyMember.send_InsuranceCode("GD02356525989");
        manageFamilyMember.send_CMND_CCCD("555555");
        manageFamilyMember.send_Fullname("Ngô Sắn Khoai");
        manageFamilyMember.fileuploader_AvatarImage("BlackWidow.PNG");
        manageFamilyMember.send_DayofBirth("10/10/2020");
        manageFamilyMember.send_PhoneNumber("090900000");
        manageFamilyMember.select_Gender("Nữ");
        manageFamilyMember.send_Address("100 Trần Công An, Thành phố Biên Hòa, Đồng Nai, Việt Nam",
                                        "Việt Nam",
                                        "Thành phố Hồ Chí Minh",
                                        "Quận Tân Bình",
                                        "Phường 02");
        manageFamilyMember.send_Hight("180");
        manageFamilyMember.send_Weight("60");
        manageFamilyMember.select_Relationship("Con");
        manageFamilyMember.clickon_Complete();
        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("CreateSubAccount" + ManageFamilyMember.getToastMessage());
    }

    @Test (priority = 6)
    public void SubAccountUpdateInfo() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259529", "123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(false);
        userPage.clickon_ManageMember_User();

        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(true);
        manageFamilyMember.select_SubAccount("Ngô Sắn Khoai");
        manageFamilyMember.send_InsuranceCode("GD0111111111");
        manageFamilyMember.send_CMND_CCCD("123456555555");
        manageFamilyMember.send_Fullname("Khoai Lang Nướng");
        manageFamilyMember.fileuploader_AvatarImage("Spiderman.PNG");
        manageFamilyMember.send_DayofBirth("01/01/2021");
        manageFamilyMember.send_PhoneNumber("09099999999");
        manageFamilyMember.select_Gender("Nam");
        manageFamilyMember.send_Address("150 Trần Công An, Thành phố Biên Hòa, Đồng Nai, Việt Nam","Việt Nam","Tỉnh Bình Dương","Thành phố Thủ Dầu Một","Phường Phú Mỹ");
        manageFamilyMember.send_Hight("170");
        manageFamilyMember.send_Weight("50");
        manageFamilyMember.select_Relationship("Họ hàng");
        manageFamilyMember.clickon_Save();
        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("SubAccountUpdateInfo" + ManageFamilyMember.getToastMessage());
    }

    @Test (priority = 7)
    public void DeleteAccount() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259529", "123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.clickon_ManageMember_User();

        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(true);
        manageFamilyMember.select_SubAccount("Khoai Lang Nướng");
        manageFamilyMember.clickon_Delete_SubAccount();
        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
        System.out.println("DeleteAccount" + ManageFamilyMember.getToastMessage());
    }
}
