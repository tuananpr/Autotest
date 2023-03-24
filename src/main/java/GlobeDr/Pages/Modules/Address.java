package GlobeDr.Pages.Modules;

import Core.Selenium.Select;
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
    //elements

    private final Select select_Country = new Select(By.xpath(xpath_Country),"select_Country");
    private final Select select_City = new Select(By.xpath(xpath_City),"select_City");
    private final Select select_District = new Select(By.xpath(xpath_District),"select_District");
    private final Select select_Ward = new Select(By.xpath(xpath_Ward),"select_Ward");
    //contructor
    public Address(boolean assertOpen) {
        super(by,name,assertOpen);
    }

    public void select_Address(String Country, String City, String District, String Ward){
        select_Country.waitForElementToBeDisplay();
        select_Country.selectByContains(Country);
        waitForJSToComplete();
        select_City.waitForElementToBeDisplay();
        select_City.selectByContains(City);
        waitForJSToComplete();
        select_District.waitForElementToBeDisplay();
        select_District.selectByContains(District);
        waitForJSToComplete();
        select_Ward.waitForElementToBeDisplay();
        select_Ward.selectByContains(Ward);
    }
}
