package GlobeDr.Pages.MedicalTest;

import Core.Selenium.Button;
import Core.Selenium.ListOfElements;
import Core.Selenium.Select;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class UserMedicalTest extends BaseGlobeDrPage {
    private final static By by = By.xpath("");
    private static final String name = "UserMedicalTest";
    //locators
    private final String xpath_MedicalTest = "//app-home-user//a[@href='/medical-test']//img";
    private final String xpath_OrderMedicalTest = "//app-menu-user//button[@translate='orderMedicalTest']";
    private final String xpath_OrgMedilab = "//app-add-medical-test//label[@translate='selectMedicalTest']";
    private final String xpath_MethodSampleTest = "//fieldset//select";
    private final String xpath_SelectATestType = "//fieldset//button/span[@translate='selectTestType']";
    private final String xpath_SearchMedicalTest = "//fieldset//input[@placeholder='Enter to search']";
    private final String xpath_SelectGroupTest = "//fieldset//div[@class='row']//li/a";
    //elements
    private final Button buttonMedicalTest = new Button(By.xpath(xpath_MedicalTest),"btnMedicalTest");
    private final Button buttonOrderMedicalTest = new Button(By.xpath(xpath_OrderMedicalTest),"btnOrderMedicalTest");
    private final Select selectMethodSampleTest = new Select(By.xpath(xpath_MethodSampleTest),"selectMethodSampleTest");
    private final Button buttonSelectATestType = new Button(By.xpath(xpath_SelectATestType),"btnSelectATestType");
    private final Textbox textboxSearchMedicalTest = new Textbox(By.xpath(xpath_SearchMedicalTest),"textboxSearchMedicalTest");

    //contructor
    public UserMedicalTest(Boolean assertOpen) {super(by,name,assertOpen);}

    public void clickonMedicalTest(){
        buttonMedicalTest.waitForClickable();
        buttonMedicalTest.click();
    }

    public void clickonOrderMedicalTest(){
        buttonOrderMedicalTest.waitForClickable();
        buttonOrderMedicalTest.click();
    }

    public void selectMedilab(String NameMedilab){
        waitForLoadingComplete();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_OrgMedilab),"selectMedilab");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(NameMedilab)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
    }

    public void selectMethodSampleTest(String Method){
        selectMethodSampleTest.selectByContains(Method);
        waitForJSToComplete();
    }

    public void clickonSelectATestType(){
        buttonSelectATestType.waitForClickable();
        buttonSelectATestType.click();
        waitForJSToComplete();
    }

    public void sendNameMedicalTest(String Name){
        textboxSearchMedicalTest.waitForElementToBePresent();
        textboxSearchMedicalTest.sendText(Name);
        waitForJSToComplete();
    }

    public void selectGroupTest(String Name){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_SelectGroupTest),"listGroupTest")
    }
}
