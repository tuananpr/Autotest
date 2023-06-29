import Core.Support.General.Hooks;
import GlobeDr.Pages.Account.DataProviderFactory;
import GlobeDr.Pages.Account.ManageFamilyMember;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import GlobeDr.Pages.Pages.UserPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

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

//    @Test (priority = 1, dataProvider = "user", dataProviderClass = DataProviderFactory.class)
//    public void MainAccountUpdateInfo(HashMap<String, String> data) throws InterruptedException {
//        HomePage homePage = new HomePage(true);
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login(data.get("ID"),data.get("Pass"));
//
//
//        UserPage userPage = new UserPage(false);
//        userPage.clickon_ManageMember_User();
//
//        UserUpdateInfoPage User_UpdateInfoPage = new UserUpdateInfoPage(true);
//        User_UpdateInfoPage.clickon_EditData();
//        User_UpdateInfoPage.send_Name(data.get("Name"));
//        User_UpdateInfoPage.send_Title(data.get("Title"));
//        User_UpdateInfoPage.send_AvatarImage(data.get("AvatarImage"));
//        User_UpdateInfoPage.send_Email(data.get("Email"));
//        User_UpdateInfoPage.clickon_DayofBirth(data.get("DOB"));
//        User_UpdateInfoPage.select_Gender(data.get("Gender"));
//        User_UpdateInfoPage.send_PhoneNumber(data.get("PhoneNumber"));
//        User_UpdateInfoPage.send_WorkPhoneNumber(data.get("WorkPhoneNumber"));
//        User_UpdateInfoPage.select_MeasurementUnit(data.get("MeasurementUnit"));
//        User_UpdateInfoPage.select_VisitCountry(data.get("Country"));
//        User_UpdateInfoPage.select_Country(data.get("Country"));
//        User_UpdateInfoPage.select_City(data.get("City"));
//        User_UpdateInfoPage.select_District(data.get("District"));
//        User_UpdateInfoPage.select_Ward(data.get("Ward"));
//        User_UpdateInfoPage.send_Address(data.get("Address"));
//        User_UpdateInfoPage.clickon_Save();
//        Assert.assertTrue(UserUpdateInfoPage.getToastMessage().contains("Thành công"),"Thành công");
//        Thread.sleep(5000);
//        System.out.println("MainAccountUpdateInfo" + UserUpdateInfoPage.getToastMessage());
//    }
//
//    @Test (priority = 2, dataProvider = "user", dataProviderClass = DataProviderFactory.class)
//    public void ShareMainAccount(HashMap<String, String> data) throws InterruptedException {
//        HomePage homePage = new HomePage(true);
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(false);
//        loginPage.login(data.get("ID"), data.get("Pass"));
//
//        UserPage userPage = new UserPage(false);
//        userPage.clickon_ManageMember_User();
//
//        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(false);
//        manageFamilyMember.clickon_ShareAccount(data.get("MainAccount"));
//        manageFamilyMember.share_Method(data.get("ShareMethod_View"));
//        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
//        Thread.sleep(5000);
//        System.out.println("ShareMainAccount" + ManageFamilyMember.getToastMessage());
//    }
//
//    @Test (priority = 3,dataProvider = "user", dataProviderClass = DataProviderFactory.class)
//    public void EditShare_MainAccount(HashMap<String, String>data) throws InterruptedException{
//        HomePage homePage = new HomePage(true);
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login(data.get("ID"), data.get("Pass"));
//
//        UserPage userPage = new UserPage(false);
//        userPage.clickon_ManageMember_User();
//
//        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(false);
//        manageFamilyMember.clickon_ShareAccount(data.get("MainAccount"));
//        manageFamilyMember.share_Method(data.get("ShareMethod_View&Edit"));
//        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
//        Thread.sleep(5000);
//        System.out.println("ShareMainAccount" + ManageFamilyMember.getToastMessage());
//    }
//
//    @Test (priority = 4, dataProvider = "user", dataProviderClass = DataProviderFactory.class)
//    public void StopShare(HashMap<String, String>data) throws InterruptedException {
//        HomePage homePage = new HomePage(true);
//        homePage.clickon_LoginButton();
//
//        LoginPage loginPage = new LoginPage(true);
//        loginPage.login(data.get("ID"), data.get("Pass"));
//
//        UserPage userPage = new UserPage(false);
//        userPage.clickon_ManageMember_User();
//
//        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(false);
//        manageFamilyMember.clickon_ShareAccount(data.get("MainAccount"));
//        manageFamilyMember.share_Method(data.get("ShareMethod_Unshare"));
//        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
//        Thread.sleep(5000);
//        System.out.println("ShareMainAccount" + ManageFamilyMember.getToastMessage());
//    }

    @Test (priority = 5, dataProvider = "user", dataProviderClass = DataProviderFactory.class)
    public void CreateSubAccount(HashMap<String, String>data) throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login(data.get("ID"), data.get("Pass"));

        UserPage userPage = new UserPage(false);
        userPage.clickon_ManageMember_User();

        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(true);
        manageFamilyMember.clickon_SubAccountNew();
        manageFamilyMember.send_InsuranceCode(data.get("InsuranceCode"));
        manageFamilyMember.send_CMND_CCCD(data.get("CMND_CCCD"));
        manageFamilyMember.send_Fullname(data.get("FullName"));
        manageFamilyMember.fileuploader_AvatarImage(data.get("AvatarImageSub"));
        manageFamilyMember.send_DayofBirth(data.get("DayofBirth"));
        manageFamilyMember.send_PhoneNumber(data.get("PhoneNumberSub"));
        manageFamilyMember.select_Gender(data.get("GenderSub"));
        manageFamilyMember.send_Address(data.get("AddressSub"),
                                        data.get("CountrySub"),
                                        data.get("CitySub"),
                                        data.get("DistrictSub"),
                                        data.get("WardSub"));
        manageFamilyMember.send_Hight(data.get("Hight"));
        manageFamilyMember.send_Weight(data.get("Weight"));
        manageFamilyMember.select_Relationship(data.get("Relationship"));
        manageFamilyMember.clickon_Complete();
        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
        Thread.sleep(5000);
        System.out.println("Create_SubAccount" + ManageFamilyMember.getToastMessage());
    }

    @Test (priority = 6, dataProvider = "user", dataProviderClass = DataProviderFactory.class)
    public void SubAccountUpdateInfo(HashMap<String,String> data) throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login(data.get("ID"), data.get("Pass"));

        UserPage userPage = new UserPage(false);
        userPage.clickon_ManageMember_User();

        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(true);
        manageFamilyMember.select_SubAccount(data.get("FullName"));
        manageFamilyMember.send_InsuranceCode(data.get("InsuranceCodeNew"));
        manageFamilyMember.send_CMND_CCCD(data.get("CMND_CCCDNew"));
        manageFamilyMember.send_Fullname(data.get("FullNameNew"));
        manageFamilyMember.fileuploader_AvatarImage(data.get("AvatarImageNew"));
        manageFamilyMember.send_DayofBirth(data.get("DayofBirthNew"));
        manageFamilyMember.send_PhoneNumber(data.get("PhoneNumberNew"));
        manageFamilyMember.select_Gender(data.get("GenderNew"));
        manageFamilyMember.send_Address(data.get("AddressNew"), data.get("CountryNew"), data.get("CityNew"), data.get("DistrictNew"), data.get("WardNew"));
        manageFamilyMember.send_Hight(data.get("HightNew"));
        manageFamilyMember.send_Weight(data.get("WeightNew"));
        manageFamilyMember.select_Relationship(data.get("RelationshipNew"));
        manageFamilyMember.clickon_Save();
        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
        Thread.sleep(5000);
        System.out.println("SubAccountUpdateInfo" + ManageFamilyMember.getToastMessage());
    }

    @Test (priority = 7, dataProvider = "user", dataProviderClass = DataProviderFactory.class)
    public void DeleteAccount(HashMap<String,String>data) throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login(data.get("ID"), data.get("Pass"));

        UserPage userPage = new UserPage(true);
        userPage.clickon_ManageMember_User();

        ManageFamilyMember manageFamilyMember = new ManageFamilyMember(true);
        manageFamilyMember.select_SubAccount(data.get("FullNameNew"));
        manageFamilyMember.clickon_Delete_SubAccount();
        Assert.assertTrue(ManageFamilyMember.getToastMessage().contains("Thành công"),"Thành công");
        Thread.sleep(5000);
        System.out.println("DeleteAccount" + ManageFamilyMember.getToastMessage());
    }
}
