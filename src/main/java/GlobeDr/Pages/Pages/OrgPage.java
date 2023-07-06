package GlobeDr.Pages.Pages;

import Core.Selenium.Button;
import Core.Selenium.Label;
import Core.Selenium.ListOfElements;
import Core.Selenium.Select;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class OrgPage extends BaseGlobeDrPage {
    private final static By by = By.xpath("//app-dashboard");
    private static final String name = "OrgPage";


    //locators
    private final String xpath_ChangeRole = "//app-change-management[@id='change-management']";
    private final String xpath_AppManagement = "//app-change-management/div/select/option";
    private final String xpath_NameOrg = "//h1//span[contains(@class,'text-primary')]";
    private final String xpath_ChangeOrg = "//app-dashboard//a[@translate='change']";
    private final String xpath_ListRole = "//app-change-management//select/option";
    private final String xpath_ListOrg = "//p[@translate='selectOrganization']//following-sibling::div/div[contains(@class,'list-group')]";
    private final String xpath_ListFeature = "//app-dashboard//a//p[@class='text-nowrap']";
    private final String xpath_PageRCE_Org = "//img[@src='/assets/images/icons/organization/medicine.png']";
    private final String xpath_PageAppointment_Org = "//img[@src='/assets/images/icons/organization/appointments.png']";
    private final String xpath_PageMedicalTestOrder_Org = "//img[@src='/assets/images/icons/organization/medicine-test.png']";
    //elements
    private final Button buttonChangeRole = new Button(By.xpath(xpath_ChangeRole),"btnChangeRole");
    private final Select selectManagement = new Select(By.xpath(xpath_AppManagement),"selectManagement");
    private final Label labelNameOrg = new Label(By.xpath(xpath_NameOrg),"labelNameOrg");
    private final Button buttonChangeOrg = new Button(By.xpath(xpath_ChangeOrg),"btnChangeOrg");
    private final Button buttonRCEOrg = new Button(By.xpath(xpath_PageRCE_Org),"btnPageRCE");
    private final Button buttonAppointmentOrg = new Button(By.xpath(xpath_PageAppointment_Org),"btnAppointmentOrg");
    private final Button buttonMedicalTestOrderOrg = new Button(By.xpath(xpath_PageMedicalTestOrder_Org),"btnMedicalTestOrderOrg");
    //contructor
    public OrgPage(Boolean assertOpen) {super(by,name,assertOpen);}

    public void selectManagement(String role, String nameOrg, String feature){
        if(selectManagement.getText().equalsIgnoreCase(role)){
            if(labelNameOrg.getText().equalsIgnoreCase(nameOrg)){
                ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_ListFeature),"listFeature");
                for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
                    if(listOfElements.getElement(i).getText().contains(feature)){
                        listOfElements.getElement(i).click();
                        waitForLoadingComplete();
                    }
                }
            } else {
                buttonChangeOrg.waitForClickable();
                buttonChangeOrg.click();
                waitForJSToComplete();
                ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_ListOrg),"listOrg");
                for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
                    if(listOfElements.getElement(i).getText().contains(nameOrg)){
                        listOfElements.getElement(i).click();
                        waitForLoadingComplete();
                    }
                }
            }
        } else {
            buttonChangeRole.waitForClickable();
            buttonChangeRole.click();
            waitForJSToComplete();
            ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_ListRole),"listRole");
            for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
                if(listOfElements.getElement(i).getText().contains(role)){
                    listOfElements.getElement(i).click();
                    waitForLoadingComplete();
                }
            }
        }
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_ListFeature),"listFeature");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(feature)){
                listOfElements.getElement(i).click();
                waitForLoadingComplete();
            }
        }
    }

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

    public void clickonMedicalTestOrder(){
        buttonMedicalTestOrderOrg.waitForClickable();
        buttonMedicalTestOrderOrg.click();
        waitForJSToComplete();
    }
}
