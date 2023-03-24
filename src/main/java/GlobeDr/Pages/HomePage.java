package GlobeDr.Pages;

import Core.Selenium.Button;
import org.openqa.selenium.By;

public class HomePage extends BaseGlobeDrPage {
    private static final By by = By.xpath("//app-landing-page");
    private static final String name = "Home page";

    // locators
    private final String xpath_buttonLogin = "//a[@href='/signin']";

    // elements
    private final Button buttonLogin = new Button(By.xpath(xpath_buttonLogin), "Login");

    // constructor
    public HomePage(boolean assertOpen) {
        super(by, name, assertOpen);
    }

    public void clickon_LoginButton() {
        buttonLogin.waitForClickable();
        buttonLogin.click();
    }
}
