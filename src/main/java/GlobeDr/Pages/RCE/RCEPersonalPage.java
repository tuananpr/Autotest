package GlobeDr.Pages.RCE;

import Core.Selenium.*;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

import java.util.List;

public class RCEPersonalPage extends BaseGlobeDrPage {
    private static final By by = By.xpath("//app-user");

    private static final String name = "RCE Personal page";

    // locators
    private final String xpath_buttonRCE = "//a[@href='/rce-medicine']";
    private final String xpath_buttonOrderRCE = "//button[@translate='orderMedicine']";
    private final String xpath_fileuploaderMedical = "//input[@id='medicalUpload']";
    private final String xpath_textboxPrescriptionNeedBuy = "//label[@translate='prescriptionNeedBuy']/preceding::textarea";
    private final String xpath_textboxNameRecipient = "//label[@translate='nameRecipient']/preceding-sibling::input";
    private final String xpath_textboxPhoneRecipient = "//label[@translate='phoneRecipient']/preceding-sibling::input";
    private final String xpath_textboxAdress = "//input[@id='myaddress']";
    private final String xpath_buttonGPS = "//div[@class='pac-item']";
    private final String xpath_textboxNotesDelivery = "//label[@translate='notesDelivery']/preceding-sibling::input";
    private final String xpath_buttonSend = "//button[@class='btn btn-success btn-rounded btn-animation d-flex justify-content-center align-items-center center-block']";
    private final String xpath_buttonSelectPharmacy = "//button[@translate='selectPharmacy']";
    private final String xpath_buttonSelect = "//div[@class='ml-auto']/button";
    private final String xpath_buttonConfirm = "//button[@translate='confirm']";
    private final String xpath_buttonOK = "//button[contains(text(),'Đồng ý')]";
    private final String xpath_buttonChat = "//i[@class='ic-gdr gdr-chat-o text-primary fs17 pa8']";
    private final String xpath_textboxChat = "//div[@id='inputContent']";
    private final String xpath_buttonBack = "//button[@translate='back']";
    private final String xpath_selectPaymentMethod = "//div[contains(text(),'Thanh toán khi nhận hàng')]";
    private final String xpath_selectDeliveryMethod = "//div[contains(text(),'Tại địa chỉ người nhận')]";
    private final String xpath_buttonOrder = "//button[@class='btn btn-primary btn-rounded mw100 d-flex justify-content-center align-items-center']";
    private final String xpath_buttonSuccess = "//button[@class='btn btn-success btn-rounded btn-animation']";
    private final String xpath_buttonCancelMedicine = "//button[@translate='cancelMedicine']";
    private final String xpath_IDRCE = "(//div/span[contains(text(),'')])[2]";

    private final String xpath_Status_Order_RCE = "//div/span[@class='text-uppercase']";
    // elements

    private final Button buttonRCE = new Button(By.xpath(xpath_buttonRCE), "RCE Medicine");
    private final Button buttonOrderRCE = new Button(By.xpath(xpath_buttonOrderRCE), "RCE Order");
    private final FileUploader fileUploaderMedical = new FileUploader(By.xpath(xpath_fileuploaderMedical), "Fileuploader Medical");
    private final Textbox textboxPrescriptionNeedBuy = new Textbox(By.xpath(xpath_textboxPrescriptionNeedBuy), "PrescriptionNeedBuy");
    private final Textbox textboxNameRecipient = new Textbox(By.xpath(xpath_textboxNameRecipient), "NameRecipient");
    private final Textbox textboxPhoneRecipient = new Textbox(By.xpath(xpath_textboxPhoneRecipient), "PhoneRecipient");
    private final Textbox textboxAddress = new Textbox(By.xpath(xpath_textboxAdress), "Address");
    private final Button buttonGPS = new Button(By.xpath(xpath_buttonGPS),"GPS");
    private final Textbox textboxNotesDelivery = new Textbox(By.xpath(xpath_textboxNotesDelivery), "NotesDelivery");
    private final Button buttonSend = new Button(By.xpath(xpath_buttonSend), "Send");
    private final Label labelIDRCE = new Label(By.xpath(xpath_IDRCE),"labelIDRCE");
    private final Button buttonSelectPharmacy = new Button(By.xpath(xpath_buttonSelectPharmacy),"btnSelectPharmacy");
    private final Button buttonSelect = new Button(By.xpath(xpath_buttonSelect),"btnSelect");
    private final Button buttonConfirm= new Button(By.xpath(xpath_buttonConfirm),"Confirm");
    private final Button buttonOK = new Button(By.xpath(xpath_buttonOK),"OK");
    private final Button buttonChat = new Button(By.xpath(xpath_buttonChat),"Chat");
    private final Textbox textboxChat = new Textbox(By.xpath(xpath_textboxChat),"TextboxChat");
    private final Button buttonBack = new Button(By.xpath(xpath_buttonBack),"Back");
    private final Button buttonPaymentMethod = new Button(By.xpath(xpath_selectPaymentMethod),"SelectPaymentMethod");
    private final Button buttonDeliveryMethod = new Button(By.xpath(xpath_selectDeliveryMethod),"SelectDeliveryMethod");
    private final Button buttonOrder = new Button(By.xpath(xpath_buttonOrder),"Order");
    private final Button buttonSucess = new Button(By.xpath(xpath_buttonSuccess),"Success");
    private final Button buttonCancelMedicine = new Button(By.xpath(xpath_buttonCancelMedicine),"CancelMedicine");


