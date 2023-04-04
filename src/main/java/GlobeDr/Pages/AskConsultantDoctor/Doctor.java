package GlobeDr.Pages.AskConsultantDoctor;

import Core.Selenium.*;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class Doctor extends BaseGlobeDrPage {
    private final static By by = By.xpath("//app-provider-mode");
    private static final String name = "Doctor";

    //locators
    public final String xpath_Role = "//select[@class='form-control form-control-default']";
    public final String xpath_AnswerConsultant = "//img[@src='/assets/images/icons/coordinator/provider.png']";
    public final String xpath_SearchByName = "//span[@class='ic-gdr gdr-search']";
    public final String xpath_InputID = "//input[@placeholder='ID']";
    public final String xpath_Filter = "//button[@translate='filter']";
    public final String xpath_ListDropdown = "//tbody//div[@class='ic-dropdown']";
    public final String xpath_ListIDConsultant = "//tbody//td[1]";
    public final String xpath_ViewDetail = "//li/a[@translate='viewDetail']";
    public final String xpath_Accept = "//button[@translate='accept']";
    public final String xpath_Yes = "//button[contains(@class,'btn-success')]";
    public final String xpath_AnswerQuestion = "//div[@class='comment-post form-control']/textarea";
    public final String xpath_Send = "//i[@class='ic-gdr gdr-compass']";
    public final String xpath_PrescribeTest = "//button[@translate='prescribeTests']";
    public final String xpath_Hospital = "//select[@class='form-control ng-untouched ng-pristine ng-valid']";
    public final String xpath_NamePrescribeTest = "//div[@class='form-group form-group-default']/input";
    public final String xpath_NameTest = "//div[@class='w100p-60px z-index-1']";
    public final String xpath_Test = "//p[contains(text(),'Cholesterol')]";
    public final String xpath_ConfirmTest = "//button[@translate='confirm']";
    public final String xpath_Completed = "//button[@translate='completed']";
    public final String xpath_IDConsultant = "//div[@class='panel-center']//span[@class='d-inline-block']";

    //elements
    private final Label label_IDConsultant = new Label(By.xpath(xpath_IDConsultant),"label_IDConsultant");
    private final Select select_Role = new Select(By.xpath(xpath_Role),"select_Role");
    private final Button button_AnswerConsultant = new Button(By.xpath(xpath_AnswerConsultant),"btn_AnswerConsultant");
    private final Label label_SearchName = new Label(By.xpath(xpath_SearchByName),"label_SearchName");
    private final Textbox textbox_InputID = new Textbox(By.xpath(xpath_InputID),"textbox_InputID");
    private final Button button_Filter = new Button(By.xpath(xpath_Filter),"btnFilter");
    private final ListOfElements list_Dropdown = new ListOfElements(By.xpath(xpath_ListDropdown),"list_Dropdown");
    private final ListOfElements list_IDConsultant = new ListOfElements(By.xpath(xpath_ListIDConsultant),"list_IDCoordinator");
    private final Label label_ViewDetail = new Label(By.xpath(xpath_ViewDetail),"labelViewDetail");
    private final Button button_Accept = new Button(By.xpath(xpath_Accept),"btnAccept");
    private final Button button_Yes = new Button(By.xpath(xpath_Yes),"btnYes");
    private final Textbox textbox_AnswerQuestion = new Textbox(By.xpath(xpath_AnswerQuestion),"textboxAnswerQuestion");
    private final Button button_Send = new Button(By.xpath(xpath_Send),"btnSend");
    private final Button button_PrescribeTest = new Button(By.xpath(xpath_PrescribeTest),"btnPrescribeTest");
    private final Select select_Hospital = new Select(By.xpath(xpath_Hospital),"selectHospital");
    private final Textbox textbox_NamePrescribeTest = new Textbox(By.xpath(xpath_NamePrescribeTest),"textboxNamePrescribeTest");
    private final Button button_ConfirmTest = new Button(By.xpath(xpath_ConfirmTest),"btnConfirmTest");
    private final Button button_Completed = new Button(By.xpath(xpath_Completed),"btnCompleted");
    //contructor
    public Doctor(boolean assertOpen) {super(by,name,assertOpen);}

    public void select_Role(String Role){
        select_Role.selectByVisibleText(Role);
        waitForJSToComplete();
    }

    public void clickon_AnswerConsultant(){
        button_AnswerConsultant.waitForClickable();
        button_AnswerConsultant.click();
        waitForJSToComplete();
        waitForLoadingComplete();
    }

    public void click_SearchName(){
        label_SearchName.waitForElementToBeDisplay();
        label_SearchName.click();
        waitForJSToComplete();
    }

    public void send_ID(String ID){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        textbox_InputID.waitForElementToBeDisplay();
        textbox_InputID.sendClearText(ID);
        waitForJSToComplete();
        clickon_Filter();
    }

    public void clickon_Filter(){
        button_Filter.waitForClickable();
        button_Filter.click();
        waitForJSToComplete();
    }

    public void clickon_Dropdown(String id) throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < list_IDConsultant.getNumberOfElement(); i++) {
            System.out.println(list_IDConsultant.getElement(i).getText().contains("#"+id));
            if(list_IDConsultant.getElement(i).getText().contains("#"+id)){
                list_Dropdown.getElement(i).click();
            }
        }
    }

    public void clickon_ViewDetail(){
        label_ViewDetail.waitForElementToBeDisplay();
        label_ViewDetail.click();
        waitForLoadingComplete();
    }

    public void clickon_Accept(){
        button_Accept.waitForClickable();
        button_Accept.click();
        waitForJSToComplete();
        clickon_Yes();
    }

    public void clickon_Yes(){
        button_Yes.waitForClickable();
        button_Yes.click();
        waitForJSToComplete();
    }

    public void send_AnswerQuestion(String AnswerQuestion){
        textbox_AnswerQuestion.waitForElementToBeDisplay();
        textbox_AnswerQuestion.sendClearText(AnswerQuestion);
        waitForJSToComplete();
        clickon_Send();
    }

    public void clickon_Send(){
        button_Send.waitForClickable();
        button_Send.click();
        waitForJSToComplete();
    }

    public void clickon_PrescribeTest(){
        button_PrescribeTest.waitForClickable();
        button_PrescribeTest.click();
        waitForJSToComplete();
    }

    public void select_Hospital(String Hospital) throws InterruptedException {
        Thread.sleep(3000);
        select_Hospital.waitForElementToBeEnabled();
        select_Hospital.selectByVisibleText(Hospital);
        waitForJSToComplete();
    }

    public void send_NamePrescribeTest(String NamePrecribeTest, String NameTest, String Test) throws InterruptedException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        textbox_NamePrescribeTest.waitForElementToBeDisplay();
        textbox_NamePrescribeTest.sendText(NamePrecribeTest);
        waitForLoadingComplete();
        select_NameTest(NameTest);
        waitForLoadingComplete();
        select_Test(Test);
        waitForJSToComplete();
        clickon_ConfirmTest();
    }

    public void select_NameTest(String test){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_NameTest),"NameTest");
        for(int i = 0 ; i < listOfElements.getNumberOfElement(); i++){
            if(listOfElements.getElement(i).getText().equalsIgnoreCase(test)){
                listOfElements.getElement(i).click();
            }
        }
    }

    public void select_Test(String Test){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_Test),"Test");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++){
            if(listOfElements.getElement(i).getText().equalsIgnoreCase(Test)){
                listOfElements.getElement(i).click();
            }
        }
    }

    public void clickon_ConfirmTest() throws InterruptedException {
        button_ConfirmTest.waitForClickable();
        button_ConfirmTest.click();
        waitForJSToComplete();
    }

    public void clickon_Completed() throws InterruptedException {
        Thread.sleep(2000);
        button_Completed.waitForClickable();
        button_Completed.click();
        waitForJSToComplete();
        clickon_Yes();
        waitForLoadingComplete();
        Thread.sleep(3000);
    }

    public String get_IDConsultant(){
        String ID = label_IDConsultant.getText().substring(2);
        System.out.println(ID);
        return ID;
    }
}
