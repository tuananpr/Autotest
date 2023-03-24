package GlobeDr.Pages.CareAtHome.User;

import Core.Selenium.ListOfElements;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class PostCovidPage extends BaseGlobeDrPage {
    public final static By by = By.xpath("//app-user");
    private static final String name = "PostCovidPage";

    //locators
    //elements
    //contructor
    public PostCovidPage(boolean assertOpen) {super(by,name,assertOpen);}

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