    // contructor
    public RCEPersonalPage(boolean assertOpen) {
        super(by, name, assertOpen);
    }

    public void clickOnRCEButton() {
        buttonRCE.waitForClickable();
        buttonRCE.click();
        waitForPageLoadComplete();
    }

    public void clickonRCEOrder(){
        buttonOrderRCE.waitForClickable();
        buttonOrderRCE.click();
    }
    public void sendImageOrderMedical(String image) throws InterruptedException {
        Thread.sleep(3000);
        fileUploaderMedical.upload(System.getProperty("user.dir")+ "/src/main/resources/image/" + image);
    }
    public void sendPrecriptionNeedBuy(String PrecriptionNeedBuy){
        textboxPrescriptionNeedBuy.waitForElementToBeDisplay();
        textboxPrescriptionNeedBuy.sendClearText(PrecriptionNeedBuy);
    }
    public void sendNameRecipient(String NameRecipient){
        textboxNameRecipient.waitForElementToBeDisplay();
        textboxNameRecipient.sendClearText(NameRecipient);
    }
    public void sendPhoneRecipient(String PhoneRecipient){
        textboxPhoneRecipient.waitForElementToBeDisplay();
        textboxPhoneRecipient.sendClearText(PhoneRecipient);
    }
    public void sendAddress(String Address) throws InterruptedException {
        textboxAddress.waitForElementToBeDisplay();
        textboxAddress.sendClearText(Address);
        Thread.sleep(1500);
        clickonGPS();
    }
    public void clickonGPS(){
        buttonGPS.waitForClickable();
        buttonGPS.click();
        waitForJSToComplete();
    }
    public void sendNotesDelivery(String NotesDelivery){
        textboxNotesDelivery.waitForElementToBeDisplay();
        textboxNotesDelivery.sendClearText(NotesDelivery);
        waitForJSToComplete();
        clickonSend();
    }
    public void clickonSend(){
        buttonSend.waitForClickable();
        buttonSend.click();
        waitForJSToComplete();
    }

    public String getIDRCE(){
        String ID = labelIDRCE.getText().substring(12);
        System.out.println(ID);
        return ID;
    }

    public void clickonSelectPharmacy() throws InterruptedException {
        buttonSelectPharmacy.waitForClickable();
        buttonSelectPharmacy.click();
        waitForJSToComplete();
        Thread.sleep(1000);
        clickonSelect();
        waitForLoadingComplete();
    }

    public void clickonSelect(){
        buttonSelect.waitForClickable();
        buttonSelect.click();
        waitForJSToComplete();
    }

    public void clickokConfirm(){
        if(buttonConfirm.isElementPresent()){
            buttonConfirm.click();
            buttonOK.click();
            buttonChat.waitForClickable();
            buttonChat.click();
            sendChat("Nhà thuốc giao nhanh giúp đơn thuốc này nha!");
            buttonBack.click();
        } else {
            buttonChat.waitForClickable();
            buttonChat.click();
            sendChat("Nhà thuốc giao nhanh giúp đơn thuốc này nha!");
            buttonBack.click();
        }
//        buttonConfirm.waitForClickable();
//        buttonConfirm.click();
//        sendChat("Nhà thuốc giao nhanh giúp đơn thuốc này nha!");
//        buttonBack.click();
    }
    public void clickonOK(){
        buttonOK.waitForClickable();
        buttonOK.click();
    }
    public void clickokChat(){
        buttonChat.waitForClickable();
        buttonChat.click();
    }
    public void sendChat(String contains){
        textboxChat.waitForElementToBeDisplay();
        textboxChat.sendClearText(contains);
    }
    public void clickonBack(){
        buttonBack.waitForClickable();
        buttonBack.click();
    }
    public void clickonPayment(){
        buttonPaymentMethod.waitForElementToBeDisplay();
        buttonPaymentMethod.click();
        waitForJSToComplete();
    }
    public void clickonDelivery(){
        buttonDeliveryMethod.waitForElementToBeDisplay();
        buttonDeliveryMethod.click();
        waitForJSToComplete();
    }
    public void clickokOrder(){
        buttonOrder.waitForClickable();
        buttonOrder.click();
        waitForJSToComplete();
    }
    public void clickonSuccess(){
        buttonSucess.waitForClickable();
        buttonSucess.click();
    }
    public void clickonCancelMedicine(){
        buttonCancelMedicine.waitForClickable();
        buttonCancelMedicine.click();
        clickonSuccess();
    }

    public void clickon_Cancel_All_Order_RCE(List<String> status){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_Status_Order_RCE),"list_Status_Order_RCE");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            listOfElements.scrollToElement(i);
            for (int j = 0; j < status.size(); j++) {
                if (listOfElements.getElement(i).getText().equalsIgnoreCase(status.get(j))) {
                    listOfElements.getElement(i).click();
                    waitForJSToComplete();
                    System.out.println(listOfElements.getElement(i));
                    clickonCancelMedicine();
                }
            }
        }
    }

    public void clickon_Cancel_Order_RCE(String status){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_Status_Order_RCE),"list_Status_Order_RCE");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            listOfElements.scrollToElement(i);
                if (listOfElements.getElement(i).getText().equalsIgnoreCase(status)) {
                    listOfElements.getElement(i).click();
                    waitForJSToComplete();
                    System.out.println(listOfElements.getElement(i));
                    clickonCancelMedicine();
                }
            }
        }
}
