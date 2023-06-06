package GlobeDr.Pages.MedicalTest;

import Core.Selenium.Button;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;


public class OrgMedicalTest extends BaseGlobeDrPage {
    public final static By by = By.xpath("");
    public static final String name = "OrgMedicalTest";

    //locators
    private final String xpath_textboxSearch = "//app-medicaltest/div/div[@class='dropdown']/div/input";
    private final String xpath_textboxID = "//app-medicaltest//input[@placeholder='ID']";
    private final String xpath_buttonFilter = "//app-medicaltest//button[@translate='filter']";
    //elements
    private final Textbox textboxSearch = new Textbox(By.xpath(xpath_textboxSearch),"textboxSearch");
    private final Textbox textboxID = new Textbox(By.xpath(xpath_textboxID),"textboxID");
    private final Button buttonFilter = new Button(By.xpath(xpath_buttonFilter),"buttonFilter");
    //contructors
    public OrgMedicalTest(Boolean assertOpen) {super(by,name,assertOpen);}

    public void clickonSearch(){
        textboxSearch.waitForElementToBePresent();
        textboxSearch.click();
        waitForJSToComplete();
    }

    public void sendID(String ID){
        textboxID.waitForElementToBePresent();
        textboxID.sendText(ID);
        waitForJSToComplete();
    }

    public void clickonFilter(){
        buttonFilter.waitForClickable();
        buttonFilter.click();
        waitForJSToComplete();
    }

    public void SearchMedicalTestByID(String ID){
        clickonSearch();
        sendID(ID);
        clickonFilter();
    }
}
