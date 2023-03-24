package GlobeDr.Pages.Appointment;

import Core.Selenium.Button;
import Core.Selenium.Label;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class OrgAppointment extends BaseGlobeDrPage {
    private final static By by = By.xpath("//app-organization");
    private static final String name = "";

    //locators
    public final String xpath_AppointmentList = "//img[contains(@src,'appointments')]";
    public final String xpath_SearchIDAppointment = "//input[@class='form-control form-control-default pl40 ng-untouched ng-pristine ng-valid']";
    public final String xpath_Search = "//span[@class='ic-gdr gdr-search']";
    public final String xpath_Filter = "//button[@translate='filter']";
    public final String xpath_ButtonDone = "//button[contains(@class,'btn-success')]/i";
    public final String xpath_ButtonSave = "//button[@translate='save']";


    //elements
    private final Button buttonAppointment = new Button(By.xpath(xpath_AppointmentList),"btnAppointment");
    private final Textbox textboxSearchIDAppoitnment = new Textbox(By.xpath(xpath_SearchIDAppointment),"textboxSearchIDAppoitment");
    private final Button buttonFilter = new Button(By.xpath(xpath_Filter),"btnFilter");
    private final Button buttonSearch = new Button(By.xpath(xpath_Search),"btnSearch");
    private final Button buttonDone = new Button(By.xpath(xpath_ButtonDone),"btnDone");
    private final Button buttonSave = new Button(By.xpath(xpath_ButtonSave),"btnSave");
    private static final Label labelToastContainer = new Label(By.id("toast-container"),"labelToastContainer");

    //contructor
    public OrgAppointment(boolean assertOpen) {
        super(by,name,assertOpen);
    }


    public void clickonAppoitnment() throws InterruptedException {
        buttonAppointment.waitForClickable();
        buttonAppointment.click();
        waitForJSToComplete();
        Thread.sleep(4000);
    }

    public void sendIDAppointment(String id) throws InterruptedException {
        Thread.sleep(3000);
        textboxSearchIDAppoitnment.waitForElementToBeDisplay();
        textboxSearchIDAppoitnment.click();
        Thread.sleep(1000);
        textboxSearchIDAppoitnment.sendClearText(id);
        Thread.sleep(1000);
        buttonSearch.waitForClickable();
        buttonSearch.click();
    }

    public void clickonDone(){
        buttonDone.waitForClickable();
        buttonDone.click();
        waitForJSToComplete();
    }

    public void clickonSave(){
        buttonSave.waitForClickable();
        buttonSave.click();
        waitForJSToComplete();
    }

//    public static String getToastMessage() throws InterruptedException {
//        Thread.sleep(3000);
//        return labelToastContainer.getText();
//    }

}
