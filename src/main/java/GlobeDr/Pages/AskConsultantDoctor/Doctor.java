package GlobeDr.Pages.AskConsultantDoctor;

import Core.Selenium.*;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class Doctor extends BaseGlobeDrPage {
    private final static By by = By.xpath("");
    private static final String name = "Doctor";

    //locators
    public final String xpath_SelectRole = "//select[@class='form-control form-control-default']";
    public final String xpath_AnswerConsultant = "//img[@src='/assets/images/icons/coordinator/provider.png']";
    public final String xpath_SearchByName = "//span[@class='ic-gdr gdr-search']";
    public final String xpath_InputID = "//input[@placeholder='ID']";
    public final String xpath_Filter = "//button[@translate='filter']";
    public final String xpath_Dropdown = "//div[@class='dropdown float-right']";
    public final String xpath_LabelViewDetail = "//li/a[@translate='viewDetail']";
    public final String xpath_Accept = "//button[@translate='accept']";
    public final String xpath_ButtonAccept = "//button[contains(@class,'btn-success')]";
    public final String xpath_AnswerQuestion = "//div[@class='comment-post form-control']/textarea";
    public final String xpath_Send = "//i[@class='ic-gdr gdr-compass']";
    public final String xpath_PrescribeTest = "//button[@translate='prescribeTests']";
    public final String xpath_SelectHospital = "//select[@class='form-control ng-untouched ng-pristine ng-valid']";
    public final String xpath_NamePrescribeTest = "//div[@class='form-group form-group-default']/input";
    public final String xpath_NameTest = "//div[@class='w100p-60px z-index-1']";
    public final String xpath_Test = "//p[contains(text(),'Cholesterol')]";
    public final String xpath_ConfirmTest = "//button[@translate='confirm']";
    public final String xpath_Completed = "//button[@translate='completed']";

    //elements
    private final Select selectRole = new Select(By.xpath(xpath_SelectRole),"selectRole");
    private final Button buttonAnswerConsultant = new Button(By.xpath(xpath_AnswerConsultant),"btnAnswerConsultant");
    private final Label labelSearchName = new Label(By.xpath(xpath_SearchByName),"labelSearchName");
    private final Textbox textboxInputID = new Textbox(By.xpath(xpath_InputID),"textboxInputID");
    private final Button buttonFilter = new Button(By.xpath(xpath_Filter),"btnFilter");
    private final Button buttonDropdown = new Button(By.xpath(xpath_Dropdown),"btnDropdown");
    private final Label labelViewDetail = new Label(By.xpath(xpath_LabelViewDetail),"labelViewDetail");
    private final Button buttonAccept = new Button(By.xpath(xpath_Accept),"btnAccept");
    private final Button buttonYes = new Button(By.xpath(xpath_ButtonAccept),"btnYes");
    private final Textbox textboxAnswerQuestion = new Textbox(By.xpath(xpath_AnswerQuestion),"textboxAnswerQuestion");
    private final Button buttonSend = new Button(By.xpath(xpath_Send),"btnSend");
    private final Button buttonPrescribeTest = new Button(By.xpath(xpath_PrescribeTest),"btnPrescribeTest");
    private final Select selectHospital = new Select(By.xpath(xpath_SelectHospital),"selectHospital");
    private final Textbox textboxNamePrescribeTest = new Textbox(By.xpath(xpath_NamePrescribeTest),"textboxNamePrescribeTest");
    private final Button buttonConfirmTest = new Button(By.xpath(xpath_ConfirmTest),"btnConfirmTest");
    private final Button buttonCompleted = new Button(By.xpath(xpath_Completed),"btnCompleted");
    //contructor
    public Doctor(boolean assertOpen) {super(by,name,assertOpen);}

    public void selectRole(String Role){
        selectRole.selectByVisibleText(Role);
        waitForJSToComplete();
    }

    public void clickonAnswerConsultant(){
        buttonAnswerConsultant.waitForClickable();
        buttonAnswerConsultant.click();
        waitForJSToComplete();
        waitForLoadingComplete();
    }

    public void clickSearchName(){
        labelSearchName.waitForElementToBeDisplay();
        labelSearchName.click();
        waitForJSToComplete();
    }

    public void sendID(String ID){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        textboxInputID.waitForElementToBeDisplay();
        textboxInputID.sendClearText(ID);
    }

    public void clickonFilter(){
        buttonFilter.waitForClickable();
        buttonFilter.click();
        waitForJSToComplete();
    }

    public void clickonDropdown(){
        buttonDropdown.waitForClickable();
        buttonDropdown.click();
        waitForJSToComplete();
    }

    public void clickonViewDetail(){
        labelViewDetail.waitForElementToBeDisplay();
        labelViewDetail.click();
        waitForJSToComplete();
    }

    public void clickonAccept(){
        buttonAccept.waitForClickable();
        buttonAccept.click();
        waitForJSToComplete();
    }

    public void clickonYes(){
        buttonYes.waitForClickable();
        buttonYes.click();
//        waitForJSToComplete();
    }

    public void sendAnswerQuestion(String AnswerQuestion){
        textboxAnswerQuestion.waitForElementToBeDisplay();
        textboxAnswerQuestion.sendClearText(AnswerQuestion);
        waitForJSToComplete();
    }

    public void clickonSend(){
        buttonSend.waitForClickable();
        buttonSend.click();
        waitForJSToComplete();
    }

    public void clickonPrescribeTest(){
        buttonPrescribeTest.waitForClickable();
        buttonPrescribeTest.click();
        waitForJSToComplete();
    }

    public void selectHospital(String Hospital) throws InterruptedException {
        Thread.sleep(3000);
        selectHospital.waitForElementToBeEnabled();
        selectHospital.selectByVisibleText(Hospital);
        waitForJSToComplete();
    }

    public void sendNamePrescribeTest(String NamePrecribeTest, String NameTest, String Test) throws InterruptedException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        textboxNamePrescribeTest.waitForElementToBeDisplay();
        textboxNamePrescribeTest.sendText(NamePrecribeTest);
        waitForLoadingComplete();
        selectNameTest(NameTest);
        waitForLoadingComplete();
        selectTest(Test);
        waitForJSToComplete();
    }

    public void selectNameTest(String test){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_NameTest),"NameTest");
        for(int i = 0 ; i < listOfElements.getNumberOfElement(); i++){
            if(listOfElements.getElement(i).getText().equalsIgnoreCase(test)){
                listOfElements.getElement(i).click();
            }
        }
    }

    public void selectTest(String Test){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_Test),"Test");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++){
            if(listOfElements.getElement(i).getText().equalsIgnoreCase(Test)){
                listOfElements.getElement(i).click();
            }
        }
    }

    public void clickonConfirmTest() throws InterruptedException {
        buttonConfirmTest.waitForClickable();
        buttonConfirmTest.click();
        waitForJSToComplete();
    }

    public void clickonCompleted() throws InterruptedException {
        Thread.sleep(2000);
        buttonCompleted.waitForClickable();
        buttonCompleted.click();
        waitForJSToComplete();
    }
}
