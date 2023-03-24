import Core.Support.General.Hooks;
import GlobeDr.Pages.CareAtHome.User.*;
import GlobeDr.Pages.HomePage;
import GlobeDr.Pages.LoginPage;
import GlobeDr.Pages.Pages.UserPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CareAtHome_Test extends Hooks {
    @BeforeMethod
    public void setup() {
        before();
        beforeWeb();
    }

    @AfterMethod
    public void tearDown(){
        after();
    }

    String ID;

    @Test (priority = 1)
    public void User_Add_New_Covid() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527","123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        UserCareAtHomeInfo General_Information = new UserCareAtHomeInfo(true);
        General_Information.select_Account("Con Nai Tơ");
        General_Information.send_Name("Con Nai Me");
        General_Information.send_PhoneNumber("0963258741");
        General_Information.send_Pastport("09090909090909");
        General_Information.send_Calender("25/05/1997");
        General_Information.select_Gender("Nam");
        General_Information.send_Address("5B Đ. P. Quang, Phường 2, Tân Bình, Thành phố Hồ Chí Minh");
        General_Information.select_Country("Việt Nam");
        General_Information.select_City("Thành phố Hồ Chí Minh");
        General_Information.select_District("Quận Phú Nhuận");
        General_Information.select_Ward("Phường 09");
        General_Information.send_HealthInsurance("00000555555");

       InfoCareAtHome Covid = new InfoCareAtHome(true);
       CovidPage CovidPage = new CovidPage(true);
        Covid.select_DiseaseType("COVID-19");
        CovidPage.send_Weight("90");
        CovidPage.send_Height("180");
        CovidPage.select_Vaccination("2 Mũi");
        Covid.select_Pathological_Attached("Tăng huyết áp","Có");
        Covid.select_Pathological_Attached("Đái tháo đường","Có");
        Covid.select_Pathological_Attached("Khớp","Không");
        Covid.select_Pathological_Attached("Ung thư","Không");
        Covid.select_Pathological_Attached("Khác","Có");
        Covid.send_TestDate("10/01/2023");
        Covid.select_Temperature("40");
        Covid.send_BloodPerssure("BloodPerssure.png","110","90");
        Covid.send_BloodOxygenLevel("Bloodoxygenlevel.png","95","89");
        Covid.select_Symptom("Sốt","Có");
        Covid.select_Symptom("Mệt mỏi","Có");
        Covid.select_Symptom("Đau họng","Không");
        Covid.select_Symptom("Sổ mũi","Có");
        Covid.select_Symptom("Ói","Không");
        Covid.select_Symptom("Tiêu lỏng","Có");
        Covid.select_Symptom("Đau ngực","Không");
        Covid.select_Symptom("Khó thở","Có");
        Covid.select_Symptom("Mất/giảm mùi","Không");
        Covid.select_Symptom("Mất/giảm vị","Có");
        Covid.select_Symptom("Ho","Không");
        Covid.clickon_ConfirmInformation();
        Covid.clickon_Send_Confirm();
        ID = Covid.getID();
    }

    @Test (priority = 2)

    public void User_Update_Covid() throws InterruptedException{
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527","123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        InfoCareAtHome Update_Covid = new InfoCareAtHome(true);
        Update_Covid.clickon_IDCareAtHome(ID);
        Update_Covid.clickon_CurrentHealthStatus();
        Update_Covid.select_Temperature("38.5");
        Update_Covid.send_BloodPerssure("BloodPerssure.png","100","85");
        Update_Covid.send_BloodOxygenLevel("Bloodoxygenlevel.png","99","95");
        Update_Covid.select_Symptom("Mệt mỏi","Có");
        Update_Covid.select_Symptom("Đau họng","Không");
        Update_Covid.select_Symptom("Sổ mũi","Có");
        Update_Covid.select_Symptom("Ói","Không");
        Update_Covid.select_Symptom("Tiêu lỏng","Có");
        Update_Covid.select_Symptom("Đau ngực","Không");
        Update_Covid.select_Symptom("Khó thở","Có");
        Update_Covid.select_Symptom("Mất/giảm mùi","Không");
        Update_Covid.select_Symptom("Mất/giảm vị","Có");
        Update_Covid.select_Symptom("Ho","Không");
        Update_Covid.send_CurrentStatusInfo("Tình trạng sức khỏe ổn định");
        Update_Covid.clickon_UpdataCovidTest("Ironman.PNG");
    }

    @Test (priority = 3)
    public void Manager() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("manager@clb.vn", "123456");
        loginPage.waitForPageLoadComplete();

        ManagerCareAtHome Manager = new ManagerCareAtHome(false);
        Manager.clickon_button_manager_CAH();
        Manager.clickon_IDCareAtHome(ID);
        Manager.clickon_actions("CHỈ ĐỊNH BÁC SĨ");
        Manager.assign_Doctor("BS Tuan");
    }

    @Test (priority = 4)
    public void Doctor() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0987654321", "123456");
        loginPage.waitForPageLoadComplete();

        DoctorCareAtHome Doctor = new DoctorCareAtHome(false);
        Doctor.change_role("Vào trang hành nghề");
        Doctor.select_feature("DS bệnh nhân tại nhà");
        Doctor.send_ID("74057");
        Doctor.clickon_IDCareAtHome("74057");
        Doctor.clickon_acctions("DẶN DÒ BỆNH NHÂN");
        Doctor.send_advice_patient("Nhớ uống thuốc, ăn uống ngủ nghĩ đầy đủ nha!");
        Doctor.clickon_acctions("CÀI ĐẶT TRẠNG THÁI");
        Doctor.select_status("Xong");
    }

    @Test (priority = 5)
    public void User_Add_New_Post_Covid() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527","123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        UserCareAtHomeInfo userCareAtHomeInfo = new UserCareAtHomeInfo(true);
        userCareAtHomeInfo.clickon_AddNewPatientRecord();

        InfoCareAtHome Post_Covid = new InfoCareAtHome(true);
        PostCovidPage PostCovidPage = new PostCovidPage(true);
        Post_Covid.select_DiseaseType("Hậu Covid - 19");
        Post_Covid.send_TestDate("02/02/2023");
        PostCovidPage.select_AccompaniedPathologicalConditions("Khó thở","Có");
        PostCovidPage.select_AccompaniedPathologicalConditions("Ho","Có");
        PostCovidPage.select_AccompaniedPathologicalConditions("Mất ngủ","Không");
        PostCovidPage.select_AccompaniedPathologicalConditions("Lo lắng","Không");
        Post_Covid.send_OtherInformation("Chưa thấy gì mới");
        Post_Covid.send_TreatmentInformartionInPast_medication("Panadol 2v");
        Post_Covid.send_TreatmentInformartionInPast_treated("Tại nhà");
        Post_Covid.send_TreatmentInformation_medication("Panadol Extra");
        Post_Covid.send_TreatmentInformation_treated("Tại nhà");
        Post_Covid.send_AdditionalInformation_Currentdiseasecondition("Hơi mệt");
        Post_Covid.send_AdditionalInformation_Concernedaboutnow("Tình trạng sức khỏe hiện tại");
        Post_Covid.send_AdditionalInformation_Familyhaveasimilardisease("Không có");
        Post_Covid.clickon_ConfirmInformation();
        Post_Covid.clickon_Send_Confirm();
        ID = Post_Covid.getID();
    }

    @Test(priority = 6)
    public void User_Update_Post_Covid() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527", "123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        InfoCareAtHome User_Update_Post_Covid = new InfoCareAtHome(true);
        User_Update_Post_Covid.clickon_IDCareAtHome(ID);
        User_Update_Post_Covid.clickon_CurrentHealthStatus();
        User_Update_Post_Covid.send_CurrentHealthSituation("BloodPerssure.png","111","90","Bloodoxygenlevel.png","99","98");
        User_Update_Post_Covid.send_CurrentlyWorriedAbout("Sức khỏe sau này");
        User_Update_Post_Covid.send_NeedImproved("Chất lượng cuộc sống");
        User_Update_Post_Covid.send_AnymoreHelp("Không có");
        User_Update_Post_Covid.clickon_Complete();
    }

    @Test (priority = 7)
    public void User_Add_New_Hypertension() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527","123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        UserCareAtHomeInfo userCareAtHomeInfo = new UserCareAtHomeInfo(true);
        userCareAtHomeInfo.clickon_AddNewPatientRecord();

        InfoCareAtHome Hypertension = new InfoCareAtHome(true);
        HypertensionPage HypertensionPage = new HypertensionPage(true);
        Hypertension.select_DiseaseType("Tăng huyết áp");
        HypertensionPage.send_BloodPressureStatus_Hypertension("120","90","100","80");
        Hypertension.send_TestDate("01/01/2023");
        HypertensionPage.select_AccompaniedPathologicalConditions("","Có");
        Hypertension.send_OtherInformation("Không có");
        Hypertension.send_Treatmentinformationinthepast("Panadol extra 500mg","Tại nhà");
        Hypertension.send_Treatmentinformation("Không có","Tại nhà");
        Hypertension.send_Additionalinformation("Hay mệt mỏi","Sức khỏe trong tương lai","Không có");
        Hypertension.clickon_ConfirmInformation();
        Hypertension.clickon_Send_Confirm();
        ID = Hypertension.getID();
    }

    @Test(priority = 8)
    public void User_Update_Hypertention() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527", "123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        InfoCareAtHome Update_Hypertention = new InfoCareAtHome(true);
        Update_Hypertention.clickon_IDCareAtHome(ID);
        Update_Hypertention.clickon_CurrentHealthStatus();
        Update_Hypertention.send_CurrentHealthSituation("BloodPerssure.png","111","90","Bloodoxygenlevel.png","99","98");
        Update_Hypertention.send_CurrentlyWorriedAbout("Sức khỏe sau này");
        Update_Hypertention.send_NeedImproved("Chất lượng cuộc sống");
        Update_Hypertention.send_AnymoreHelp("Không có");
        Update_Hypertention.clickon_Complete();
    }

    @Test (priority = 9)
    public void User_Add_New_Diabetes() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527","123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        UserCareAtHomeInfo userCareAtHomeInfo = new UserCareAtHomeInfo(true);
        userCareAtHomeInfo.clickon_AddNewPatientRecord();

        InfoCareAtHome Diabetes = new InfoCareAtHome(true);
        DiabetesPage DiabetesPage = new DiabetesPage(true);
        Diabetes.select_DiseaseType("Đái tháo đường");
        DiabetesPage.send_Bloodsugarstatus("120","80","9","");
        Diabetes.send_TestDate("01/01/2023");
        Diabetes.send_OtherInformation("Không có");
        Diabetes.send_Treatmentinformationinthepast("Panadol extra 500mg","Tại nhà");
        Diabetes.send_Treatmentinformation("Không có","Tại nhà");
        Diabetes.send_Additionalinformation("Hay mệt mỏi","Sức khỏe trong tương lai","Không có");
        Diabetes.clickon_ConfirmInformation();
        Diabetes.clickon_Send_Confirm();
        ID = Diabetes.getID();
    }

    @Test(priority = 10)
    public void User_Update_Diabetes() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527", "123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        InfoCareAtHome User_Update_Diabetes = new InfoCareAtHome(true);
        User_Update_Diabetes.clickon_IDCareAtHome(ID);
        User_Update_Diabetes.clickon_CurrentHealthStatus();
        User_Update_Diabetes.send_CurrentHealthSituation("BloodPerssure.png","111","90","Bloodoxygenlevel.png","99","98");
        User_Update_Diabetes.send_GlucoseStatus("10","");
        User_Update_Diabetes.send_CurrentlyWorriedAbout("Sức khỏe sau này");
        User_Update_Diabetes.send_NeedImproved("Chất lượng cuộc sống");
        User_Update_Diabetes.send_AnymoreHelp("Không có");
        User_Update_Diabetes.clickon_Complete();
    }

    @Test (priority = 11)
    public void User_Add_New_Arthritis() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527","123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        UserCareAtHomeInfo userCareAtHome = new UserCareAtHomeInfo(true);
        userCareAtHome.clickon_AddNewPatientRecord();

        InfoCareAtHome Arthritis = new InfoCareAtHome(true);
        ArthritisPage ArthritisPage = new ArthritisPage(true);
        Arthritis.select_DiseaseType("Viêm khớp");
        ArthritisPage.send_Jointpain_Stiffjoints_Heavilyeveryday("Tay","Yes","Yes");
        ArthritisPage.send_XRayResults_XRayDiagnosis("Xquang.jpg","Không thấy gì");
        Arthritis.send_TestDate("02/01/2023");
        Arthritis.send_OtherInformation("Không có");
        Arthritis.send_Treatmentinformationinthepast("Panadol extra 500mg","Tại nhà");
        Arthritis.send_Treatmentinformation("Không có","Tại nhà");
        Arthritis.send_Additionalinformation("Hay mệt mỏi","Sức khỏe trong tương lai","Không có");
        Arthritis.clickon_ConfirmInformation();
        Arthritis.clickon_Send_Confirm();
        ID = Arthritis.getID();
    }

    @Test(priority = 12)
    public void User_Update_Arthritis() throws InterruptedException {
        HomePage homePage = new HomePage(true);
        homePage.waitForPageLoadComplete();
        homePage.clickon_LoginButton();

        LoginPage loginPage = new LoginPage(true);
        loginPage.login("0963259527", "123456");
        loginPage.waitForPageLoadComplete();

        UserPage userPage = new UserPage(true);
        userPage.waitForPageLoadComplete();
        userPage.clickonPatientCare_User();

        InfoCareAtHome Update_Arthritis = new InfoCareAtHome(true);
        Update_Arthritis.clickon_IDCareAtHome(ID);
        Update_Arthritis.clickon_CurrentHealthStatus();
        Update_Arthritis.send_CurrentHealthSituation("BloodPerssure.png","111","90","Bloodoxygenlevel.png","99","98");
        Update_Arthritis.send_CurrentlyWorriedAbout("Sức khỏe sau này");
        Update_Arthritis.clickon_Complete();
        Update_Arthritis.clickon_Success();
    }
}
