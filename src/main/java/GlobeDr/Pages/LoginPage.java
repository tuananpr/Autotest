package GlobeDr.Pages;

import Core.Selenium.Button;
import Core.Selenium.Textbox;
import org.openqa.selenium.By;

public class LoginPage extends BaseGlobeDrPage {
    private static final By by = By.xpath("//app-sign-in");
    private static final String name = "Login page";

    // locators
    private final String id_textBoxUserName = "UserName";
    private final String id_textBoxPassWord = "Password";
    private final String xpath_buttonSignIn = "//button[@translate='signIn']";
    // elements
    private final Textbox textBoxUsername = new Textbox(By.id(id_textBoxUserName), "Username");
    private final Textbox textBoxPassWord = new Textbox(By.id(id_textBoxPassWord), "PassWord");
    private final Button buttonSignIn = new Button(By.xpath(xpath_buttonSignIn), "SignIn");

    // constructor
    public LoginPage(boolean assertOpen) {
        super(by, name, assertOpen);
    }

    public void login(String username, String password) throws InterruptedException {
        textBoxUsername.waitForElementToBeDisplay();
        textBoxUsername.sendClearText(username);
        textBoxPassWord.sendClearText(password);
        Thread.sleep(2000);
        this.clickOnSignInButton();
    }

    public void clickOnSignInButton() {
        buttonSignIn.waitForClickable();
        buttonSignIn.click();
    }
}
