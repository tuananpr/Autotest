package GlobeDr.Pages.CareAtHome;

import Core.Selenium.Button;
import Core.Selenium.Select;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import GlobeDr.Pages.Pages.PracticePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DoctorCareAtHome extends BaseGlobeDrPage {
    public static final By by = By.xpath("");
    public final static String name = "";

    //locators
    private final String xpath_search_ID = "//div[@class='dropdown']/div/input[@placeholder]";
    private final String xpath_filter = "//button[@translate='filter']";
    private final String xpath_advice_patient = "//label[@translate='advicePatient']/preceding-sibling::textarea";
    private final String xpath_setting_status = "//div[@class='modal-body']/div/select";
    //elements
    private final Textbox textbox_search_ID = new Textbox(By.xpath(xpath_search_ID),"textbox_search_ID");
    private final Button button_filter = new Button(By.xpath(xpath_filter),"button_filter");
    private final Textbox textbox_advice_patient = new Textbox(By.xpath(xpath_advice_patient),"textbox_advice_patient");
    private final Select select_setting_status = new Select(By.xpath(xpath_setting_status),"select_setting_status");
    //contructor

    public DoctorCareAtHome(boolean assertOpen) {super(by,name,assertOpen);
    }
    PracticePage practicePage = new PracticePage(false);
    ManagerCareAtHome managerCareAtHome = new ManagerCareAtHome(false);
    InfoCareAtHome infoCareAtHome = new InfoCareAtHome(false);
    public void change_role(String role){
        practicePage.select_role(role);
        waitForLoadingComplete();
    }

    public void select_feature(String feature){
        practicePage.select_feature(feature);
        waitForLoadingComplete();
    }

    public void send_ID(String ID){
        textbox_search_ID.sendText(ID);
        waitForJSToComplete();
        textbox_search_ID.sendKey(Keys.ENTER);
    }

    public void clickon_filter(){
        button_filter.waitForClickable();
        button_filter.click();
        waitForJSToComplete();
    }

    public void clickon_IDCareAtHome(String ID){

        managerCareAtHome.clickon_IDCareAtHome(ID);
        waitForJSToComplete();
    }

    public void clickon_acctions(String action){
        managerCareAtHome.clickon_actions(action);
    }

    public void send_advice_patient(String advice){
        textbox_advice_patient.sendText(advice);
        waitForJSToComplete();
        infoCareAtHome.clickon_Send();
    }

    public void select_status(String status){
        select_setting_status.selectByContains(status);
        waitForJSToComplete();
        infoCareAtHome.clickon_Complete();
    }
}
