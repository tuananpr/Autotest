package GlobeDr.Pages.CareAtHome.User;

import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class DiabetesPage extends BaseGlobeDrPage {
    public final static By by = By.xpath("//app-user");
    private static final String name = "DiabetesPage";

    //locators
    private final String xpath_upload_Hightestbloodsugar = "(//div/label/preceding-sibling::input)[1]";
    private final String xpath_upload_Lowestbloodsugar = "(//div/label/preceding-sibling::input)[2]";
    private final String xpath_upload_A1Clevels = "(//div/label/preceding-sibling::input)[3]";
    private final String xpath_upload_mgdL = "(//div/label/preceding-sibling::input)[4]";
    //elements
    private final Textbox textbox_Hightestbloodsugar = new Textbox(By.xpath(xpath_upload_Hightestbloodsugar),"textbox_Hightestbloodsugar");
    private final Textbox textbox_Lowestbloodsugar = new Textbox(By.xpath(xpath_upload_Lowestbloodsugar),"textbox_Lowestbloodsugar");
    private final Textbox textbox_A1Clevels = new Textbox(By.xpath(xpath_upload_A1Clevels),"textbox_A1Clevels");
    private final Textbox textbox_mgdL = new Textbox(By.xpath(xpath_upload_mgdL),"textbox_mgdL");
    //contructor
    public DiabetesPage(boolean assertOpen) {super(by,name,assertOpen);}

    public void send_Bloodsugarstatus(String Hight_Blood, String Low_Blood, String A1C, String mgdL){
        send_Hightestbloodsugar(Hight_Blood);
        send_Lowestbloodsugar(Low_Blood);
        send_A1Clevels(A1C);
        send_mgdL(mgdL);
    }

    public void send_Hightestbloodsugar(String Hight_Blood){
        textbox_Hightestbloodsugar.sendText(Hight_Blood);
        waitForJSToComplete();
    }

    public void send_Lowestbloodsugar(String Low_Blood){
        textbox_Lowestbloodsugar.sendText(Low_Blood);
        waitForJSToComplete();
    }

    public void send_A1Clevels(String A1C){
        textbox_A1Clevels.sendText(A1C);
        waitForJSToComplete();
    }

    public void send_mgdL(String mgdL){
        textbox_mgdL.sendText(mgdL);
        waitForJSToComplete();
    }
}
