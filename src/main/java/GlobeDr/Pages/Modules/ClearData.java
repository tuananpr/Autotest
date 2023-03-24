package GlobeDr.Pages.Modules;

import Core.Selenium.ListOfElements;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

import java.util.List;

public class ClearData extends BaseGlobeDrPage {
    private static final By by = By.xpath("");
    private static final String name = "Clear Data";
    //locators
    //elements
    //contructors
    public ClearData(boolean assertOpent) {super(by,name,assertOpent);}

    public void clear_Data(String xpath,List<String> data){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath),"xpath");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            listOfElements.scrollToElement(i);
            for (int j=0; j< data.size();j++){
                if(listOfElements.getElement(i).getText().equalsIgnoreCase(data.get(j))){
                    listOfElements.getElement(i).click();
                    waitForJSToComplete();

                }
            }
        }
    }


}
