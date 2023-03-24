package GlobeDr.Pages.RCE;

import Core.Selenium.Button;
import Core.Selenium.FileUploader;
import Core.Selenium.Select;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RCEOrganizationPage extends BaseGlobeDrPage {
    private static final By by = By.xpath("//app-manage-rce");
    private static final String name = "RCE Organization page";

    //locators
    private final String xpath_buttonRCEOrg = "//p[text()='Báo giá đơn thuốc']";
    private final String xpath_textboxSearchByID = "//span[@class='ic-gdr gdr-search']//preceding-sibling::input";
    private final String xpath_buttonSearch = "//span[@class='ic-gdr gdr-search']";
    private final String xpath_buttonReceiveOrder = "//button[@translate='receiveOrder']";
    private final String xpath_buttonChat = "//button[@translate='keepChat']";
    private final String xpath_textboxChat = "//div[@id='inputContent']";
    private final String xpath_buttonChatSend = "//button/i[@class='ic-gdr gdr-compass']";
    private final String xpath_buttonBack = "//button[@translate='back']";
    private final String xpath_buttonPresQuotation = "//button[@translate='presQuotation']";
    private final String xpath_buttonRePresQuotation = "//button[text()='Gởi lại đơn thuốc & báo giá']";
    private final String xpath_fileuploaderPresComposed = "//button[contains(@class, 'btn-file')]/app-file-upload/input";
    private final String xpath_textboxNote = "//label[@class='text-primary']/preceding-sibling::textarea";
    private final String xpath_textboxPresPriceAndPackSize = "//input[@class='form-control ng-untouched ng-pristine ng-invalid']";
    private final String xpath_selectPrescriptionType = "//select[@class='form-control ng-untouched ng-pristine ng-valid']";
    private final String xpath_buttonSendPresQuotation = "//span[@translate='presQuotation']";
    private final String xpath_buttonFindDelivery = "//button[@translate='findDelivery']";
    private final String xpath_buttonCancelFindDelivery = "//button[@class='btn btn-outline-danger btn-rounded btn-animation mb10 ml10 ng-star-inserted']";
    private final String xpath_buttonCancelMedicine = "//button[@translate='cancelMedicine']";
    private final String xpath_buttonOK = "//button[contains(text(),'Đồng ý')]";

    //elements
    private final Button buttonRCEOrgMedical = new Button(By.xpath(xpath_buttonRCEOrg), "Org RCE Medical");
    private final Textbox textboxSearchByID = new Textbox(By.xpath(xpath_textboxSearchByID),"textboxSearchByID");
    private final Button buttonSearch = new Button(By.xpath(xpath_buttonSearch),"btnSearch");
    private final Button buttonReceiveOrder = new Button(By.xpath(xpath_buttonReceiveOrder),"ReceiveOrder");
    private final Button buttonChat = new Button(By.xpath(xpath_buttonChat),"Chat");
    private final Textbox textboxInputContent = new Textbox(By.xpath(xpath_textboxChat),"inputContent");
    private final Button buttonChatSend = new Button(By.xpath(xpath_buttonChatSend),"ChatSend");
    private final Button buttonBack = new Button(By.xpath(xpath_buttonBack),"Back");
    private final Button buttonPresQuotation = new Button(By.xpath(xpath_buttonPresQuotation),"PresQuotation");
    private final Button buttonRePresQuotation = new Button(By.xpath(xpath_buttonRePresQuotation),"RePresQuotation");
    private final FileUploader fileUploaderPresComposed = new FileUploader(By.xpath(xpath_fileuploaderPresComposed),"PresComposed");
    private final Textbox textboxNote = new Textbox(By.xpath(xpath_textboxNote),"textboxNote");
    private final Textbox textboxPresPriceAndPackSize = new Textbox(By.xpath(xpath_textboxPresPriceAndPackSize),"PresPriceAndPackSize");
    private final Select selectPrescriptionType = new Select(By.xpath(xpath_selectPrescriptionType),"selectPrescriptionType");
    private final Button buttonSendPresQuotation = new Button(By.xpath(xpath_buttonSendPresQuotation),"SendPresQuotation");
    private final Button buttonFindDelivery = new Button(By.xpath(xpath_buttonFindDelivery),"FindDelivery");
    private final Button buttonCancelFindDelivery = new Button(By.xpath(xpath_buttonCancelFindDelivery),"CancelFindDelivery");
    private final Button buttonCancelMedicine = new Button(By.xpath(xpath_buttonCancelMedicine),"CancelMedicine");
    private final Button buttonOK = new Button(By.xpath(xpath_buttonOK),"OK");

    //contructor
    public RCEOrganizationPage(boolean assertOpen) {super(by,name,assertOpen);}

    public void clickonRCEOrgMedical(){
        buttonRCEOrgMedical.waitForClickable();
        buttonRCEOrgMedical.click();
    }

    public void sendIDOrderRCE(String ID) throws InterruptedException {
        textboxSearchByID.waitForElementToBeDisplay();
        textboxSearchByID.sendClearText(ID);
        Thread.sleep(1000);
        textboxSearchByID.sendKey(Keys.ENTER);
    }

    public void clickonPresQuotation(){
        waitForPageLoadComplete();
        buttonPresQuotation.waitForClickable();
        buttonPresQuotation.click();
    }

    public void sendPresComposed(String image){
        fileUploaderPresComposed.getWebElement();
        fileUploaderPresComposed.upload(System.getProperty("user.dir")+ "/src/main/resources/image/" + image);

    }

    public void sendNote(String note){
        textboxNote.waitForElementToBeDisplay();
        textboxNote.sendClearText(note);
        waitForJSToComplete();
    }
    public void sendPresPriceAndPackSize(String Price){
        textboxPresPriceAndPackSize.waitForElementToBeDisplay();
        textboxPresPriceAndPackSize.sendClearText(Price);
    }

    public void selectPrescriptionType(String type){
        selectPrescriptionType.waitForElementToBeEnabled();
        selectPrescriptionType.selectByVisibleText(type);
    }

    public void clickonSendPresQuotation(){
        buttonSendPresQuotation.waitForClickable();
        buttonSendPresQuotation.click();
    }

//    public void clickonReceiveOrder() {
//        if (buttonReceiveOrder.isElementPresent()) {
//            buttonReceiveOrder.click();
//            buttonChat.isButtonClickable();
//            buttonChat.click();
//            sendInputContent("Ok chờ tí nha!");
//            buttonChatSend.click();
//            buttonBack.click();
//            buttonPresQuotation.click();
//
//        } else {
//            buttonChat.waitForClickable();
//            buttonChat.click();
//            sendInputContent("Ok chờ tí nha!");
//            buttonChatSend.click();
//            buttonBack.click();
//            buttonRePresQuotation.click();
//        }
//    }

    public void clickonChat(){
        buttonChat.waitForClickable();
        buttonChat.click();
    }

    public void sendInputContent(String content) throws InterruptedException {
        textboxInputContent.waitForElementToBeDisplay();
        textboxInputContent.sendClearText(content);
        waitForJSToComplete();
        clickonChatSend();
        clickonBack();
    }

    public void clickonChatSend() throws InterruptedException {
        buttonChatSend.waitForClickable();
        buttonChatSend.click();
        waitForJSToComplete();
        Thread.sleep(1000);
    }

    public void clickonBack(){
        buttonBack.waitForClickable();
        buttonBack.click();
        waitForLoadingComplete();
    }



    public void clickonRePresQuotation(){
        buttonRePresQuotation.waitForClickable();
        buttonRePresQuotation.click();
    }


    public void clickonFindDelivery() throws InterruptedException {
        buttonFindDelivery.waitForClickable();
        buttonFindDelivery.click();
        waitForJSToComplete();
        waitForLoadingComplete();
    }

    public void clickonCancelFindDelivery(){
        buttonCancelFindDelivery.waitForClickable();
        buttonCancelFindDelivery.click();
        waitForJSToComplete();
    }

    public void clickonCancelMedicine(){
        buttonCancelMedicine.waitForClickable();
        buttonCancelMedicine.click();
    }

    public void clickonOK(){
        buttonOK.waitForClickable();
        buttonOK.click();
    }
}
