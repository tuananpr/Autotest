package GlobeDr.Pages.Pages;

import Core.Selenium.Button;
import Core.Selenium.ListOfElements;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

public class ApproverPage extends BaseGlobeDrPage {
    private final static By by = By.xpath("//app-dashboard");
    private static final String name = "ApproverPage";

    //locators
    private final String xpath_Search_name = "//app-menu-coordinator//div[@class='dropdown']//input";
    private final String xpath_list_Dropdown = "//table//div[@class='ic-dropdown']";
    private final String xpath_Close_Question = "//a[@translate='closeQuestion']";
    private final String xpath_list_Consultant = "//tbody/tr";
    private final String xpath_list_Status = "//table//div[contains(@class,'panel-title')]";
    private final String xpath_QuestionNeedPaid = "//span[@translate='questionNeedPaid']";
    private final String xpath_button_OK = "//button[@translate='ok']";
    private final String xpath_list_Name = "//table//span[contains(@class,'text-primary')]";
    private final String xpath_list_Page = "//pagination//li/a";
    //elements
    private final Textbox textbox_Search_name = new Textbox(By.xpath(xpath_Search_name),"textbox_Search_name");
    private final Button button_Close_Question = new Button(By.xpath(xpath_Close_Question),"btn_Close_question");

    private final Button button_Dropdown = new Button(By.xpath(xpath_list_Dropdown),"");
    private final Button button_QuestionNeedPaid = new Button(By.xpath(xpath_QuestionNeedPaid),"btn_QuestionNeedPaid");
    private final Button button_OK = new Button(By.xpath(xpath_button_OK),"btn_OK");
    private final ListOfElements listOfElements_Name = new ListOfElements(By.xpath(xpath_list_Name),"list_Name");
    private final ListOfElements listOfElements_Consultant = new ListOfElements(By.xpath(xpath_list_Consultant),"list_Consultant");
    private final ListOfElements listOfElements_Status = new ListOfElements(By.xpath(xpath_list_Status),"list_Status");
    private final ListOfElements listOfElements_Dropdown = new ListOfElements(By.xpath(xpath_list_Dropdown),"list_Dropdown");
    private final ListOfElements listOfElements_Page = new ListOfElements(By.xpath(xpath_list_Page),"list_Page");
    //contructor
    public ApproverPage(boolean assertOpen) {super(by,name,assertOpen);}

    public void send_Name(String name){
        textbox_Search_name.sendText(name);
        textbox_Search_name.sendKey(Keys.ENTER);
        waitForLoadingComplete();
    }

    public void clickon_Close_question(){
        button_Close_Question.waitForClickable();
        button_Close_Question.click();
        waitForJSToComplete();
        clickon_QuestionNeedPaid();
    }

    public void clickon_QuestionNeedPaid(){
        button_QuestionNeedPaid.waitForClickable();
        button_QuestionNeedPaid.click();
        waitForJSToComplete();
        button_OK.waitForClickable();
        button_OK.click();
        waitForLoadingComplete();
    }
    public void clear_Data(List<String> data, String name) {
        for (int k = 1; k < listOfElements_Page.getNumberOfElement(); k++) {
            listOfElements_Page.getElement(k).click();
            waitForLoadingComplete();
            for (int i = 0; i < listOfElements_Status.getNumberOfElement(); i++) {
                for (int j = 0; j < data.size(); j++) {
                    if ((listOfElements_Status.getElement(i).getText().equalsIgnoreCase(data.get(j))) && (listOfElements_Name.getElement(j).getText().contains(name))) {
                        listOfElements_Status.scrollToTopOfPage();
                        listOfElements_Dropdown.getElement(i).click();
                        clickon_Close_question();
                        waitForLoadingComplete();
                    }
                }
            }
        }
    }
}
