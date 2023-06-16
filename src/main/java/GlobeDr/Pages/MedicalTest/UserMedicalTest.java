package GlobeDr.Pages.MedicalTest;

import Core.Selenium.*;
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
    private final String xpath_SearchMedicalTest = "//fieldset/div/input[contains(@placeholder,'')]";
    private final String xpath_listMedicalTest = "//div[@slimscroll]//p[@class='text-gray']/preceding-sibling::p[contains(@text,'')]";
    private final String xpath_listTest = "//div[@slimscroll]/div/div/p[2]";
    private final String xpath_ButtonChoose = "//app-view-product-modal//button[@type='button']";
    private final String xpath_GroupTest = "//fieldset//div[contains(@class,'tabs-line')]/ul/li/a";
    private final String xpath_ViewTestsSelected = "//fieldset//div/p/span[@translate='selectedMedicalTestWithParam']";
    private final String xpath_ConfirmSelectedMedicalTest = "//app-view-selected-product-modal//button[contains(@class,'btn-success')]";
    private final String xpath_ID = "(//app-medical-test-detail-model//div[contains(@class,'mw')]/following-sibling::div[1])";
    private final String xpath_StatusMedical = "(//app-medical-test-detail-model/div/div/div/p[1])";
    //elements

    private final Button buttonOrderMedicalTest = new Button(By.xpath(xpath_OrderMedicalTest),"btnOrderMedicalTest");
    private final Select selectMethodSampleTest = new Select(By.xpath(xpath_MethodSampleTest),"selectMethodSampleTest");
    private final Button buttonSelectATestType = new Button(By.xpath(xpath_SelectATestType),"btnSelectATestType");
    private final Textbox textboxSearchMedicalTest = new Textbox(By.xpath(xpath_SearchMedicalTest),"textboxSearchMedicalTest");

    private final ListOfElements listOfElementsTest = new ListOfElements(By.xpath(xpath_listTest),"listTest");
    private final Button buttonChoose = new Button(By.xpath(xpath_ButtonChoose),"btnChoose");
    private final Button buttonViewTestsSelected = new Button(By.xpath(xpath_ViewTestsSelected),"btnViewTestsSelected");
    private final Button buttonConfirmSelectedMedicalTest = new Button(By.xpath(xpath_ConfirmSelectedMedicalTest),"btnConfirmSelectedMedicalTest");
    private final Label labelIDMedicalTest = new Label(By.xpath(xpath_ID),"labelIDMedicalTest");
    private final Label labelStatusMedical = new Label(By.xpath(xpath_StatusMedical),"labelStatusMedical");
    //contructor
    public UserMedicalTest(Boolean assertOpen) {super(by,name,assertOpen);}


    public void labelStatusMedical(){
        labelIDMedicalTest.waitForElementToBeDisplay();
        labelIDMedicalTest.getText();
    }

    public void clickonOrderMedicalTest(){
        buttonOrderMedicalTest.waitForClickable();
        buttonOrderMedicalTest.click();
        waitForJSToComplete();
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
                listOfElements.getElement(i).click();
            }
        }
    }

    public void sendNameMedicalTest(String Name) throws InterruptedException {
        textboxSearchMedicalTest.waitForElementToBePresent();
        textboxSearchMedicalTest.sendText(Name);
        waitForJSToComplete();
        selectTest(Name);
    }

    public void selectTest(String NameTest) throws InterruptedException {
        Thread.sleep(3000);
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_listMedicalTest), "listMedicalTest");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(NameTest)){
                System.out.println("NameTest " + listOfElements.getElement(i).getText());
                listOfElements.getElement(i).click();
            }
        }
        buttonChoose.waitForClickable();
        buttonChoose.click();
        waitForJSToComplete();
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

    public void clickonView_ConfirmSelectedMedicalTest(){
        clickonViewTestsSelected();
        clickonConfirmSelectedMedicalTest();
    }

    public String getIDOrderMedicalTest(){
        String ID = labelIDMedicalTest.getText().substring(1);
        System.out.println("OrderID " + ID);
        return ID;
    }
}
