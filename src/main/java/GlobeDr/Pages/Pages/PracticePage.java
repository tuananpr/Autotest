package GlobeDr.Pages.Pages;

import Core.Selenium.ListOfElements;
import Core.Selenium.Select;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class PracticePage extends BaseGlobeDrPage {
    public final static By by = By.xpath("//app-dashboard");
    public static final String name = "";

    //locators
    private final String xpath_select_role = "//app-change-management[@id='change-management']/div/select";
    private final String xpath_list_feature = "//div/div/a[@href]/div/p";
    //elements

    private final Select select_role = new Select(By.xpath(xpath_select_role),"select_role");
    //contructor
    public PracticePage(boolean assertOpen) {super(by,name,assertOpen);
    }

    public void select_role(String role){
        select_role.click();
        select_role.selectByVisibleText(role);
        waitForLoadingComplete();
    }

    public void select_feature(String feature){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_feature),"list_feature");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(feature)){
                listOfElements.getElement(i).click();
            }
        }
        waitForLoadingComplete();
    }



}
