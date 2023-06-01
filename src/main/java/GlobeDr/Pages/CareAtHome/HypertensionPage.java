package GlobeDr.Pages.CareAtHome;

import Core.Selenium.ListOfElements;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class HypertensionPage extends BaseGlobeDrPage {
    public final static By by = By.xpath("//app-user");
    private static final String name = "HypertensionPage";

    //locators

    private final String xpath_upload_Highestdiastolicbloodpressure_Hypertension = "(//div/small[@class='text-error text-red']/preceding-sibling::input)[1]";
    private final String xpath_upload_Lowestdiastolicbloodpressure_Hypertension = "(//div/small[@class='text-error text-red']/preceding-sibling::input)[2]";
    private final String xpath_upload_Highestsystolicbloodpressure_Hypertension = "(//div/small[@class='text-error text-red']/preceding-sibling::input)[3]";
    private final String xpath_upload_Lowestsystolicbloodpressure_Hypertension = "(//div/small[@class='text-error text-red']/preceding-sibling::input)[4]";
    //elements

    private final Textbox textbox_Highestdiastolicbloodpressure_Hypertension = new Textbox(By.xpath(xpath_upload_Highestdiastolicbloodpressure_Hypertension),"textbox_Highestdiastolicbloodpressure_Hypertension");
    private final Textbox textbox_Lowestdiastolicbloodpressure_Hypertension = new Textbox(By.xpath(xpath_upload_Lowestdiastolicbloodpressure_Hypertension),"textbox_Lowestdiastolicbloodpressure_Hypertension");
    private final Textbox textbox_Highestsystolicbloodpressure_Hypertension = new Textbox(By.xpath(xpath_upload_Highestsystolicbloodpressure_Hypertension),"textbox_Highestsystolicbloodpressure_Hypertension");
    private final Textbox textbox_Lowestsystolicbloodpressure_Hypertension = new Textbox(By.xpath(xpath_upload_Lowestsystolicbloodpressure_Hypertension),"textbox_Lowestsystolicbloodpressure_Hypertension");
    //contructor
    public HypertensionPage(boolean assertOpen) {super(by,name,assertOpen);}

    public void send_BloodPressureStatus_Hypertension(String Hight_diastolic, String Low_diastolic, String Hight_systolic, String Low_systolic){
        waitForLoadingComplete();
        send_Highestdiastolicbloodpressure(Hight_diastolic);
        send_Lowestdiastolicbloodpressure(Low_diastolic);
        send_Hightestsystolicbloodpressure(Hight_systolic);
        send_Lowestsystolicbloodpressure(Low_systolic);
    }

    public void send_Highestdiastolicbloodpressure(String number){
        textbox_Highestdiastolicbloodpressure_Hypertension.sendClearText(number);
        waitForJSToComplete();
    }

    public void send_Lowestdiastolicbloodpressure(String number){
        textbox_Lowestdiastolicbloodpressure_Hypertension.sendClearText(number);
        waitForJSToComplete();
    }

    public void send_Hightestsystolicbloodpressure(String number){
        textbox_Highestsystolicbloodpressure_Hypertension.sendClearText(number);
        waitForJSToComplete();
    }

    public void send_Lowestsystolicbloodpressure(String number){
        textbox_Lowestsystolicbloodpressure_Hypertension.sendClearText(number);
        waitForJSToComplete();
    }

    public void select_AccompaniedPathologicalConditions(String type, String answer){
        String xpath = String.format("//span[contains(text(), '%s')]/following-sibling::div",type);
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath),"listQuestion");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if (listOfElements.getElement(i).getText().equalsIgnoreCase(answer)){
                listOfElements.getElement(i).findElement(By.xpath("./span")).click();
                waitForJSToComplete();
            }
        }
    }
}
