package GlobeDr.Pages.Modules;

import Core.Selenium.Label;
import Core.Selenium.Select;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class Address extends BaseGlobeDrPage {
    private final static By by = new By.ByXPath("");
    private final static String name = "Address";

    //locators

    private final String xpath_Country = "//label[@translate='country']/preceding-sibling::select";
    private final String xpath_City = "//label[@translate='city']/preceding-sibling::select";
    private final String xpath_District = "//label[@translate='district']/preceding-sibling::select";
    private final String xpath_Ward = "//label[@translate='ward']/preceding-sibling::select";
    private final String xpath_textbox_Address = "//app-user//input[@id='address']";
    private final String xpath_button_ConfirmAddress = "//div[@class='pac-container pac-logo']";
    //elements

    private final Select select_Country = new Select(By.xpath(xpath_Country),"select_Country");
    private final Select select_City = new Select(By.xpath(xpath_City),"select_City");
    private final Select select_District = new Select(By.xpath(xpath_District),"select_District");
    private final Select select_Ward = new Select(By.xpath(xpath_Ward),"select_Ward");
    private final Textbox textbox_Address = new Textbox(By.xpath(xpath_textbox_Address),"textboxAddress");
    private final Label label_ConfirmAddress = new Label(By.xpath(xpath_button_ConfirmAddress),"labelAddress");
    //contructor
    public Address(boolean assertOpen) {
        super(by,name,assertOpen);
    }

    public void select_Address(String Country, String City, String District, String Ward){
        select_Country.waitForElementToBeEnabled();
        select_Country.click();
        select_Country.selectByVisibleText(Country);
        waitForJSToComplete();
        select_City.waitForElementToBeEnabled();
        select_City.click();
        select_City.selectByVisibleText(City);
        waitForJSToComplete();
        select_District.waitForElementToBeEnabled();
        select_District.click();
        select_District.selectByVisibleText(District);
        waitForJSToComplete();
        select_Ward.waitForElementToBeEnabled();
        select_Ward.click();
        select_Ward.selectByVisibleText(Ward);
    }

    public void send_Address(String Address){
        textbox_Address.waitForElementToBeDisplay();
        textbox_Address.sendClearText(Address);
        waitForJSToComplete();
    }
}
