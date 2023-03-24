package GlobeDr.Pages.AskConsultantDoctor;

import Core.Selenium.Button;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class Auditor extends BaseGlobeDrPage {
    private final static By by = By.xpath("");
    private static final String name = "Auditor";

    //locators
    public final String xpath_SelectRole = "//select[@class='form-control form-control-default']";
    public final String xpath_Auditor = "//a[@href='/consult/auditor']/div";
    public final String xpath_InputID = "//input[@placeholder='ID']";
    public final String xpath_SearchByName = "//span[@class='ic-gdr gdr-search']";
    public final String xpath_Filter = "//button[@translate='filter']";
    public final String xpath_Dropdown = "//div[@class='dropdown float-right']";
    public final String xpath_DropdownDetailAuditor = "(//div[@class='ic-dropdown'])[0]";
    public final String xpath_LabelViewDetail = "//li/a[@translate='viewDetail']";
    public final String xpath_AgreeWithThisAnswer = "//button[@translate='agreeWithThisAnswer']";
    public final String xpath_ButtonAccept = "//button[contains(@class,'btn-success')]";
    //elements
    private final Button buttonSelectRole = new Button(By.xpath(xpath_SelectRole),"btnSelectRole");
    private final Button buttonAuditor = new Button(By.xpath(xpath_Auditor),"btnAuditor");
    private final Textbox textboxInputID = new Textbox(By.xpath(xpath_InputID),"textboxInputID");
    private final Button buttonSearchByName = new Button(By.xpath(xpath_SearchByName),"btnSearchByName");
    private final Button buttonFilter = new Button(By.xpath(xpath_Filter),"btnFilter");
    private final Button buttonDropdown = new Button(By.xpath(xpath_Dropdown),"btnDropdown");
    private final Button buttonDropdownDetailAuditor = new Button(By.xpath(xpath_DropdownDetailAuditor),"btnDropdownDetailAuditor");
    private final Button buttonViewDetail = new Button(By.xpath(xpath_LabelViewDetail),"btnViewDetail");
    private final Button buttonAgreeWithThisAnswer = new Button(By.xpath(xpath_AgreeWithThisAnswer)," btnAgreeWithThisAnswer");
    private final Button buttonAccept = new Button(By.xpath(xpath_ButtonAccept),"btnAccept");

    //contructor
    public Auditor(boolean assertOpen) {super(by,name,assertOpen);}

    public void clickonAuditor(){
        buttonAuditor.waitForClickable();
        buttonAuditor.click();
        waitForLoadingComplete();
    }

    public void sendID(String ID){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        textboxInputID.waitForElementToBeDisplay();
        textboxInputID.sendClearText(ID);
        waitForJSToComplete();
        clickonFilter();
        waitForJSToComplete();
    }

    public void clickonSearchByName(){
        buttonSearchByName.waitForClickable();
        buttonSearchByName.click();
    }

    public void clickonFilter(){
        buttonFilter.waitForClickable();
        buttonFilter.click();
    }

    public void clickonDropdown(){
        buttonDropdown.waitForClickable();
        buttonDropdown.click();
    }

    public void clickonDropdownDetail(){
        buttonDropdownDetailAuditor.waitForClickable();
        buttonDropdownDetailAuditor.click();
    }

    public void clickonViewDetail(){
        buttonViewDetail.waitForClickable();
        buttonViewDetail.click();
        waitForJSToComplete();
    }

    public void clickonAgreeWithThisAnswer(){
        buttonAgreeWithThisAnswer.waitForClickable();
        buttonAgreeWithThisAnswer.click();
        waitForJSToComplete();
    }

    public void clickonAccept(){
        buttonAccept.waitForClickable();
        buttonAccept.click();
    }
}
