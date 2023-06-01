package GlobeDr.Pages.CareAtHome;

import Core.Selenium.Button;
import Core.Selenium.ListOfElements;
import Core.Selenium.Select;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import GlobeDr.Pages.Modules.Calendar;
import org.openqa.selenium.By;

public class UserCareAtHomeInfo extends BaseGlobeDrPage {
    private static final By by = By.xpath("//app-user");
    private final static String name = "Care At Home";

    //locators
    private final String xpath_button_AddNewPatientRecord = "//button[@translate='newPatientRecord']";
    private final String xpath_button_Account = "//div/div[contains(dropdown,'')]/span";
    public final String xpath_label_NameAccount = "//div[@class='mr-auto']/p";
    private final String xpath_textbox_Name = "(//h3[@translate='generalInformation']/following-sibling::div/input)[1]";
    private final String xpath_textbox_Phone = "(//h3[@translate='generalInformation']/following-sibling::div/input)[2]";
    private final String xpath_textbox_Passport = "//label[@translate='passPort']/preceding-sibling::input";
    private final String xpath_button_CalenderDOB = "//span[@class='ic-gdr gdr-calendar-o']";
    private final String xpath_select_Gender = "//div[contains(@class,'row')]/div/div/select";
    private final String xpath_textbox_Address = "//input[@id='address']";
    private final String xpath_select_Country = "(//div[contains(@class,'mb')]/div/select)[1]";
    private final String xpath_select_City = "(//div[contains(@class,'mb')]/div/select)[2]";
    private final String xpath_select_District = "(//div[contains(@class,'mb')]/div/select)[3]";
    private final String xpath_select_Ward = "(//div[contains(@class,'mb')]/div/select)[4]";
    private final String xpath_textbox_HealthInsurance = "//label[@translate='healthInsurranceId']/preceding-sibling::input";
    private final String xpath_button_SignUp = "//button[@translate='signUp']";



    //elements
    private final Button button_AddNewPatientRecord = new Button(By.xpath(xpath_button_AddNewPatientRecord),"btn_AddNewPatientRecord");
    private final Button button_Account = new Button(By.xpath(xpath_button_Account),"btn_Account");
    private final Textbox textbox_Name = new Textbox(By.xpath(xpath_textbox_Name),"textbox_Name");
    private final Textbox textbox_Phone = new Textbox(By.xpath(xpath_textbox_Phone),"textbox_Phone");
    private final Textbox textbox_Passport = new Textbox(By.xpath(xpath_textbox_Passport),"textbox_Passport");
    private final Button button_CalenderDOB = new Button(By.xpath(xpath_button_CalenderDOB),"btn_CalenderDOB");
    private final Select select_Gender = new Select(By.xpath(xpath_select_Gender),"select_Gender");
    private final Textbox textbox_Address = new Textbox(By.xpath(xpath_textbox_Address),"textbox_Address");
    private final Select select_Country = new Select(By.xpath(xpath_select_Country),"select_Country");
    private final Select select_City = new Select(By.xpath(xpath_select_City),"select_City");
    private final Select select_District = new Select(By.xpath(xpath_select_District),"select_District");
    private final Select select_Ward = new Select(By.xpath(xpath_select_Ward),"select_Ward");
    private final Textbox textbox_HealthInsurance = new Textbox(By.xpath(xpath_textbox_HealthInsurance),"textbox_HealthInsurance");
    private final Button button_SignUp = new Button(By.xpath(xpath_button_SignUp),"btn_SignUp");


    //contructor
    public UserCareAtHomeInfo(boolean assertOpen) {super(by,name,assertOpen);}


    //Click

    public void clickon_AddNewPatientRecord(){
        button_AddNewPatientRecord.waitForClickable();
        button_AddNewPatientRecord.click();
        waitForLoadingComplete();
    }

    public void clickon_Account(){
        button_Account.waitForClickable();
        button_Account.click();
        waitForJSToComplete();
    }

    public void clickon_SignUp(){
        button_SignUp.waitForClickable();
        button_SignUp.click();
        waitForLoadingComplete();
    }

    //Select
    public void select_Account(String account){
        clickon_AddNewPatientRecord();
        waitForPageLoadComplete();
        clickon_Account();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_label_NameAccount),"labelAccount");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(account)){
                listOfElements.getElement(i).click();
            }
        }
    }

    public void select_Country(String country){
        select_Country.scrollToElement();
        select_Country.selectByVisibleText(country);
        waitForJSToComplete();
    }

    public void select_City(String city){
        select_City.scrollToElement();
        select_City.selectByVisibleText(city);
        waitForJSToComplete();
    }

    public void select_District(String district){
        select_District.scrollToElement();
        select_District.selectByVisibleText(district);
        waitForJSToComplete();
    }

    public void select_Ward(String ward){
        select_Ward.scrollToElement();
        select_Ward.selectByVisibleText(ward);
        waitForJSToComplete();
    }

    public void select_Gender(String gender){
        select_Gender.waitForElementToBeEnabled();
        select_Gender.selectByVisibleText(gender);
        waitForJSToComplete();
    }
    //Send
    public void send_Name(String name){
        textbox_Name.sendClearText(name);
        waitForJSToComplete();
    }

    public void send_PhoneNumber(String phone){
        textbox_Phone.sendClearText(phone);
        waitForJSToComplete();
    }

    public void send_Pastport(String pastport){
        textbox_Passport.sendClearText(pastport);
        waitForJSToComplete();
    }

    public void send_Calender(String date){
        button_CalenderDOB.waitForClickable();
        button_CalenderDOB.click();
        Calendar calendar = new Calendar(true);
        calendar.selectDate(date);
        waitForJSToComplete();
    }
    public void send_Address(String address){
        textbox_Address.waitForElementToBeDisplay();
        textbox_Address.sendClearText(address);
        waitForJSToComplete();
    }

    public void send_HealthInsurance(String number){
        textbox_HealthInsurance.waitForElementToBeDisplay();
        textbox_HealthInsurance.sendClearText(number);
        waitForJSToComplete();
    }

}
