package GlobeDr.Pages.Account;

import Core.Selenium.Button;
import Core.Selenium.FileUploader;
import Core.Selenium.Select;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import GlobeDr.Pages.Modules.Calendar;
import org.openqa.selenium.By;

public class UserUpdateInfoPage extends BaseGlobeDrPage {
    private static final By by = By.xpath("//app-user");
    private static final String name = "Manage family member";

    //locators
    private final String xpath_fileuploader_AvatarImage = "uploadImage";
    private final String xpath_textbox_Name = "//label[@translate='yourName']/preceding-sibling::input";
    private final String xpath_textbox_Title = "//label[@translate='title']/preceding-sibling::input";
    private final String xpath_textbox_Email = "//label[@translate='email']/preceding-sibling::input";
    private final String xpath_textbox_PhoneNumber = "//label[@translate='phoneNumber']/preceding-sibling::input";
    private final String xpath_textbox_WorkPhone = "//label[@translate='workPhone']/preceding-sibling::input";

    private final String xpath_button_AvatarImageSuccess = "//button[contains(@class,'btn-success')]";
    private final String xpath_button_EditData = "//a[@translate='editData']";
    private final String xpath_button_Calendar = "//span[contains(@class,'calendar')]";

    private final String xpath_button_Save = "//a[@translate='save']";
    private final String xpath_select_Gender = "//label[@translate='gender']/preceding::select";
    private final String xpath_select_MeasurementUnit = "//label[@translate='measurementUnit']/preceding-sibling::select";
    private final String xpath_select_VisitCountry = "//label[@translate='visitCountry']/preceding-sibling::select";
    private final String xpath_select_Country = "//label[@translate='country']/preceding-sibling::select";
    private final String xpath_select_City = "//label[@translate='city']/preceding-sibling::select";
    private final String xpath_select_District = "//label[@translate='district']/preceding-sibling::select";
    private final String xpath_select_Ward = "//label[@translate='ward']/preceding-sibling::select";

    //elements
    private final FileUploader fileUploader_AvatarImage = new FileUploader(By.id(xpath_fileuploader_AvatarImage),"fileuploaderAvatarImage");
    private final Button button_EditData = new Button(By.xpath(xpath_button_EditData),"btnEditData");
    private final Button button_AvatarImageSuccess = new Button(By.xpath(xpath_button_AvatarImageSuccess),"buttonAvatarImageSuccess");
    private final Button button_Save = new Button(By.xpath(xpath_button_Save),"buttonSave");
    private final Button button_Calendar = new Button(By.xpath(xpath_button_Calendar),"buttonCalendar");
    private final Select select_Gender = new Select(By.xpath(xpath_select_Gender),"selectGender");
    private final Select select_MeasurementUnit = new Select(By.xpath(xpath_select_MeasurementUnit),"SelectMeasurementUnit");
    private final Select select_VisitCountry = new Select(By.xpath(xpath_select_VisitCountry),"SelectVisitCountry");
    private final Select select_Country = new Select(By.xpath(xpath_select_Country),"selectCountry");
    private final Select select_City = new Select(By.xpath(xpath_select_City),"SelectCity");
    private final Select select_District = new Select(By.xpath(xpath_select_District),"SelectDistrict");
    private final Select select_Ward = new Select(By.xpath(xpath_select_Ward),"SelectWard");

    private final Textbox textbox_Name = new Textbox(By.xpath(xpath_textbox_Name),"textboxName");
    private final Textbox textbox_Title = new Textbox(By.xpath(xpath_textbox_Title),"textboxTitle");
    private final Textbox textbox_Email = new Textbox(By.xpath(xpath_textbox_Email),"textboxEmail");
    private final Textbox textbox_PhoneNumber = new Textbox(By.xpath(xpath_textbox_PhoneNumber),"textboxPhoneNumber");
    private final Textbox textbox_WorkPhone = new Textbox(By.xpath(xpath_textbox_WorkPhone),"textboxWorkPhone");



    //contructor
    public UserUpdateInfoPage(boolean assertOpen) {super(by,name,assertOpen);}

    public void clickon_EditData(){
        button_EditData.waitForClickable();
        button_EditData.click();
        waitForLoadingComplete();
    }
    public void send_Name(String Name){
        textbox_Name.waitForElementToBeDisplay();
        textbox_Name.sendClearText(Name);
    }

    public void send_Title(String Title){
        textbox_Title.waitForElementToBeDisplay();
        textbox_Title.sendClearText(Title);
    }

    public void send_AvatarImage(String image) throws InterruptedException {
        Thread.sleep(3000);
        fileUploader_AvatarImage.upload(System.getProperty("user.dir")+ "/src/main/resources/image/" + image);
        button_AvatarImageSuccess.waitForClickable();
        button_AvatarImageSuccess.click();
    }

    public void send_Email(String Email){
        textbox_Title.waitForElementToBeDisplay();
        textbox_Email.sendClearText(Email);
    }

    public void clickon_DayofBirth(String Date){
        button_Calendar.waitForClickable();
        button_Calendar.click();
        Calendar calendar = new Calendar(true);
        calendar.selectDate(Date);
    }

    public void select_Gender(String Gender){
        select_Gender.waitForElementToBeDisplay();
        select_Gender.getOptionsText();
        select_Gender.selectByVisibleText(Gender);
    }

    public void send_PhoneNumber(String PhoneNumber){
        textbox_PhoneNumber.waitForElementToBeDisplay();
        textbox_PhoneNumber.sendClearText(PhoneNumber);

    }

    public void send_WorkPhoneNumber(String WorkPhoneNumber){
        textbox_WorkPhone.sendClearText(WorkPhoneNumber);
    }

    public void select_MeasurementUnit(String Unit){
        select_MeasurementUnit.waitForElementToBeDisplay();
        select_MeasurementUnit.selectByVisibleText(Unit);
    }

    public void select_VisitCountry(String visitCountry){
        select_VisitCountry.waitForElementToBeDisplay();
        select_VisitCountry.selectByVisibleText(visitCountry);
    }

    public void select_Country(String Country){
        select_Country.waitForElementToBeDisplay();
        select_Country.selectByVisibleText(Country);
    }

    public void select_City(String City){
        select_City.waitForElementToBeDisplay();
        select_City.selectByVisibleText(City);
    }

    public void select_District(String District){
        select_District.waitForElementToBeDisplay();
        select_District.selectByVisibleText(District);
    }

    public void select_Ward(String Ward){
        select_Ward.waitForElementToBeDisplay();
        select_Ward.selectByVisibleText(Ward);
    }



    public void clickon_Save(){
        button_Save.waitForClickable();
        button_Save.click();
        waitForJSToComplete();
    }
}
