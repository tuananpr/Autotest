package GlobeDr.Pages.MedicalTest;

import Core.Selenium.Button;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class UserMedicalTest extends BaseGlobeDrPage {
    private final static By by = By.xpath("");
    private static final String name = "UserMedicalTest";
    //locators
    private final String xpath_MedicalTest = "//app-home-user//a[@href='/medical-test']//img";
    private final String xpath_OrderMedicalTest = "//app-menu-user//button[@translate='orderMedicalTest']";
    //elements
    private final Button buttonMedicalTest = new Button(By.xpath(xpath_MedicalTest),"btnMedicalTest");
    private final Button buttonOrderMedicalTest = new Button(By.xpath(xpath_OrderMedicalTest),"btnOrderMedicalTest");
    //contructor
    public UserMedicalTest(Boolean assertOpen) {super(by,name,assertOpen);}

    public void clickonMedicalTest(){
        buttonMedicalTest.waitForClickable();
        buttonMedicalTest.click();
    }

    public void clickonOrderMedicalTest(){
        buttonOrderMedicalTest.waitForClickable();
        buttonOrderMedicalTest.click();
    }
}
