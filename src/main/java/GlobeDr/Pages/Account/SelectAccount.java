package GlobeDr.Pages.Account;

import Core.Selenium.Button;
import Core.Selenium.ListOfElements;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class SelectAccount extends BaseGlobeDrPage {
    private static final By by = By.xpath("");
    private final static String name = "SelectAccount";

    //locators
    public final String xpath_SelectAccount = "//div[@class='mr-auto']";
    private final String xpath_ButtonConfirmService = "//div/button[@translate='confirmService']";
    //elements
    private final Button buttonConfirmService = new Button(By.xpath(xpath_ButtonConfirmService),"btnConfirmService");
    //contructor
    public SelectAccount(boolean assertOpen) {super(by,name,assertOpen);}

    public void clickonConfirmService(){
        buttonConfirmService.waitForClickable();
        buttonConfirmService.click();
        waitForJSToComplete();
    }
    public void selectAccount(String Account){
        waitForLoadingComplete();
//        clickonAccount();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_SelectAccount),"SelectAccount");
        for (int i = 0; i< listOfElements.getNumberOfElement() ; i++){
            if (listOfElements.getElement(i).getText().contains(Account)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
        clickonConfirmService();
    }
}
