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

    private final String xpath_OrderMedicalTest = "//app-menu-user//button[@translate='orderMedicalTest']";
    private final String xpath_OrgMedilab = "//div[@class='slimScrollDiv']//div/p[contains(@class,'fw-bold')]";
    private final String xpath_MethodSampleTest = "//fieldset//select";
    private final String xpath_SelectATestType = "//fieldset//button/span[@translate='selectTestType']";
    private final String xpath_SearchMedicalTest = "//fieldset//input[@placeholder='Enter to search']";
    private final String xpath_listMedicalTest = "//div[@slimscroll]//p[@class='text-gray']/preceding-sibling::p[contains(@text,'')]";
    private final String xpath_GroupTest = "//fieldset//div[contains(@class,'tabs-line')]/ul/li/a";
    private final String xpath_ViewTestsSelected = "//fieldset//div/p/span[@translate='selectedMedicalTestWithParam']";
    private final String xpath_ConfirmSelectedMedicalTest = "//app-view-selected-product-modal//button[contains(@class,'btn-success')]";
    //elements

    private final Button buttonOrderMedicalTest = new Button(By.xpath(xpath_OrderMedicalTest),"btnOrderMedicalTest");
    private final Select selectMethodSampleTest = new Select(By.xpath(xpath_MethodSampleTest),"selectMethodSampleTest");
    private final Button buttonSelectATestType = new Button(By.xpath(xpath_SelectATestType),"btnSelectATestType");
    private final Textbox textboxSearchMedicalTest = new Textbox(By.xpath(xpath_SearchMedicalTest),"textboxSearchMedicalTest");


    private final Button buttonViewTestsSelected = new Button(By.xpath(xpath_ViewTestsSelected),"btnViewTestsSelected");
    private final Button buttonConfirmSelectedMedicalTest = new Button(By.xpath(xpath_ConfirmSelectedMedicalTest),"btnConfirmSelectedMedicalTest");
    //contructor
    public UserMedicalTest(Boolean assertOpen) {super(by,name,assertOpen);}



    public void clickonOrderMedicalTest(){
        buttonOrderMedicalTest.waitForClickable();
        buttonOrderMedicalTest.click();
    }

    public void selectMedilab(String NameMedilab){
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

    public void selectGroupTest(String NameGroup){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_GroupTest),"GroupTest");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(NameGroup)){
                System.out.println(listOfElements.getElement(i).getText());
                listOfElements.getElement(i).click();
            }
        }
    }

    public void sendNameMedicalTest(String Name){
        textboxSearchMedicalTest.waitForElementToBePresent();
        textboxSearchMedicalTest.sendText(Name);
        waitForJSToComplete();
    }

    public void selectTest(String NameTest) {
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_listMedicalTest), "listMedicalTest");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(NameTest)){
                listOfElements.getElement(i).click();
            }

        }
    }

    public void clickonViewTestsSelected(){
        buttonViewTestsSelected.waitForClickable();
        buttonViewTestsSelected.click();
        waitForJSToComplete();
    }

    public void clickonConfirmSelectedMedicalTest(){
        buttonConfirmSelectedMedicalTest.waitForClickable();
        buttonConfirmSelectedMedicalTest.click();
        waitForJSToComplete();
    }

}
