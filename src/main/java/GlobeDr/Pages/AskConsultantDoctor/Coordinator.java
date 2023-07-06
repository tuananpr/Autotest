package GlobeDr.Pages.AskConsultantDoctor;

import Core.Selenium.*;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class Coordinator extends BaseGlobeDrPage {
    private final static By by = By.xpath("//app-coordinator");
    private static final String name = "Approver";
    //locators
    public final String xpath_RoleCoordinator = "//select[@class='form-control form-control-default']";
    public final String xpath_Coordinator = "//a[@href='/consult/coordinator']/div";
    public final String xpath_ListIDConsultant = "//tbody//td[1]";
    public final String xpath_ListDropdown = "//tbody//div[@class='ic-dropdown']";
    public final String xpath_SearchByName = "//span[@class='ic-gdr gdr-search']";
    public final String xpath_InputID = "//input[@placeholder='ID']";
    public final String xpath_Filter = "//button[@translate='filter']";
    public final String xpath_Dropdown = "//div[@class='dropdown float-right']";
    public final String xpath_Dropdown_EditSpecialty = "//ul//a[@translate='editSpecialty']";
    public final String xpath_EditSpecialty = "//div[@class='panel-left']//button[@translate='editSpecialty']";
    public final String xpath_ListSpecialty = "//app-set-classify-question-modal//p[@class='text-small text-gray']//preceding-sibling::p";
    public final String xpath_DropdownDetailCoordinator = "(//div[@class='ic-dropdown'])[0]";
    public final String xpath_LabelViewDetail = "//li/a[@translate='viewDetail']";
    public final String xpath_Dropdown_InviteDoctor = "//ul//a[@translate='inviteDoctor']";
    public final String xpath_InputNameDoctor = "//div[@class='form-group']/input";
    public final String xpath_SearchDoctor = "//i[@class='ic-gdr gdr-search text-primary']";
    public final String xpath_NameDoctor = "//p[@class='fs16 text-uppercase']";
    public final String xpath_ButtonDone = "//button[@translate='done']";
    public final String xpath_InviteAuditor = "//button[@translate='submitRvw']";
    public final String xpath_InputNameAuditor = "//div[@class='form-group']/input";
    public final String xpath_SearchAuditor = "//i[@class='ic-gdr gdr-search text-primary']";
    public final String xpath_NameAuditor = "//p[@class='fs16 text-uppercase']";
    public final String xpath_CloseQuestion = "//ul//a[@translate='closeQuestion']";
    public final String xpath_OK = "//app-close-question-modal//button[@translate='ok']";
    public final String xpath_Confirm = "//app-confirm//button[contains(@class,'btn-success')]";
    public final String xpath_ListQuestions = "//span[@translate='questions']";
    public final String xoath_StatusQuestion = "(//div[@class='panel-title text-white text-nowrap maw115 w100p'])[0]";
    public final String xpath_NotePromptKindAssignDoctor = "//app-set-classify-question-modal//select";
    public final String xpath_IDConsultant = "//div[@class='panel-center']//span[@class='d-inline-block']";

    //elements
    private final Label label_IDConsultant = new Label(By.xpath(xpath_IDConsultant),"label_IDConsultant");
    private final Select select_NotePromptKindAssignDoctor = new Select(By.xpath(xpath_NotePromptKindAssignDoctor),"select_NotePromptKindAssignDoctor");
    private final Select select_RoleCoordinator = new Select(By.xpath(xpath_RoleCoordinator),"labelRoleApprover");
    private final Label label_Coordinator = new Label(By.xpath(xpath_Coordinator),"labelApprover");
    private final ListOfElements list_IDConsultant = new ListOfElements(By.xpath(xpath_ListIDConsultant),"list_IDCoordinator");
    private final ListOfElements list_Dropdown = new ListOfElements(By.xpath(xpath_ListDropdown),"list_Dropdown");
    private final Label label_SearchByName = new Label(By.xpath(xpath_SearchByName),"labelSearchByName");
    private final Textbox textbox_InputID = new Textbox(By.xpath(xpath_InputID),"textboxInputID");
    private final Button button_Filter = new Button(By.xpath(xpath_Filter),"btnFilter");
    private final Button button_Dropdown_EditSpecialty = new Button(By.xpath(xpath_Dropdown_EditSpecialty),"btn_Dropdown_EditSpecialty");
    private final Button button_EditSpecialty = new Button(By.xpath(xpath_EditSpecialty),"btn_Edit_Specialty");
    private final Button button_DropdownDetailApprover = new Button(By.xpath(xpath_DropdownDetailCoordinator),"btnDropdownDetailApprover");
    private final Label label_ViewDetail = new Label(By.xpath(xpath_LabelViewDetail),"labelViewDetail");
    private final Button button_Dropdown_InviteDoctor = new Button(By.xpath(xpath_Dropdown_InviteDoctor),"btnInviteDoctor");
    private final Textbox textbox_InputNameDoctor = new Textbox(By.xpath(xpath_InputNameDoctor),"textboxInputNameDoctor");
    private final Button button_SearchDoctor = new Button(By.xpath(xpath_SearchDoctor),"btnSearchDoctor");
    private final Button button_Done = new Button(By.xpath(xpath_ButtonDone),"btnDone");
    private final Button button_Confirm = new Button(By.xpath(xpath_Confirm),"btn_Confirm");
    private final Button button_InviteAuditor = new Button(By.xpath(xpath_InviteAuditor),"btnInviteAuditor");
    private final Textbox textbox_InputNameAuditor = new Textbox(By.xpath(xpath_InputNameAuditor),"textboxInputNameAuditor");
    private final Button button_SearchAuditor = new Button(By.xpath(xpath_SearchAuditor),"btnSearchAuditor");
    private final Button button_CloseQuestion = new Button(By.xpath(xpath_CloseQuestion),"btnCloseQuestion");
    private final Button button_OK = new Button(By.xpath(xpath_OK),"btnOK");
    private final Button button_listQuestion = new Button(By.xpath(xpath_ListQuestions),"btnListQuestions");
    private final Label label_StatusQuestion = new Label(By.xpath(xoath_StatusQuestion),"labelStatusQuestion");

    //contructor
    public Coordinator(boolean assertOpen) {super(by,name,assertOpen);}



    public void Select_NotePromptKindAssignDoctor(String Note){
        select_NotePromptKindAssignDoctor.selectByContains(Note);
        waitForJSToComplete();
    }

    public void clickon_Role(String Role){
        select_RoleCoordinator.waitForElementToBeDisplay();
        select_RoleCoordinator.selectByVisibleText(Role);
        waitForJSToComplete();

    }

    public void clickon_Coordinator(){
        label_Coordinator.waitForElementToBeDisplay();
        label_Coordinator.click();
        waitForLoadingComplete();
    }
    public void clickon_SearchByName(){
        label_SearchByName.waitForElementToBeDisplay();
        label_SearchByName.click();
        waitForJSToComplete();
    }

    public void send_IDConsultant(String ID){
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
        waitForLoadingComplete();
    }


    public void clickon_Dropdown(String id){
        waitForLoadingComplete();
        for (int i = 0; i < list_IDConsultant.getNumberOfElement(); i++) {
                if(list_IDConsultant.getElement(i).getText().contains("#"+id)){
                    list_Dropdown.getElement(i).click();
                    waitForJSToComplete();
                }
        }
    }

    public void clickon_Dropdown_EditSpecialty(){
        button_Dropdown_EditSpecialty.waitForClickable();
        button_Dropdown_EditSpecialty.click();
        waitForJSToComplete();
    }

    public void select_EditSpecialty(String Specialty, String Note){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_ListSpecialty),"list_Specialty");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            listOfElements.scrollToElement(i);
            if(listOfElements.getElement(i).getText().contains(Specialty)){
                listOfElements.getElement(i).click();
            }
        }
        clickon_Done();
        if (select_NotePromptKindAssignDoctor.isElementDisplay()) {
            select_NotePromptKindAssignDoctor.selectByVisibleText(Note);
            clickon_Done();
        } else {

        }
    }


    public void clickon_ViewDetail(){
        label_ViewDetail.waitForElementToBeDisplay();
        label_ViewDetail.click();
        waitForLoadingComplete();
    }

    public void clickon_Dropdown_InviteDoctor(String Doctor) throws InterruptedException {
        button_Dropdown_InviteDoctor.waitForClickable();
        button_Dropdown_InviteDoctor.click();
        waitForJSToComplete();
        select_Doctor(Doctor);
        clickon_Done();
        if(button_Confirm.isElementDisplay()){
            Thread.sleep(2000);
            button_Confirm.waitForClickable();
            button_Confirm.click();
            waitForJSToComplete();
        } else {
        }
        Thread.sleep(3000);
    }

    public void clickon_SearchDoctor(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        button_SearchDoctor.waitForClickable();
        button_SearchDoctor.click();
    }

    public void select_Doctor(String Doctor) throws InterruptedException {
        clickon_SearchDoctor();
        waitForJSToComplete();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_NameDoctor),"listDoctor");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            listOfElements.scrollToElement(i);
            if(listOfElements.getElement(i).getText().contains(Doctor)){
                listOfElements.getElement(i).click();
                Thread.sleep(2000);
                clickon_Confirm();
            }
        }
    }

    public void clickon_Confirm(){
        button_Confirm.waitForClickable();
        button_Confirm.click();
        waitForJSToComplete();
    }
    public void clickon_Done(){
        button_Done.waitForClickable();
        button_Done.click();
        waitForJSToComplete();
    }

    public void clickon_InviteAuditor(){
        button_InviteAuditor.waitForClickable();
        button_InviteAuditor.click();
        waitForJSToComplete();
    }

    public void send_NameAuditor(String name){
        textbox_InputNameAuditor.waitForElementToBeDisplay();
        textbox_InputNameAuditor.sendClearText(name);
        waitForJSToComplete();
    }

    public void clickon_SearchAuditor(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        button_SearchAuditor.waitForClickable();
        button_SearchAuditor.click();
    }

    public void select_Auditor(String Auditor) throws InterruptedException {
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_NameAuditor),"NameAuditor");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().equalsIgnoreCase(Auditor)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
        clickon_Done();
        waitForLoadingComplete();
        Thread.sleep(3000);
    }

    public void clickon_CloseQuestion(){
        button_CloseQuestion.waitForClickable();
        button_CloseQuestion.click();
        waitForJSToComplete();
        clickon_OK();
    }

    public void clickon_OK(){
        button_OK.waitForClickable();
        button_OK.click();
        waitForJSToComplete();
    }

    public String get_IDConsultant(String id){
        String ID = id.substring(0);
//        String ID = label_IDConsultant.getText().substring(2);
        System.out.println(ID);
        return ID;
    }
}
