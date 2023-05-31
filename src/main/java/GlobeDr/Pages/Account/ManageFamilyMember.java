package GlobeDr.Pages.Account;

import Core.Selenium.*;
import GlobeDr.Pages.BaseGlobeDrPage;
import GlobeDr.Pages.Modules.Address;
import GlobeDr.Pages.Modules.Upload;
import GlobeDr.Pages.Pages.UserPage;
import org.openqa.selenium.By;

public class ManageFamilyMember extends BaseGlobeDrPage {
    private static final By by = By.xpath("//app-user");
    private static final String name = "Manage Family Member";
    //locators
    private final String xpath_New_SubAccount = "//a[@translate='subAccNew']";
    private final String xpath_InsuranceCode = "//label[@translate='insuranceCode']/preceding-sibling::input";
    private final String xpath_CMND_CCCD = "//label[@translate='cmndCccd']/preceding-sibling::input";
    private final String xpath_Fullname = "//label[@translate='fullName']/preceding-sibling::input";
    private final String id_Upload_AvatarImage = "upload_Image";
    private final String xpath_DayofBirth = "//input[@placeholder='Ngày/tháng/năm']";
    private final String xpath_PhoneNumber = "//label[@translate='phoneNumber']/preceding-sibling::input";
    private final String xpath_Gender = "//label[@translate='gender']/preceding-sibling::select";
    private final String xpath_Address = "//label[@translate='address']/preceding-sibling::input";
    private final String xpath_Hight = "(//app-add-edit-sub-account/fieldset//input[contains(@class,'')])[9]";
    private final String xpath_Weight = "(//app-add-edit-sub-account/fieldset//input[contains(@class,'')])[10]";
    private final String xpath_Relationship = "//label[@translate='relationship']/preceding-sibling::select";
    private final String xpath_Complete = "//span[@translate='complete1']";
    private final String xpath_Save = "//span[@translate='save']";
    private final String xpath_Edit_Data = "//a[@translate='editData']";
    private final String xpath_Edit_ShareAccount = "//div/a[@translate='edit']";
    private final String xpath_Delete_SubAccount = "//a[@translate='deleteThisSubAccount']";
    public final String xpath_List_Account = "//div[@class='align-self-center']/p[@class='fs15']";
    private final String xpath_Button_ShareAccount = "//div/label[@class='toggle-switch']";
    private final String xpath_Button_ShareNewAccount = "//div/a[@translate='shareNewAccount']";
    private final String xpath_List_ShareAccount = "//div[contains(@style,'background-image')]//following-sibling::div/p[contains(@class,'fw-bold')]";
    private final String xpath_Method_ShareAccount = "//div/p[@translate='shareMethod']/following-sibling::div";
    private final String xpath_Button_Select_Method = "//app-select-share-type-modal/div/div/div/button[contains(@class,'btn-success')]";
    private final String xpath_Button_Success_ShareAccount = "//app-select-share-type-modal//button[contains(@class,'btn-success')]";
    private final String xpath_Button_Complete_ShareAccount = "//app-share-account-modal//button[contains(@class,'btn-success')]";
    private final String xpath_Button_Success = "//app-confirm//button[contains(@class,'btn-success')]";
    private final String xpath_Button_Select = "//app-select-share-type-modal//button[contains(@class,'btn-success')]";

    private final String xpath_Account_Shared = "//span[contains(@class,'text-white')]";
    private final String xpath_Stop_ShareAccount = "//a[@translate='stopShares']";

