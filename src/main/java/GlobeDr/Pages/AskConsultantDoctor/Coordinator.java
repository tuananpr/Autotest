package GlobeDr.Pages.AskConsultantDoctor;

import Core.Selenium.*;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class Coordinator extends BaseGlobeDrPage {
    private final static By by = By.xpath("");
    private static final String name = "Approver";
    //locators
    public final String xpath_RoleCoordinator = "//select[@class='form-control form-control-default']";
    public final String xpath_Coordinator = "//a[@href='/consult/coordinator']/div";
    public final String xpath_ListIDCoordinator = "//tr[@class='d-flex fw-600 ng-star-inserted']";
    public final String xpath_SearchByName = "//span[@class='ic-gdr gdr-search']";
    public final String xpath_InputID = "//input[@placeholder='ID']";
    public final String xpath_Filter = "//button[@translate='filter']";
    public final String xpath_Dropdown = "//div[@class='dropdown float-right']";
    public final String xpath_EditSpecialty = "//ul//a[@translate='editSpecialty']";
    public final String xpath_List_Specialty = "//app-set-classify-question-modal//p[@class='text-small text-gray']//preceding-sibling::p";
    public final String xpath_DropdownDetailCoordinator = "(//div[@class='ic-dropdown'])[0]";
    public final String xpath_LabelViewDetail = "//li/a[@translate='viewDetail']";
    public final String xpath_InviteDoctor = "//button[@translate='inviteDoctor']";
    public final String xpath_InputNameDoctor = "//div[@class='form-group']/input";
    public final String xpath_SearchDoctor = "//i[@class='ic-gdr gdr-search text-primary']";
    public final String xpath_NameDoctor = "//p[@class='fs16 text-uppercase']";
    public final String xpath_ButtonDone = "//button[@translate='done']";
    public final String xpath_InviteAuditor = "//button[@translate='submitRvw']";
    public final String xpath_InputNameAuditor = "//div[@class='form-group']/input";
    public final String xpath_SearchAuditor = "//i[@class='ic-gdr gdr-search text-primary']";
    public final String xpath_NameAuditor = "//p[@class='fs16 text-uppercase']";
    public final String xpath_CloseQuestion = "//button[@translate='closeQuestion']";
    public final String xpath_OK = "//button[contains(@class,'btn-success')]";
    public final String xpath_ListQuestions = "//span[@translate='questions']";
    public final String xoath_StatusQuestion = "(//div[@class='panel-title text-white text-nowrap maw115 w100p'])[0]";

    //elements
    private final Select selectRoleCoordinator = new Select(By.xpath(xpath_RoleCoordinator),"labelRoleApprover");
    private final Label labelCoordinator = new Label(By.xpath(xpath_Coordinator),"labelApprover");
    private final Label labelListIDApprover = new Label(By.xpath(xpath_ListIDCoordinator),"labelListIDApprover");
    private final Label labelSearchByName = new Label(By.xpath(xpath_SearchByName),"labelSearchByName");
    private final Textbox textboxInputID = new Textbox(By.xpath(xpath_InputID),"textboxInputID");
    private final Button buttonFilter = new Button(By.xpath(xpath_Filter),"btnFilter");
    private final Button buttonDropdown = new Button(By.xpath(xpath_Dropdown),"btnDropdown");
    private final Button button_Edit_Specialty = new Button(By.xpath(xpath_EditSpecialty),"btn_Edit_Specialty");
    private final Button buttonDropdownDetailApprover = new Button(By.xpath(xpath_DropdownDetailCoordinator),"btnDropdownDetailApprover");
    private final Label labelViewDetail = new Label(By.xpath(xpath_LabelViewDetail),"labelViewDetail");
    private final Button buttonInviteDoctor = new Button(By.xpath(xpath_InviteDoctor),"btnInviteDoctor");
    private final Textbox textboxInputNameDoctor = new Textbox(By.xpath(xpath_InputNameDoctor),"textboxInputNameDoctor");
    private final Button buttonSearchDoctor = new Button(By.xpath(xpath_SearchDoctor),"btnSearchDoctor");
    private final Button buttonDone = new Button(By.xpath(xpath_ButtonDone),"btnDone");
    private final Button buttonInviteAuditor = new Button(By.xpath(xpath_InviteAuditor),"btnInviteAuditor");
    private final Textbox textboxInputNameAuditor = new Textbox(By.xpath(xpath_InputNameAuditor),"textboxInputNameAuditor");
    private final Button buttonSearchAuditor = new Button(By.xpath(xpath_SearchAuditor),"btnSearchAuditor");
    private final Button buttonCloseQuestion = new Button(By.xpath(xpath_CloseQuestion),"btnCloseQuestion");
    private final Button buttonOK = new Button(By.xpath(xpath_OK),"btnOK");
    private final Button buttonListQuestion = new Button(By.xpath(xpath_ListQuestions),"btnListQuestions");
    private final Label labelStatusQuestion = new Label(By.xpath(xoath_StatusQuestion),"labelStatusQuestion");

    //contructor
    public Coordinator(boolean assertOpen) {super(by,name,assertOpen);}

    public void clickonRole(String Role){
        selectRoleCoordinator.waitForElementToBeDisplay();
        selectRoleCoordinator.selectByVisibleText(Role);
        waitForJSToComplete();

    }

    public void clickonCoordinator(){
        labelCoordinator.waitForElementToBeDisplay();
        labelCoordinator.click();
        waitForLoadingComplete();
    }
    public void clickonSearchByName(){
        labelSearchByName.waitForElementToBeDisplay();
        labelSearchByName.click();
        waitForJSToComplete();
    }

    public void sendIDConsultant(String ID){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        textboxInputID.waitForElementToBeDisplay();
        textboxInputID.sendClearText(ID);
        waitForJSToComplete();
    }

    public void clickonFilter(){
        buttonFilter.waitForClickable();
        buttonFilter.click();
        waitForLoadingComplete();
    }

    public void clickonDropdown(){
        buttonDropdown.waitForClickable();
        buttonDropdown.click();
    }

    public void clickon_Edit_Specialty(){
        button_Edit_Specialty.waitForClickable();
        button_Edit_Specialty.click();
        waitForJSToComplete();
    }

    public void select_Edit_Specialty(String Specialty){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_List_Specialty),"list_Specialty");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            listOfElements.scrollToElement(i);
            if(listOfElements.getElement(i).getText().contains(Specialty)){
                listOfElements.getElement(i).click();
            }
        }
        clickon_Done();
    }
    public void clickonDropdownDetailApprover(){
        buttonDropdownDetailApprover.waitForClickable();
        buttonDropdownDetailApprover.click();
    }

    public void clickonViewDetail(){
        labelViewDetail.waitForElementToBeDisplay();
        labelViewDetail.click();
        waitForJSToComplete();
    }

    public void clickonInviteDoctor(){
        buttonInviteDoctor.waitForClickable();
        buttonInviteDoctor.click();
    }

    public void clickonSearchDoctor(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buttonSearchDoctor.waitForClickable();
        buttonSearchDoctor.click();
    }

    public void selectDoctor(String Doctor){
        clickonSearchDoctor();
        waitForJSToComplete();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_NameDoctor),"listDoctor");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().equalsIgnoreCase(Doctor)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
    }

    public void clickon_Done(){
        buttonDone.waitForClickable();
        buttonDone.click();
        waitForJSToComplete();

    }

    public void clickonInviteAuditor(){
        buttonInviteAuditor.waitForClickable();
        buttonInviteAuditor.click();
        waitForJSToComplete();
    }

    public void sendNameAuditor(String name){
        textboxInputNameAuditor.waitForElementToBeDisplay();
        textboxInputNameAuditor.sendClearText(name);
        waitForJSToComplete();
    }

    public void clickonSearchAuditor(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buttonSearchAuditor.waitForClickable();
        buttonSearchAuditor.click();
    }

    public void selectAuditor(String Auditor){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_NameAuditor),"NameAuditor");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().equalsIgnoreCase(Auditor)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
    }

    public void clickonCloseQuestion(){
        buttonCloseQuestion.waitForClickable();
        buttonCloseQuestion.click();
        waitForJSToComplete();
    }

    public void clickonOK(){
        buttonOK.waitForClickable();
        buttonOK.click();
//        waitForJSToComplete();
    }

    public void clickonListQuestions(){
        buttonListQuestion.waitForClickable();
        buttonListQuestion.click();
    }


}
