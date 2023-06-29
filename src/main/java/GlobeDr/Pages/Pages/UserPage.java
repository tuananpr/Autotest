package GlobeDr.Pages.Pages;

import Core.Selenium.Button;
import Core.Selenium.ListOfElements;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class UserPage extends BaseGlobeDrPage {
    private static final By by = By.xpath("//app-home-user");
    private final static String name = "UserPage";

    //locators

    private final String xpath_RCE_User = "//img[@src='/assets/images/icons/user/order.png']";
    private final String xpath_PatientCare_User = "//button[@id='patient-care']/img";
    public final String xpath_buttonName_User = "//li[@class='nav-item nav-account']";
    private final String xpath_ManageFamilyMember_User = "//p[@translate='manageFamilyMember']";
    private final String xpath_Appointment_User = "//a[@href='/appointment']/div/img";
    private final String xpath_List_User = "//div[@class='align-self-center']/p[contains(@class,'fs')]";
    private final String xpath_MedicalTest = "//app-home-user//a[@href='/medical-test']//img";
    private final String xpath_List_Feature = "//app-home-user//a//p[@class='text-nowrap']";
    private final String xpath_List_Payment_methods = "//ul[@class='nav nav-tabs nav-method']//a/span";
    //elements

    private final Button button_RCE_User = new Button(By.xpath(xpath_RCE_User),"btnRCEUser");
    private final Button button_PatientCare_User = new Button(By.xpath(xpath_PatientCare_User),"btnPatientCare");
    private final Button button_Name_User = new Button(By.xpath(xpath_buttonName_User),"btnNameUser");
    private final Button button_ManageMember_User = new Button(By.xpath(xpath_ManageFamilyMember_User),"btnManageFamilyMember");
    private final Button button_Appointment_User = new Button(By.xpath(xpath_Appointment_User),"btnAppointmentUser");
    private final Button buttonMedicalTest = new Button(By.xpath(xpath_MedicalTest),"btnMedicalTest");
    //contructor
    public UserPage (boolean assertOpent) {super(by,name,assertOpent);}

    public void clickonRCE_User(){
        button_RCE_User.waitForClickable();
        button_RCE_User.click();
        waitForLoadingComplete();
    }

    public void clickonPatientCare_User(){
        button_PatientCare_User.waitForClickable();
        button_PatientCare_User.click();
        waitForLoadingComplete();
    }

    public void clickonName_User(){
        button_Name_User.waitForClickable();
        button_Name_User.click();
        waitForJSToComplete();
    }

    public void clickon_ManageMember_User(){
        clickonName_User();
        button_ManageMember_User.waitForClickable();
        button_ManageMember_User.click();
        waitForLoadingComplete();
    }

    public void select_Account(String account){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_List_User),"List_User");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(account)){
                listOfElements.getElement(i).click();
            }
        }
        waitForJSToComplete();
    }

    public void clickonAppointment_User(){
        button_Appointment_User.waitForClickable();
        button_Appointment_User.click();
        waitForLoadingComplete();
    }

    public void clickonMedicalTest(){
        buttonMedicalTest.waitForClickable();
        buttonMedicalTest.click();
    }

    public void selectFeature(String feature){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_List_Feature),"listFeature");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(feature)){
                listOfElements.getElement(i).click();
                waitForLoadingComplete();
            }
        }
    }

    public void select_Payment_Method (String method){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_List_Payment_methods),"list_Payment_Method");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(method)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
    }
}
