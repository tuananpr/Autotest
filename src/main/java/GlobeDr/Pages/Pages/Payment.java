package GlobeDr.Pages.Pages;

import Core.Selenium.Button;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class Payment extends BaseGlobeDrPage {
    private final static  By by = By.xpath("");
    private static final String name = "Payment";
    //locators
    private final String xpath_Payment = "//span[contains(text(),'Thanh toán')]";
    private final String xpath_StatusAppointment = "//div[@class='d-flex']";
    private final String xpath_IDcardBank = "//label[contains(text(),'Số thẻ')]/preceding-sibling::input";
    private final String xpath_CardHolderName = "//label[@for='card-holder-name']/preceding-sibling::input";
    private final String xpath_CardDate = "//label[@for='card-date']/preceding-sibling::input";
    private final String xpath_CardCVV = "//label[@for='card-cvv']/preceding-sibling::input";
    private final String xpath_NextPayment = "//button[contains(text(),'Tiếp tục')]";
    private final String xpath_ConfirmPayment = "//button[contains(text(),'Thanh Toán')]";
    private final String xpath_ConfirmPayoo = "//input[@name='btnVerify']";
    private final String xpath_CheckCVV = "//table//td/input[@value='Check CVV']";
    private final String xpath_VerifyOTP = "//table//td/input[@value='Verify OTP']";
    private final String xpath_ReturnShopback = "//a[@id='btn_return_shopback']";

    //elements
    private final Button buttonPayment = new Button(By.xpath(xpath_Payment),"btnPayment");
    private final Textbox textboxIDCardBank = new Textbox(By.xpath(xpath_IDcardBank),"textboxIDCardBank");
    private final Textbox textboxCardHolderName = new Textbox(By.xpath(xpath_CardHolderName),"textboxCardHolderName");
    private final Textbox textboxCardDate = new Textbox(By.xpath(xpath_CardDate),"textboxCardDate");
    private final Textbox textboxCardCVV = new Textbox(By.xpath(xpath_CardCVV),"textboxCardCVV");
    private final Button buttonNextPayment = new Button(By.xpath(xpath_NextPayment),"btnNextPayment");
    private final Button buttonConfirmPayment = new Button(By.xpath(xpath_ConfirmPayment),"btnConfirmPayment");
    private final Button buttonConfirmPayoo = new Button(By.xpath(xpath_ConfirmPayoo),"btnConfirmPayoo");
    private final Button buttonCheckCVV = new Button(By.xpath(xpath_CheckCVV),"btnCheckCVV");
    private final Button buttonVerifyOPT = new Button(By.xpath(xpath_VerifyOTP),"btnCheckVerifyOTP");
    private final Button buttonReturnShopBack = new Button(By.xpath(xpath_ReturnShopback),"btnReturnShopBack");

    //contructor
    public Payment(Boolean assertOpen) {super(by,name,assertOpen);}

    public void sendPayment(String IDCardBank,String CardHolderName,String CardMonth,String CardYear, String CardCVV) throws InterruptedException {
        waitForLoadingComplete();
//        BrowserManager.getInstance().switchToWindow(0);
        textboxIDCardBank.sendClearText(IDCardBank);
        textboxCardHolderName.sendClearText(CardHolderName);
        textboxCardDate.sendText(CardMonth);
        waitForJSToComplete();
        textboxCardDate.sendText(CardYear);
        textboxCardCVV.sendText(CardCVV);
        buttonNextPayment.click();
        waitForLoadingComplete();
        buttonConfirmPayment.waitForClickable();
        buttonConfirmPayment.click();
        waitForLoadingComplete();
        buttonCheckCVV.waitForClickable();
        buttonCheckCVV.click();
        waitForJSToComplete();
        buttonVerifyOPT.waitForClickable();
        buttonVerifyOPT.click();
        waitForJSToComplete();
        buttonReturnShopBack.waitForClickable();
        buttonReturnShopBack.click();
        waitForJSToComplete();
        sleep(3000);
//        BrowserManager.getInstance().closeWindow();
    }
}
