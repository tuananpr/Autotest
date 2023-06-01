package GlobeDr.Pages.CareAtHome;

import Core.Selenium.Button;
import Core.Selenium.ListOfElements;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class ManagerCareAtHome extends BaseGlobeDrPage {
    public static final By by = By.xpath("");
    public final static String name ="";
    //locators

    private final String xpath_button_manager_CAH = "//div/a/div/img[contains(@src,'patient-care.png')]";
    private final String xpath_list_ID_CAH = "//div[@id]/div/div/div/div[contains(text(),'ID')]";
    private final String xpath_list_Doctor = "//div[contains(@class,'bg-image-model')]/following::p";
    private final String xpath_button_Assign = "//button[@translate='asign']";

    //elements

    private final Button button_managerCAH = new Button(By.xpath(xpath_button_manager_CAH),"button_CAH");
    private final Button button_Asssign = new Button(By.xpath(xpath_button_Assign),"button_Assign");
    //contructor

    public ManagerCareAtHome(boolean assertOpen) {super(by,name,assertOpen);
    }


    public void clickon_button_manager_CAH(){
        button_managerCAH.waitForClickable();
        waitForLoadingComplete();
        button_managerCAH.click();
        waitForLoadingComplete();
    }

    public void clickon_IDCareAtHome(String ID){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_ID_CAH),"list_IDCareAtHome");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(ID)){
                listOfElements.getElement(i).click();
            }
        }
        waitForJSToComplete();
    }

    public void clickon_actions (String acction) {
        InfoCareAtHome infoCareAtHome = new InfoCareAtHome(false);
        infoCareAtHome.clickon_Acction_Manager(acction);
    }

    public void assign_Doctor(String doctor){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_Doctor),"list_Doctor");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(doctor)){
                listOfElements.getElement(i).click();
            }
        }
        waitForJSToComplete();
        button_Asssign.waitForClickable();
        button_Asssign.click();
        waitForLoadingComplete();
    }

}