    //elements
    private final Button button_New_SubAccount = new Button(By.xpath(xpath_New_SubAccount),"btn_SubAccountNew");
    private final Textbox textbox_InsuranceCode = new Textbox(By.xpath(xpath_InsuranceCode),"textbox_InsuranceCode");
    private final Textbox textbox_CMND_CCCD = new Textbox(By.xpath(xpath_CMND_CCCD),"textbox_CMND_CCCD");
    private final Textbox textbox_Fullname = new Textbox(By.xpath(xpath_Fullname),"textbox_Fullname");
    private final Textbox textbox_Address = new Textbox(By.xpath(xpath_Address),"Address");
    private final FileUploader fileUploader_Upload_AvatarImage = new FileUploader(By.id(id_Upload_AvatarImage),"fileUploader_UploadImage_Avatar");
    private final Button button_Success = new Button(By.xpath(xpath_Button_Success),"btn_Success");
    private final Button button_Select = new Button(By.xpath(xpath_Button_Select),"btn_Success");
    private final Textbox textbox_DayofBirth = new Textbox(By.xpath(xpath_DayofBirth),"textbox_DayofBirth");
    private final Textbox textbox_PhoneNumber = new Textbox(By.xpath(xpath_PhoneNumber),"textbox_PhoneNumber");
    private final Select select_Gender = new Select(By.xpath(xpath_Gender),"select_Gender");

    private final Textbox textbox_Hight = new Textbox(By.xpath(xpath_Hight),"textbox_Hight");
    private final Textbox textbox_Weight = new Textbox(By.xpath(xpath_Weight),"textbox_Weight");
    private final Select select_Relationship = new Select(By.xpath(xpath_Relationship),"select_Relationship");
    private final Button button_Complete = new Button(By.xpath(xpath_Complete),"btn_Complete");
    private final Button button_Save = new Button(By.xpath(xpath_Save),"btn_Save");
    private final Button button_EditData = new Button(By.xpath(xpath_Edit_Data),"btn_Edit_Data");
    private final Button button_Edit_ShareAccount = new Button(By.xpath(xpath_Edit_ShareAccount),"btn_Edit_Share_Account");
    private final Button button_Delete_SubAccount = new Button(By.xpath(xpath_Delete_SubAccount),"btn_Delete_SubAccount");
    private final Button button_Share_Account = new Button(By.xpath(xpath_Button_ShareAccount),"btn_Share_Account");
    private final Button button_Share_NewAccount = new Button(By.xpath(xpath_Button_ShareNewAccount),"btn_Share_NewAccount");
    private final Button button_Select_Method_ShareAccount = new Button(By.xpath(xpath_Button_Select_Method),"btn_Select_Method");
    private final Button button_Success_ShareAccount = new Button(By.xpath(xpath_Button_Success_ShareAccount),"btn_Success_ShareAccount");
    private final Button button_Complete_ShareAccount = new Button(By.xpath(xpath_Button_Complete_ShareAccount),"btc_Complete_ShareAccount");
    private final Button button_Account_Shared = new Button(By.xpath(xpath_Account_Shared),"btnAccountShared");
    private final Button button_Stop_ShareAccount = new Button(By.xpath(xpath_Stop_ShareAccount),"btn_Stop_ShareAccount");
    //contructor
    public ManageFamilyMember(boolean assertOpen) {super(by,name,assertOpen);}


    public void clickon_SubAccountNew(){
        button_New_SubAccount.waitForClickable();
        button_New_SubAccount.click();
        waitForLoadingComplete();
    }

    public void send_InsuranceCode(String InsuranceCode){
        textbox_InsuranceCode.waitForElementToBeDisplay();
        textbox_InsuranceCode.sendClearText(InsuranceCode);
        waitForJSToComplete();
    }

    public void send_CMND_CCCD(String number) {
        textbox_CMND_CCCD.waitForElementToBeDisplay();
        textbox_CMND_CCCD.sendClearText(number);
        waitForJSToComplete();
    }

    public void send_Fullname(String Fullname){
        textbox_Fullname.sendClearText(Fullname);
    }

    public void fileuploader_AvatarImage(String image) throws InterruptedException {
        Upload upload = new Upload(false);
        upload.upload_Avatar_Image(image);
    }

    public void send_DayofBirth(String DayofBirth){
        textbox_DayofBirth.sendClearText(DayofBirth);
    }

    public void send_PhoneNumber(String PhoneNumber){
        textbox_PhoneNumber.sendClearText(PhoneNumber);
    }

