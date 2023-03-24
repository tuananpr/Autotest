package GlobeDr.Pages.Appointment;

import Core.Selenium.*;
import Core.Support.Selenium.BrowserManager;
import GlobeDr.Pages.BaseGlobeDrPage;
import GlobeDr.Pages.Modules.Calendar;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class UserAppointment extends BaseGlobeDrPage {
    private final static By by = By.xpath("//app-user");
    private static final String name = "Appointment";

    //locators
    private final String xpath_Appointment = "//a[@href='/appointment']";
    private final String xpath_CreateNewAppointment = "//button[@translate='createNewAppointment']";
    private final String xpath_ShowAccount = "//div[@class='form-control d-flex align-items-center']";
    public final String xpath_SelectAccount = "//div[@class='mr-auto']";
    private final String xpath_InputHospitalClinic = "//div[@class='row no-margin']/div/div/input";
    private final String xpath_SearchHospitalClinic = "//div[@class='row no-margin']/div/div[@class='form-group']/i";
    private final String xpath_ButtonConfirmService = "//div/button[@translate='confirmService']";
    private final String xpath_LabelHospitalClinic = "//label[@translate='selectHospitalClinic']/preceding-sibling::span";
    public final String xpath_ListHospitalClinic = "//div[@class='mr10']";
    private final String xpath_ButtonDone = "//button[@translate='done']";
    private final String xpath_LabelHospitalNearMe = "//a[@translate='nearMe']";
    private final String xpath_InputNameHospitalClinic = "(//div[@class='form-group']/input[contains(@class, 'ng-valid')])[2]";
    private final String xpath_ListHospitalClinicNearMe = "//div[contains(@class, 'card-horizontal')]/div[@class='mr10']/p[@class='fw-bold mb5']";
    private final String xpath_LabelServices = "//label[@translate='selectServices']/preceding-sibling::button";
    private final String xpath_ListServices = "//li[@role='menuitem']";
    private final String xpath_SelectSession = "//select[@class='form-control ng-pristine ng-valid ng-touched']";
    private final String xpath_FirsttimeExamination = "//p[contains(text(),'Khám lần đầu')]";
    private final String xpath_Reexamination = "//p[contains(text(),'Tái khám')]";
    private final String xpath_dateAndSpeciatly = "//label[@translate='dateAndSpecialty']/preceding-sibling::span";
    public final String xpath_Day = "//button[contains(@class,'btn bg-bright-gray img50-50 fs20 ma5 bd-radius-50p')]";
    public final String xpath_Session = "//div[@class='tabs-line']/ul/li";
    public final String xpath_Doctor = "//div[@class='d-table-cell text-middle pl10 pointer']";
    private final String xpath_ButtonSelect = "//button[@translate='select']";
    private final String xpath_SelectSpecialty = "//label[@translate='specialty']/preceding-sibling::select";
    public final String xpath_ExaminationSession = "//label[@translate='examinationSession']/preceding-sibling::select/option";
    private final String xpath_Calender = "//div[@class='ui-datepicker']";
    private final String xpath_ButtonBillingInfoTax = "((//div/div[@class='d-flex justify-content-between align-items-center form-group']/label)[2])";
    private final String xpath_PhoneNumber = "//label[@translate='phoneNumber']/preceding-sibling::input";
    private final String xpath_CompanyName = "//label[@translate='companyName']/preceding-sibling::input";
    private final String xpath_CompanyAddress = "//label[@translate='address']/preceding-sibling::input";
    private final String xpath_CompanyTaxCode = "//label[@translate='taxCode']/preceding-sibling::input";
    private final String xpath_ButtonPayment = "//button[contains(@class,'btn btn-success')]";
    private final String xpath_ButtonConfirmAppointment = "//button[@translate='confirmAppointment']";
    private final String xpath_ButtonContinue = "//button[@translate='continue']";
    private final String xpath_QRCodeHealthInsurance = "//label[@translate='qRCodeHealthInsurance']/preceding-sibling::input";
    private final String xpath_FrontFaceHealthInsurance = "(//button/app-file-upload/input)[1]";
    private final String xpath_BackFaceHealthInsurance = "(//button/app-file-upload/input)[2]";
    private final String xpath_IDcardCitizenIdentification = "//label[@translate='idCardCitizenIdentification']/preceding-sibling::input";
    private final String xpath_FrontFaceIDcardCitizenIdentification = "(//button/app-file-upload/input)[3]";
    private final String xpath_BackFaceIDcardCitizenIdentification = "(//button/app-file-upload/input)[4]";
    private final String xpath_ConfirmPersonalInformation = "//button[@translate='confirmPersonalInformation']";
    private final String xpath_Payment = "//span[contains(text(),'Thanh toán')]";
    private final String xpath_StatusAppointment = "//div[@class='d-flex']";
    private final String xpath_IDcardBank = "//label[contains(text(),'Số thẻ')]/preceding-sibling::input";
    private final String xpath_IDAppointment = "//p[@class='fs18 mb5 text-dark fw-bold']";
    private final String xpath_CardHolderName = "//label[@for='card-holder-name']/preceding-sibling::input";
    private final String xpath_CardDate = "//label[@for='card-date']/preceding-sibling::input";
    private final String xpath_CardCVV = "//label[@for='card-cvv']/preceding-sibling::input";
    private final String xpath_NextPayment = "//button[contains(text(),'Tiếp tục')]";
    private final String xpath_ConfirmPayment = "//button[contains(text(),'Thanh Toán')]";
    private final String xpath_ConfirmPayoo = "//input[@name='btnVerify']";


    //elements
    private final Button buttonAppointment = new Button(By.xpath(xpath_Appointment),"btnAppointment");
    private final Button buttonCreateAppointment = new Button(By.xpath(xpath_CreateNewAppointment),"btnCreateNewAppointment");
    private final Button buttonShowAccount = new Button(By.xpath(xpath_ShowAccount),"btnShowAccount");
    private final Textbox textboxHospitalClinic = new Textbox(By.xpath(xpath_InputHospitalClinic),"textboxHospitalClinic");
    private final Button buttonSearchHospitalClinic = new Button(By.xpath(xpath_SearchHospitalClinic),"btnSearchHospitalClinic");
    private final Button buttonConfirmService = new Button(By.xpath(xpath_ButtonConfirmService),"btnConfirmService");
    private final Button buttonHospitalClinic = new Button(By.xpath(xpath_LabelHospitalClinic),"btnHospitalClinic");

    private final Button buttonDone = new Button(By.xpath(xpath_ButtonDone),"btnDone");
    private final Button buttonLabelHospitalNearMe = new Button(By.xpath(xpath_LabelHospitalNearMe),"btvLabelHospitalNearMe");
    private final Textbox textboxInputNameHospitalClinicNearMe = new Textbox(By.xpath(xpath_InputNameHospitalClinic),"textboxHospitalClinicNearMe");
    private final Select selectHospitalClinicNearMe = new Select(By.xpath(xpath_ListHospitalClinicNearMe),"selectHospitalClinicNearMe");
    private final Button buttonServices = new Button(By.xpath(xpath_LabelServices),"btnServices");
    private final Label labelServices = new Label(By.xpath(xpath_LabelServices),"labelServices");
    private final Select selectServices = new Select(By.xpath(xpath_ListServices),"selectServices");
    private final Label labelFirsttimeExamination = new Label(By.xpath(xpath_FirsttimeExamination),"labelFirsttimeExamination");
    private final Label labelReexamination = new Label(By.xpath(xpath_Reexamination),"labelReexamination");
    private final Button buttondateAndSpecialty = new Button(By.xpath(xpath_dateAndSpeciatly),"btndateAndSpecialty");
    private final Button buttonSelect = new Button(By.xpath(xpath_ButtonSelect),"btnSelect");
    private final Select selectSpecialty = new Select(By.xpath(xpath_SelectSpecialty),"SelectSpecialty");
    private final Button buttonCalender = new Button(By.xpath(xpath_Calender),"btcCalender");
    private final Select selectSession = new Select(By.xpath(xpath_SelectSession),"selectSession");
    private final Button buttonBillingInfoTax = new Button(By.xpath(xpath_ButtonBillingInfoTax),"btnBillingInfoTax");
    private final Textbox textboxPhoneNumber = new Textbox(By.xpath(xpath_PhoneNumber),"textboxPhoneNumber");
    private final Textbox textboxCompanyName = new Textbox(By.xpath(xpath_CompanyName),"textboxCompanyName");
    private final Textbox textboxCompanyAddress = new Textbox(By.xpath(xpath_CompanyAddress),"textboxCompanyAddress");
    private final Textbox textboxCompanyTaxCode = new Textbox(By.xpath(xpath_CompanyTaxCode), "textboxCompanyTaxCode");
    private final Button buttonPaymentAppoitnment = new Button(By.xpath(xpath_ButtonPayment),"btnPayment");
    private final Button buttonConfirmAppointment = new Button(By.xpath(xpath_ButtonConfirmAppointment),"btnConfirmAppoitnment");
    private final Button buttonContinue = new Button(By.xpath(xpath_ButtonContinue),"btcContinue");
    private final Textbox textboxQRCodeHealthInsurance = new Textbox(By.xpath(xpath_QRCodeHealthInsurance),"textboxQRCodeHealthInsurance");
    private final FileUploader fileUploaderFrontFaceHealthInsurance = new FileUploader(By.xpath(xpath_FrontFaceHealthInsurance),"textboxFrontFaceHealthInsurance");
    private final FileUploader fileUploaderBackFaceHealthInsurance = new FileUploader(By.xpath(xpath_BackFaceHealthInsurance),"textboxBackFaceHealthInsurance");
    private final Textbox textboxIDcardCitizenIdentification = new Textbox(By.xpath(xpath_IDcardCitizenIdentification),"textboxIDcardCitizenIdentification");
    private final FileUploader fileUploaderFrontFaceIDcardCitizenIdentification = new FileUploader(By.xpath(xpath_FrontFaceIDcardCitizenIdentification),"textboxFrontFaceIDcardCitizenIdentification");
    private final FileUploader fileUploaderBackFaceIDcardCitizenIdentification = new FileUploader(By.xpath(xpath_BackFaceIDcardCitizenIdentification),"textboxBackFaceIDcardCitizenIdentification");
    private final Button buttonConfirmPersonalInformation = new Button(By.xpath(xpath_ConfirmPersonalInformation),"btnConfrimPersonalInformation");
    private final Label labelIDAppointment = new Label(By.xpath(xpath_IDAppointment),"labelIDAppointment");
    private final Button buttonPayment = new Button(By.xpath(xpath_Payment),"btnPayment");
    private final Textbox textboxIDCardBank = new Textbox(By.xpath(xpath_IDcardBank),"textboxIDCardBank");
    private final Textbox textboxCardHolderName = new Textbox(By.xpath(xpath_CardHolderName),"textboxCardHolderName");
    private final Textbox textboxCardDate = new Textbox(By.xpath(xpath_CardDate),"textboxCardDate");
    private final Textbox textboxCardCVV = new Textbox(By.xpath(xpath_CardCVV),"textboxCardCVV");
    private final Button buttonNextPayment = new Button(By.xpath(xpath_NextPayment),"btnNextPayment");
    private final Button buttonConfirmPayment = new Button(By.xpath(xpath_ConfirmPayment),"btnConfirmPayment");
    private final Button buttonConfirmPayoo = new Button(By.xpath(xpath_ConfirmPayoo),"btnConfirmPayoo");
    //contructor
    public UserAppointment(boolean assertOpen) {super(by,name, assertOpen);
    }
    public void clickonAppointment(){
        buttonAppointment.waitForClickable();
        buttonAppointment.click();
    }

    public void clickonCreateAppointment(){
        buttonCreateAppointment.waitForClickable();
        buttonCreateAppointment.click();
    }

    public void clickonAccount(){
        buttonShowAccount.waitForClickable();
        buttonShowAccount.click();
    }

    public void selectAccount(String Account){
        clickonAccount();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_SelectAccount),"SelectAccount");
        for (int i = 0; i< listOfElements.getNumberOfElement() ; i++){
            if (listOfElements.getElement(i).getText().contains(Account)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
        clickonConfirmService();
    }

    public void clickonConfirmService(){
        buttonConfirmService.waitForClickable();
        buttonConfirmService.click();
        waitForJSToComplete();
    }

    public void clickonHospitalClinic(){
        buttonHospitalClinic.waitForClickable();
        buttonHospitalClinic.click();
        waitForJSToComplete();
    }

    public void sendHospitalClinic(String Hospital){
        textboxHospitalClinic.waitForElementToBeDisplay();
        textboxHospitalClinic.sendClearText(Hospital);
        waitForLoadingComplete();
    }

    public void clickonSearchHospitalClinic(){
        buttonSearchHospitalClinic.waitForClickable();
        buttonSearchHospitalClinic.click();
        waitForJSToComplete();
    }

    public void selectHospitalClinic(String Hopital) throws InterruptedException {
        clickonHospitalClinic();
        sendHospitalClinic(Hopital);
        clickonSearchHospitalClinic();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_ListHospitalClinic), "ListHospital");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if (listOfElements.getElement(i).getText().contains(Hopital)) {
                listOfElements.getElement(i).click();
                waitForJSToComplete();
                clickonDone();
            }
        }
    }

    public void clickonDone (){
        buttonDone.waitForClickable();
        buttonDone.click();
        waitForJSToComplete();
    }

    public void clickonHospitalNearMe(){
        buttonLabelHospitalNearMe.waitForClickable();
        buttonLabelHospitalNearMe.click();
    }

    public void sendHospitalNearMe(String HospitalNearMe){
        textboxInputNameHospitalClinicNearMe.waitForElementToBePresent();
        textboxInputNameHospitalClinicNearMe.sendClearText(HospitalNearMe);
    }

    public void selectHospitalClinicNearMe(String HopitalNearMe){
        selectHospitalClinicNearMe.waitForElementToBeDisplay();
        selectHospitalClinicNearMe.selectByVisibleText(HopitalNearMe);
    }

    public void clickonServices(){
        labelServices.waitForElementToBeDisplay();
        labelServices.click();
    }

    public void selectServices(String Service,String specialty, String day,String date, String session, String doctor) throws InterruptedException {
        clickonServices();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_ListServices),"ListServices");
        for (int i = 0 ; i < listOfElements.getNumberOfElement(); i++){
            if(listOfElements.getElement(i).getText().contains(Service)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }   if(labelServices.getText().equalsIgnoreCase("Khám lần đầu")){
            Firsttimeexamination(day,session,doctor);
            }
                else { Reemamination(specialty, date,session);
                }
    }


    public void Firsttimeexamination(String day, String session, String doctor){
        buttondateAndSpecialty.waitForClickable();
        buttondateAndSpecialty.click();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_Day),"ListDay");
        for(int i = 0; i < listOfElements.getNumberOfElement(); i++){
            if(listOfElements.getElement(i).getText().contains(day)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
        ListOfElements listOfElementsSession = new ListOfElements(By.xpath(xpath_Session),"ListSession");
        for (int i = 0; i < listOfElementsSession.getNumberOfElement(); i++){
            if(listOfElementsSession.getElement(i).getText().contains(session)){
                listOfElementsSession.getElement(i).click();
                waitForJSToComplete();
            }
        }
        ListOfElements listOfElementsDoctor = new ListOfElements(By.xpath(xpath_Doctor),"ListDoctor");
        for(int i = 0; i < listOfElementsDoctor.getNumberOfElement(); i++){
            if(listOfElementsDoctor.getElement(i).getText().contains(doctor)){
                listOfElementsDoctor.getElement(i).click();
                waitForJSToComplete();
            }
        }
        buttonSelect.waitForClickable();
        buttonSelect.click();
    }

    public void Reemamination(String specialty, String date,String session) throws InterruptedException {
        selectSpecialty.waitForElementToBeDisplay();
        selectSpecialty.selectByVisibleText(specialty);
        waitForJSToComplete();
        buttonCalender.waitForClickable();
        buttonCalender.click();
        Calendar calendar = new Calendar(true);
        calendar.selectDate(date);

        ListOfElements listOfElementsSession = new ListOfElements(By.xpath(xpath_ExaminationSession),"ListSession");
        for (int i = 0; i < listOfElementsSession.getNumberOfElement(); i++){
            if(listOfElementsSession.getElement(i).getText().contains(session)){
                listOfElementsSession.getElement(i).click();
                break;
          }
        }
    }

    public void selectSession(String session){
        selectSession.waitForElementToBeDisplay();
        selectSession.selectByVisibleText(session);
        waitForJSToComplete();
    }
    public void clickonBillingInfoTax(){
        buttonBillingInfoTax.waitForClickable();
        buttonBillingInfoTax.click();
        waitForJSToComplete();
    }

    public void sendPhoneNumber(String PhoneNumber) throws InterruptedException {
        sleep(3000);
        textboxPhoneNumber.sendClearText(PhoneNumber);
    }

    public void sendCompanyName(String CompanyName){
        textboxCompanyName.waitForElementToBeDisplay();
        textboxCompanyName.sendClearText(CompanyName);
        waitForJSToComplete();
    }

    public void sendCompanyAddress(String CompanyAddress){
        textboxCompanyAddress.waitForElementToBeDisplay();
        textboxCompanyAddress.sendClearText(CompanyAddress);
        waitForJSToComplete();
    }

    public void sendCompanyTaxCode(String CompanyTaxCode){
        textboxCompanyTaxCode.waitForElementToBeDisplay();
        textboxCompanyTaxCode.sendClearText(CompanyTaxCode);
        waitForJSToComplete();
    }

    public void clickonPaymentAppointment() throws InterruptedException {
        buttonPaymentAppoitnment.waitForClickable();
        buttonPaymentAppoitnment.click();
        waitForJSToComplete();
        if(buttonContinue.isElementDisplay()){
            buttonContinue.click();
            sleep(2000);
            waitForJSToComplete();
        } else {
            sleep(2000);
        }
    }

    public void clickonConfirmAppointment(){
        buttonConfirmAppointment.waitForClickable();
        buttonConfirmAppointment.click();
    }

    public void sendInformation(String QRcodeInsurance, String FrontFaceHealthInsurance, String BackFaceHealthInsurance, String IDCard, String FrontFaceIDcard, String BackFaceIDcard) throws InterruptedException {
        if(buttonContinue.isElementDisplay()){
            buttonContinue.click();
            sleep(2000);
            waitForJSToComplete();
            sendQRCodeHealthInsurance(QRcodeInsurance);
            sendFrontFaceHealthInsurance(FrontFaceHealthInsurance);
            sendBackFaceHealthInsurance(BackFaceHealthInsurance);
            sendIDCardCitizenIdentification(IDCard);
            sendFrontFaceIDCardCitizenIdentification(FrontFaceIDcard);
            sendBackFaceIDCardCitizenIdentification(BackFaceIDcard);
        } else {
            sleep(2000);
            sendQRCodeHealthInsurance(QRcodeInsurance);
            sendFrontFaceHealthInsurance(FrontFaceHealthInsurance);
            sendBackFaceHealthInsurance(BackFaceHealthInsurance);
            sendIDCardCitizenIdentification(IDCard);
            sendFrontFaceIDCardCitizenIdentification(FrontFaceIDcard);
            sendBackFaceIDCardCitizenIdentification(BackFaceIDcard);
        }
    }
    public void sendQRCodeHealthInsurance(String QRcodeInsurance) throws InterruptedException {
        sleep(2000);
        textboxQRCodeHealthInsurance.waitForElementToBeDisplay();
        textboxQRCodeHealthInsurance.sendClearText(QRcodeInsurance);
    }

    public void sendFrontFaceHealthInsurance(String FrontFaceHealthInsurance) throws InterruptedException {
        fileUploaderFrontFaceHealthInsurance.waitForElementToBePresent();
        sleep(1000);
        fileUploaderFrontFaceHealthInsurance.upload(System.getProperty("user.dir") + "/src/main/resources/image/" + FrontFaceHealthInsurance);
    }

    public void sendBackFaceHealthInsurance(String BackFaceHealthInsurance) throws InterruptedException {
        fileUploaderBackFaceHealthInsurance.waitForElementToBePresent();
        sleep(1000);
        fileUploaderBackFaceHealthInsurance.upload(System.getProperty("user.dir") + "/src/main/resources/image/" + BackFaceHealthInsurance);
    }

    public void sendIDCardCitizenIdentification(String IDCard){
        textboxIDcardCitizenIdentification.waitForElementToBeDisplay();
        textboxIDcardCitizenIdentification.sendClearText(IDCard);
    }

    public void sendFrontFaceIDCardCitizenIdentification(String FrontFaceIDcard) throws InterruptedException {
       fileUploaderFrontFaceIDcardCitizenIdentification.waitForElementToBePresent();
       sleep(1000);
       fileUploaderFrontFaceIDcardCitizenIdentification.upload(System.getProperty("user.dir")+"/src/main/resources/image/"+FrontFaceIDcard);
    }

    public void sendBackFaceIDCardCitizenIdentification(String BackFaceIDcard) throws InterruptedException {
        fileUploaderBackFaceIDcardCitizenIdentification.waitForElementToBePresent();
        sleep(1000);
        fileUploaderBackFaceIDcardCitizenIdentification.upload(System.getProperty("user.dir")+"/src/main/resources/image/"+BackFaceIDcard);
    }


    public String getIDAppointment(){
        String ID = labelIDAppointment.getText().substring(13);
        System.out.println(ID);
        return ID;
    }


//    public void clickonPayment(String StatusAppointment) throws InterruptedException {
//        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_StatusAppointment),"IDAppointment");
//        for(int i = 0; i < listOfElements.getNumberOfElement(); i++){
//            if(listOfElements.getElement(i).getText().contains(StatusAppointment)){
//                listOfElements.getElement(i).click();
//                waitForJSToComplete();
//            }
//        }
//        buttonPayment.waitForClickable();
//        buttonPayment.click();
//        Thread.sleep(6000);
//        BrowserManager.getInstance().switchToWindow(1);
//        textboxIDCardBank.sendClearText("4111-1111-1111-1111");
//        textboxCardHolderName.sendClearText("Vũ Trụ");
//        textboxCardDate.sendText("05");
//        Thread.sleep(700);
//        textboxCardDate.sendText("25");
//        textboxCardCVV.sendText("897");
//        buttonNextPayment.click();
//        buttonConfirmPayment.waitForClickable();
//        buttonConfirmPayment.click();
//        waitForJSToComplete();
//        buttonConfirmPayoo.waitForClickable();
//        buttonConfirmPayoo.click();
//        BrowserManager.getInstance().closeWindow();
//    }

    public void clickPayment() throws InterruptedException {
        sleep(6000);
        BrowserManager.getInstance().switchToWindow(1);
        textboxIDCardBank.sendClearText("4111-1111-1111-1111");
        textboxCardHolderName.sendClearText("Vũ Trụ");
        textboxCardDate.sendText("05");
        sleep(700);
        textboxCardDate.sendText("25");
        textboxCardCVV.sendText("897");
        buttonNextPayment.click();
        waitForJSToComplete();
        buttonConfirmPayment.waitForClickable();
        buttonConfirmPayment.click();
        waitForJSToComplete();
        buttonConfirmPayoo.waitForClickable();
        buttonConfirmPayoo.click();
        waitForJSToComplete();
        sleep(3000);
        BrowserManager.getInstance().closeWindow();
    }

}
