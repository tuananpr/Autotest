package GlobeDr.Pages.AskConsultantDoctor;

import Core.Selenium.Button;
import Core.Selenium.Label;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class Auditor extends BaseGlobeDrPage {
    private final static By by = By.xpath("");
    private static final String name = "Auditor";

    //locators
    public final String xpath_Auditor = "//a[@href='/consult/auditor']/div";
    public final String xpath_InputID = "//input[@placeholder='ID']";
    public final String xpath_SearchByName = "//span[@class='ic-gdr gdr-search']";
    public final String xpath_Filter = "//button[@translate='filter']";
    public final String xpath_Dropdown = "//div[@class='dropdown float-right']";
    public final String xpath_Dropdown_Detail = "(//div[@class='ic-dropdown'])[0]";
    public final String xpath_LabelViewDetail = "//li/a[@translate='viewDetail']";
    public final String xpath_AgreeWithThisAnswer = "//button[@translate='agreeWithThisAnswer']";
    public final String xpath_ButtonAccept = "//button[contains(@class,'btn-success')]";
    public final String xpath_IDConsultant = "//div[@class='panel-center']//span[@class='d-inline-block']";




    //elements
    private final Button button_Auditor = new Button(By.xpath(xpath_Auditor),"btnAuditor");
    private final Textbox textbox_InputID = new Textbox(By.xpath(xpath_InputID),"textboxInputID");
    private final Button button_SearchByName = new Button(By.xpath(xpath_SearchByName),"btnSearchByName");
    private final Button button_Filter = new Button(By.xpath(xpath_Filter),"btnFilter");
    private final Button button_Dropdown = new Button(By.xpath(xpath_Dropdown),"btnDropdown");
    private final Button button_Dropdown_Detail = new Button(By.xpath(xpath_Dropdown_Detail),"btnDropdownDetailAuditor");
    private final Button button_ViewDetail = new Button(By.xpath(xpath_LabelViewDetail),"btnViewDetail");
    private final Button button_AgreeWithThisAnswer = new Button(By.xpath(xpath_AgreeWithThisAnswer)," btnAgreeWithThisAnswer");
    private final Button button_Accept = new Button(By.xpath(xpath_ButtonAccept),"btnAccept");
    private final Label label_IDConsultant = new Label(By.xpath(xpath_IDConsultant),"label_IDConsultant");

    //contructor
    public Auditor(boolean assertOpen) {super(by,name,assertOpen);}

    public void clickon_Auditor(){
        button_Auditor.waitForClickable();
        button_Auditor.click();
        waitForLoadingComplete();
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
        waitForJSToComplete();
    }

    public void clickon_SearchByName(){
        button_SearchByName.waitForClickable();
        button_SearchByName.click();
    }

    public void clickon_Filter(){
        button_Filter.waitForClickable();
        button_Filter.click();
    }

    public void clickon_Dropdown(){
        button_Dropdown.waitForClickable();
        button_Dropdown.click();
    }

    public void clickon_ViewDetail(){
        button_ViewDetail.waitForClickable();
        button_ViewDetail.click();
        waitForJSToComplete();
    }

    public void clickon_AgreeWithThisAnswer() throws InterruptedException {
        button_AgreeWithThisAnswer.waitForClickable();
        button_AgreeWithThisAnswer.click();
        waitForJSToComplete();
        clickon_Accept();
        waitForLoadingComplete();
        Thread.sleep(3000);
    }

    public void clickon_Accept(){
        button_Accept.waitForClickable();
        button_Accept.click();
    }

    public String get_IDConsultant(){
        String ID = label_IDConsultant.getText().substring(1);
        System.out.println(ID);
        return ID;
    }
}
