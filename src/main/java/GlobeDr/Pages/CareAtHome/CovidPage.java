package GlobeDr.Pages.CareAtHome;

import Core.Selenium.ListOfElements;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CovidPage extends BaseGlobeDrPage {
    public final static By by = By.xpath("//app-user");
    private static final String name = "Covid";


    //locators
    private final String xpath_list_Vaccination = "//div/div/div/div/div[starts-with(@class,'d-flex')]";
    private final String xpath_textbox_Weight = "(//div[contains(@class,'row')]/descendant::label/preceding-sibling::input)[1]";
    private final String xpath_textbox_Height = "(//div[contains(@class,'row')]/descendant::label/preceding-sibling::input)[2]";

    //elements
    private final Textbox textbox_Weight = new Textbox(By.xpath(xpath_textbox_Weight),"textbox_Weight");
    private final Textbox textbox_Height = new Textbox(By.xpath(xpath_textbox_Height),"textbox_Height");


    //contructor

    public CovidPage(boolean assertOpen) {super(by,name,assertOpen);}

    public void select_Vaccination(String vaccination){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_Vaccination),"listVaccination");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(vaccination)){
                WebElement selectVaccine =  listOfElements.getElement(i).findElement(By.xpath( "./span"));
                selectVaccine.click();
            }
        }
    }

    public void send_Weight(String weight){
        textbox_Weight.waitForElementToBeDisplay();
        textbox_Weight.sendClearText(weight);
    }

    public void send_Height(String height){
        textbox_Height.waitForElementToBeDisplay();
        textbox_Height.sendClearText(height);
    }
}
