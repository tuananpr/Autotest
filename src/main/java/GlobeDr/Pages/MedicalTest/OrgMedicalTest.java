package GlobeDr.Pages.MedicalTest;

import Core.Selenium.Button;
import Core.Selenium.Label;
import Core.Selenium.ListOfElements;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

import java.util.List;


public class OrgMedicalTest extends BaseGlobeDrPage {
    private final static By by = By.xpath("");
    private static final String name = "OrgMedicalTest";

    //locators
    private final String xpath_textbox_Search_Order = "//app-medicaltest/div/div[@class='dropdown']/div/input";
    private final String xpath_textbox_ID = "//app-medicaltest//input[@placeholder='ID']";
    private final String xpath_button_Filter = "//app-medicaltest//button[@translate='filter']";
    private final String xpath_list_Status_MedicalTest = "//div[@perfectscrollbar]//span[@class='text-uppercase']";
    private final String xpath_Option = "//app-medicaltest//div[@class='panel-right']//a[@translate='option']";
    private final String xpath_dropdown_Option = "//div[@class='panel-right']//li";
    private final String xpath_button_CancelTest = "//a[@translate='cancelTest']";
    private final String xpath_button_Success = "//div[@class='modal-content']//button[contains(@class,'btn-success')]";
    private final String xpath_textbox_Search_Staff = "//app-assign-sampler-modal//input[@placeholder]";
    private final String xpath_button_Search = "//app-assign-sampler-modal//i[@class='ic-gdr gdr-search']";
    private final String xpath_list_Diag_Staff = "//app-assign-sampler-modal//div[@class='row']//p[contains(@class,'text-uppercase')]";
    private final String xpath_button_Compelete_Assign = "//div[@class='modal-footer']/button";
    private static final String xpath_label_Name_Sampling_Staff = "//div[@translate='samplingStaff']//following-sibling::div[@class='text-primary']";
    //elements
    private final Textbox textbox_Search_Order = new Textbox(By.xpath(xpath_textbox_Search_Order),"textbox_Search");
    private final Textbox textbox_ID = new Textbox(By.xpath(xpath_textbox_ID),"textbox_ID");
    private final Button button_Filter = new Button(By.xpath(xpath_button_Filter),"button_Filter");
    private final Button button_Option = new Button(By.xpath(xpath_Option),"button_dropdown_Option");
    private final Button button_CancelTest = new Button(By.xpath(xpath_button_CancelTest),"button_CancelTest");
    private final Button button_Success = new Button(By.xpath(xpath_button_Success),"button_Success");
    private final Button button_Search = new Button(By.xpath(xpath_button_Search),"button_Search");
    private final Textbox textbox_Search_Staff = new Textbox(By.xpath(xpath_textbox_Search_Staff),"textbox_Search_Staff");
    private final Button button_Compelete_Assign = new Button(By.xpath(xpath_button_Compelete_Assign),"button_Compelete_Assign");
    private static final Label label_Name_Sampling_Staff = new Label(By.xpath(xpath_label_Name_Sampling_Staff),"label_Name_Sampling_Staff");
    //contructors
    public OrgMedicalTest(Boolean assertOpen) {super(by,name,assertOpen);}

    public void clickonSearch(){
        textbox_Search_Order.waitForElementToBePresent();
        textbox_Search_Order.click();
        waitForJSToComplete();
    }

    public void sendID(String ID){
        textbox_ID.waitForElementToBePresent();
        textbox_ID.sendText(ID);
        waitForJSToComplete();
    }

    public void clickonFilter(){
        button_Filter.waitForClickable();
        button_Filter.click();
        waitForJSToComplete();
    }

    public void searchMedicalTestByID(String ID){
        clickonSearch();
        sendID(ID);
        clickonFilter();
    }

    public void clickonCancelOrderMedical(List<String> status){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_Status_MedicalTest),"listStatus");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            listOfElements.scrollToElement(i);
            for (int j = 0; j < status.size(); j++) {
                if (listOfElements.getElement(i).getText().equalsIgnoreCase(status.get(j))) {
                    listOfElements.getElement(i).click();
                    waitForJSToComplete();
                    clickonCancelTestOrder();
                }
            }
        }
    }

    public void clickonDropdownOption(){
        button_Option.waitForClickable();
        button_Option.click();
        waitForJSToComplete();
    }

    public void clickonCancelTest(){
        button_CancelTest.waitForClickable();
        button_CancelTest.click();
        waitForJSToComplete();
    }

    public void clickonSuccess(){
        button_Success.waitForClickable();
        button_Success.click();
        waitForJSToComplete();
    }
    public void clickonCancelTestOrder(){
        clickonDropdownOption();
        clickonCancelTest();
        clickonSuccess();
        waitForLoadingComplete();
    }

    public void selectOption(String option){
        clickonDropdownOption();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_dropdown_Option),"btnOption");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(option)){
                listOfElements.getElement(i).click();
                System.out.println("Acction " + listOfElements.getElement(i));
                waitForJSToComplete();
            }
        }
    }

    public void sendNameStaff(String name) throws InterruptedException {
        textbox_Search_Staff.waitForElementToBePresent();
        textbox_Search_Staff.sendText(name);
        Thread.sleep(3000);
    }

    public void clickonCompeleteAssign() throws InterruptedException {
        button_Compelete_Assign.waitForClickable();
        Thread.sleep(3000);
        button_Compelete_Assign.click();
        waitForJSToComplete();
    }

    public void selectDiagStaff(String name_Staff) throws InterruptedException {
        sendNameStaff(name_Staff);
        button_Search.waitForClickable();
        button_Search.click();
        waitForJSToComplete();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_Diag_Staff),"list_Diag_Staff");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            listOfElements.scrollToElement(i);
            if(listOfElements.getElement(i).getText().contains(name_Staff)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
        clickonCompeleteAssign();
    }

    public static String getNameStaff(){
        label_Name_Sampling_Staff.waitForElementToBeDisplay();
        label_Name_Sampling_Staff.getText();
        return label_Name_Sampling_Staff.getText();
    }
}