    public void select_Gender(String Gender){
        select_Gender.waitForElementToBeDisplay();
        select_Gender.selectByVisibleText(Gender);
    }

    public void send_Address(String Address,String Country, String City, String District, String Ward){
        textbox_Address.sendClearText(Address);
        waitForJSToComplete();
        GlobeDr.Pages.Modules.Address address = new Address(false);
        address.select_Address(Country,City,District,Ward);
    }

//    public void select_Country(String Country){
//
//
//    }
//
//    public void select_City(String City){
//
//    }
//
//    public void select_District(String District){
//        select_District.waitForElementToBeDisplay();
//        select_District.selectByVisibleText(District);
//    }
//
//    public void select_Ward(String Ward){
//        select_Ward.waitForElementToBeDisplay();
//        select_Ward.selectByVisibleText(Ward);
//    }

    public void send_Hight(String Hight){
        textbox_Hight.sendClearText(Hight);
    }

    public void send_Weight(String Weight){
        textbox_Weight.sendClearText(Weight);
    }

    public void select_Relationship(String Relationship){
        select_Relationship.waitForElementToBeDisplay();
        select_Relationship.selectByVisibleText(Relationship);
    }

    public void clickon_Complete(){
        button_Complete.waitForClickable();
        button_Complete.click();
        waitForJSToComplete();
    }

    public void clickon_Save(){
        button_Save.waitForClickable();
        button_Save.click();
        waitForJSToComplete();
    }

    public void select_SubAccount(String account) {
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_List_Account), "List Account");
        for( int i = 0; i < listOfElements.getNumberOfElement(); i++){
            if(listOfElements.getElement(i).getText().contains(account)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
                clickon_EditData();
            }
        }
    }


    public void clickon_EditData(){
        button_EditData.waitForClickable();
        button_EditData.click();
        waitForLoadingComplete();
    }

    public void clickon_Delete_SubAccount(){
        button_Delete_SubAccount.waitForClickable();
        button_Delete_SubAccount.click();
        button_Success.waitForClickable();
        button_Success.click();
        waitForJSToComplete();
    }

    public void clickon_ShareAccount(String Account){
        UserPage userPage = new UserPage(false);
        userPage.select_Account(Account);
        button_Share_Account.waitForClickable();
        button_Share_Account.click();
        waitForJSToComplete();
        clickon_ShareNewAccount();
    }

    public void clickon_ShareNewAccount(){
        button_Share_NewAccount.waitForClickable();
        button_Share_NewAccount.click();
        waitForJSToComplete();
    }

    public void share_AccountWithUser(String account){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_List_ShareAccount),"ListAccountShare");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(account)){
                listOfElements.getElement(i).click();
            }
        }
    }

    public void share_Method(String method) throws InterruptedException {
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_Method_ShareAccount),"list_Method_ShareAccount");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(method)){
                listOfElements.getElement(i).click();
            }
        }
            button_Success_ShareAccount.waitForClickable();
            button_Success_ShareAccount.click();
        if(button_Complete_ShareAccount.isElementDisplay()){
            button_Complete_ShareAccount.waitForClickable();
            button_Complete_ShareAccount.click();
        }
        waitForLoadingComplete();
    }

    public void clickon_Select_Method(){
        button_Select_Method_ShareAccount.waitForClickable();
        button_Select_Method_ShareAccount.click();
        waitForJSToComplete();
    }



    public void clickon_Edit_ShareAccount(String Account){
        UserPage userPage = new UserPage(false);
        userPage.select_Account(Account);
        button_Edit_ShareAccount.waitForClickable();
        button_Edit_ShareAccount.click();
        waitForJSToComplete();
    }



//    public void clickon_Stop_ShareAccount(String Account){
//        UserPage userPage = new UserPage(false);
//        userPage.select_Account(Account);
//        button_Stop_ShareAccount.waitForClickable();
//        button_Stop_ShareAccount.click();
//        waitForJSToComplete();
//        button_Success.waitForClickable();
//        button_Success.click();
//        waitForJSToComplete();
//    }
}
