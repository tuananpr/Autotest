package GlobeDr.Pages.Pages;

import Core.Selenium.Button;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class OrgPage extends BaseGlobeDrPage {
    private final static By by = By.xpath("//app-dashboard");
    private static final String name = "OrgPage";


    //locators
    private final String xpath_PageRCE_Org = "//img[@src='/assets/images/icons/organization/medicine.png']";
    private final String xpath_PageAppointment_Org = "//img[@src='/assets/images/icons/organization/appointments.png']";
    //elements
    private final Button buttonRCEOrg = new Button(By.xpath(xpath_PageRCE_Org),"btnPageRCE");
    private final Button buttonAppointmentOrg = new Button(By.xpath(xpath_PageAppointment_Org),"btnAppointmentOrg");
    //contructor
    public OrgPage(Boolean assertOpen) {super(by,name,assertOpen);}

    public void clickonRCEOrg(){
        buttonRCEOrg.waitForClickable();
        buttonRCEOrg.click();
        waitForLoadingComplete();
    }

    public void clickonAppointment(){
        buttonAppointmentOrg.waitForClickable();
        buttonAppointmentOrg.click();
        waitForPageLoadComplete();
    }
}
