package GlobeDr.Pages.CareAtHome.User;

import Core.Selenium.*;
import GlobeDr.Pages.BaseGlobeDrPage;
import GlobeDr.Pages.Modules.Calendar;
import org.openqa.selenium.By;

public class InfoCareAtHome extends BaseGlobeDrPage {
    public final static By by = By.xpath("//app-user");
    private static final String name = "UpdateInfoCareAtHome";

    //locators
    private final String xpath_button_ConfirmInformation = "//div/span[contains(@class,'ic-checkbox')]";
    private final String xpath_button_Send = "//button[@translate='send']";
    private final String xpath_button_Success = "//div[@class='center-block']/button[contains(@class,'btn-success')]";
    private final String xpath_button_Calendar = "//div[@class='ui-datepicker']/span/span";
    private final String xpath_select_Temperature = "//div[@translate='temperature']/following::select";
    private final String xpath_upload_BloodPerssure = "//p[@translate='uploadBloodPerssure']//following-sibling::button/app-file-upload/input";
    private final String xpath_upload_Systolic = "(//div[@translate='bloodPressure']//following::div[contains(@class,'form-group')]/input)[1]";
    private final String xpath_upload_Diastolic = "(//div[@translate='bloodPressure']//following::div[contains(@class,'form-group')]/input)[2]";
    private final String xpath_upload_ImageSpO2 = "(//div[@translate='bloodOxyLevel']//parent::div//child::input)[1]";
    private final String xpath_upload_SpO2 = "(//div[@translate='bloodPressure']//following::div[contains(@class,'form-group')]/input)[3]";
    private final String xpath_upload_Pulse = "(//div[@translate='bloodPressure']//following::div[contains(@class,'form-group')]/input)[4]";
    private final String xpath_IDCovid = "//div[@translate='id']/following-sibling::div";
    private final String xpath_upload_CurrentBloodImage = "(//button/app-file-upload/input)[1]";
    private final String xpath_upload_CurrentSystolic = "(//div/input)[1]";
    private final String xpath_upload_CurrentDiastolic = "(//div/input)[2]";
    private final String xpath_upload_CurrentSpO2Image = "(//button/app-file-upload/input)[2]";
    private final String xpath_upload_CurrentSpO2 = "(//div/input)[3]";
    private final String xpath_upload_CurrentPulse = "(//div/input)[4]";
    private final String xpath_upload_OtherInformation = "(//div/textarea)[1]";
    private final String xpath_upload_TreatmentInformartionInPast_medication = "(//div/textarea)[2]";
    private final String xpath_upload_TreatmentInformartionInPast_treated = "(//div/textarea)[3]";
    private final String xpath_upload_TreatmentInformation_medication = "(//div/textarea)[4]";
    private final String xpath_upload_TreatmentInformation_treated = "(//div/textarea)[5]";
    private final String xpath_upload_AdditionalInformation_Currentdiseasecondition = "(//div/textarea)[6]";
    private final String xpath_upload_AdditionalInformation_Concernedaboutnow = "(//div/textarea)[7]";
    private final String xpath_upload_AdditionalInformation_Familyhaveasimilardisease = "(//div/textarea)[8]";
    private final String xpath_upload_CurrentlyWorriedAbout = "(//label/preceding-sibling::textarea)[1]";
    private final String xpath_upload_NeedImproved = "(//label/preceding-sibling::textarea)[2]";
    private final String xpath_upload_AnyMoreHelp = "(//label/preceding-sibling::textarea)[3]";
    private final String xpath_button_Complete = "//button[@translate='complete1']";
    private final String xpath_button_DropdownAcction = "//button[contains(@class,'dropdown')]";
    private final String xpath_list_IDCareAtHome = "//div[@id]/div/div/div[contains(@class,'text-gray')]";
    private final String xpath_upload_CurrentStatusInfo = "//label[@translate='currentStatusInfo']/preceding-sibling::textarea";
    private final String xpath_upload_A1C_Glucose_Status = "//div/label[contains(text(),'A1C')]/preceding-sibling::input";
    private final String xpath_upload_mgdL_Glucose_Status = "//div/label[contains(text(),'mg')]/preceding-sibling::input";
    private final String xpath_list_DiseaseType = "//div[@class='row']/div/div/div/p";
    private final String xpath_button_CurrentHealthStatus = "//a[@translate='currentHealthStt']";
    private final String xpath_upload_UpdataCovidTest = "//span[@translate='uploadCovidTest']//following::input";
    private final String xpath_acction = "//ul/li/a[@class='pointer']";



    //elements
    private final Button button_Success = new Button(By.xpath(xpath_button_Success),"btn_Success");
    private final Button button_CurrentHealthStatus = new Button(By.xpath(xpath_button_CurrentHealthStatus),"btn_CurrentHealthStatus");
    private final Button button_Complete = new Button(By.xpath(xpath_button_Complete),"btnComplete");
    private final Textbox textbox_OtherInformation = new Textbox(By.xpath(xpath_upload_OtherInformation),"textbox_OtherInformation");
    private final Textbox textbox_TreatmentInformartionInPast_medication = new Textbox(By.xpath(xpath_upload_TreatmentInformartionInPast_medication),"textbox_TreatmentInformartionInPast_medication");
    private final Textbox textbox_TreatmentInformartionInPast_treated = new Textbox(By.xpath(xpath_upload_TreatmentInformartionInPast_treated),"textbox_TreatmentInformartionInPast_treated");
    private final Textbox textbox_TreatmentInformation_medication = new Textbox(By.xpath(xpath_upload_TreatmentInformation_medication),"textbox_TreatmentInformation_medication");
    private final Textbox textbox_TreatmentInformation_treated = new Textbox(By.xpath(xpath_upload_TreatmentInformation_treated),"textbox_TreatmentInformation_treated");
    private final Textbox textbox_AdditionalInformation_Currentdiseasecondition = new Textbox(By.xpath(xpath_upload_AdditionalInformation_Currentdiseasecondition),"textbox_AdditionalInformation_Currentdiseasecondition");
    private final Textbox textbox_AdditionalInformation_Concernedaboutnow = new Textbox(By.xpath(xpath_upload_AdditionalInformation_Concernedaboutnow),"textbox_AdditionalInformation_Concernedaboutnow");
    private final Textbox textbox_AdditionalInformation_Familyhaveasimilardisease = new Textbox(By.xpath(xpath_upload_AdditionalInformation_Familyhaveasimilardisease),"textbox_AdditionalInformation_Familyhaveasimilardisease");
    private final Textbox textbox_CurrentWorriedAbout = new Textbox(By.xpath(xpath_upload_CurrentlyWorriedAbout),"textbox_CurrentWorriedAbout");
    private final Textbox textbox_NeedImproved = new Textbox(By.xpath(xpath_upload_NeedImproved),"textbox_NeedImproved");
    private final Textbox textbox_AnymoreHelp = new Textbox(By.xpath(xpath_upload_AnyMoreHelp),"textbox_AnymoreHelp");
    private final Textbox textbox_mgdL_Glucose_Status = new Textbox(By.xpath(xpath_upload_mgdL_Glucose_Status),"textbox_mgdL_Glucose_Status");
    private final Textbox textbox_A1C_Glucose_Status = new Textbox(By.xpath(xpath_upload_A1C_Glucose_Status),"textbox_A1C_Glocose_Status");
    private final Button button_DropdownAcction = new Button(By.xpath(xpath_button_DropdownAcction),"btn_DropdownAcction");
    private final Button button_Calendar = new Button(By.xpath(xpath_button_Calendar),"btn_Calendar");
    private final Select select_Temperature = new Select(By.xpath(xpath_select_Temperature),"select_Temperature");
    private final Textbox textbox_Systolic = new Textbox(By.xpath(xpath_upload_Systolic),"textbox_Systolic");
    private final Textbox textbox_Diastolic = new Textbox(By.xpath(xpath_upload_Diastolic),"textbox_Diastolic");
    private final FileUploader fileUploader_ImageSpO2 = new FileUploader(By.xpath(xpath_upload_ImageSpO2),"fileupload_ImageSpO2");
    private final Textbox textbox_SpO2 = new Textbox(By.xpath(xpath_upload_SpO2),"textbox_upload_SpO2");
    private final Textbox textbox_Pulse = new Textbox(By.xpath(xpath_upload_Pulse),"textbox_upload_Pulse");
    private final Button button_ConfirmInformation = new Button(By.xpath(xpath_button_ConfirmInformation),"btn_ConfirmInformation");
    private final Button button_Send = new Button(By.xpath(xpath_button_Send),"btn_Send");
    private final FileUploader fileUploader_ImageBloodPerssure = new FileUploader(By.xpath(xpath_upload_BloodPerssure),"fileupload_BloodPerssure");
    private final Label label_IDCovid = new Label(By.xpath(xpath_IDCovid),"label_IDCovid");
    private final Textbox textbox_CurrentSystolic = new Textbox(By.xpath(xpath_upload_CurrentSystolic),"textbox_CurrentSystolic");
    private final Textbox textbox_CurrentDiastolic = new Textbox(By.xpath(xpath_upload_CurrentDiastolic),"textbox_CurrentDiastolic");
    private final FileUploader fileUploader_CurrentSpO2Image = new FileUploader(By.xpath(xpath_upload_CurrentSpO2Image),"fileupload_CurrentSpO2Image");
    private final FileUploader fileUploader_CovidTest = new FileUploader(By.xpath(xpath_upload_UpdataCovidTest),"fileUploader_CovidTest");
    private final Textbox textbox_CurrentSpO2 = new Textbox(By.xpath(xpath_upload_CurrentSpO2),"textbox_upload_CurrentSpO2");
    private final Textbox textbox_CurrentPulse = new Textbox(By.xpath(xpath_upload_CurrentPulse),"textbox_upload_CurrentPulse");
    private final FileUploader fileUploader_CurrentBloodImage = new FileUploader(By.xpath(xpath_upload_CurrentBloodImage),"fileupload_BloodImage");
    private final Textbox textbox_CurrentStatusInfo = new Textbox(By.xpath(xpath_upload_CurrentStatusInfo),"textbox_CurrentStatusInfo");
    //contructor

    public InfoCareAtHome(boolean assertOpen) {super(by,name,assertOpen);

    }

    //Send
    public void send_TreatmentInformartionInPast_medication(String information){
        textbox_TreatmentInformartionInPast_medication.sendClearText(information);
        waitForJSToComplete();
    }

    public void send_TreatmentInformartionInPast_treated(String information){
        textbox_TreatmentInformartionInPast_treated.sendClearText(information);
        waitForJSToComplete();
    }

    public void send_TreatmentInformation_medication(String information){
        textbox_TreatmentInformation_medication.sendClearText(information);
        waitForJSToComplete();
    }

    public void send_TreatmentInformation_treated(String information){
        textbox_TreatmentInformation_treated.sendClearText(information);
        waitForJSToComplete();
    }

    public void send_AdditionalInformation_Currentdiseasecondition(String information){
        textbox_AdditionalInformation_Currentdiseasecondition.sendClearText(information);
        waitForJSToComplete();
    }

    public void send_AdditionalInformation_Concernedaboutnow(String information){
        textbox_AdditionalInformation_Concernedaboutnow.sendClearText(information);
        waitForJSToComplete();
    }

    public void send_AdditionalInformation_Familyhaveasimilardisease(String information){
        textbox_AdditionalInformation_Familyhaveasimilardisease.sendClearText(information);
        waitForJSToComplete();
    }

    public void send_CurrentlyWorriedAbout(String info){
        textbox_CurrentWorriedAbout.sendClearText(info);
        waitForJSToComplete();
    }

    public void send_NeedImproved(String info){
        textbox_NeedImproved.sendClearText(info);
        waitForJSToComplete();
    }

    public void send_AnymoreHelp(String info){
        textbox_AnymoreHelp.sendClearText(info);
        waitForJSToComplete();
    }

    public void send_Treatmentinformationinthepast(String what_medication, String where_treatment){
        textbox_TreatmentInformartionInPast_medication.sendClearText(what_medication);
        textbox_TreatmentInformartionInPast_treated.sendClearText(where_treatment);
    }

    public void send_Treatmentinformation(String what_medication, String where_treatment){
        textbox_TreatmentInformation_medication.sendClearText(what_medication);
        textbox_TreatmentInformation_treated.sendClearText(where_treatment);
    }

    public void send_Additionalinformation(String current, String concerned, String similar_disease){
        textbox_AdditionalInformation_Currentdiseasecondition.sendClearText(current);
        textbox_AdditionalInformation_Concernedaboutnow.sendText(concerned);
        textbox_AdditionalInformation_Familyhaveasimilardisease.sendText(similar_disease);
    }

    public void send_GlucoseStatus(String A1C, String mgDl){
        textbox_A1C_Glucose_Status.sendText(A1C);
        waitForJSToComplete();
        textbox_mgdL_Glucose_Status.sendText(mgDl);
        waitForJSToComplete();
    }

    public void send_TestDate(String date){
        button_Calendar.waitForClickable();
        button_Calendar.click();
        Calendar calendar = new Calendar(true);
        calendar.selectDate(date);
        waitForJSToComplete();
    }

    public void send_BloodPerssure(String imageBloodPerssure, String systolic, String diastolic) throws InterruptedException {
        upload_ImageBloodPerssure(imageBloodPerssure);
        textbox_Systolic.sendText(systolic);
        waitForJSToComplete();
        textbox_Diastolic.sendText(diastolic);
    }

    public void send_BloodOxygenLevel(String image,String spo2, String pulse) throws InterruptedException {
        Thread.sleep(3000);
        fileUploader_ImageSpO2.upload(System.getProperty("user.dir")+ "/src/main/resources/image/" + image);
        waitForJSToComplete();
        send_SpO2(spo2);
        send_Pulse(pulse);
    }

    public void send_SpO2(String spo2){
        textbox_SpO2.sendText(spo2);
        waitForJSToComplete();
    }

    public void send_Pulse(String pulse){
        textbox_Pulse.sendText(pulse);
        waitForJSToComplete();
    }

    public void send_OtherInformation(String information){
        textbox_OtherInformation.sendClearText(information);
        waitForJSToComplete();
    }

    public void send_CurrentStatusInfo(String status){
        textbox_CurrentStatusInfo.waitForElementToBeDisplay();
        textbox_CurrentStatusInfo.sendClearText(status);
        waitForJSToComplete();
        clickon_Complete_Success();
    }

    public void send_CurrentHealthSituation(String imageBlood,
                                            String systolic,
                                            String diastolic,
                                            String imageSpO2,
                                            String SpO2,
                                            String Pulse){
        fileUploader_CurrentBloodImage.upload(System.getProperty("user.dir")+ "/src/main/resources/image/" + imageBlood);
        waitForJSToComplete();
        textbox_CurrentSystolic.sendClearText(systolic);
        waitForJSToComplete();
        textbox_CurrentDiastolic.sendClearText(diastolic);
        waitForJSToComplete();
        fileUploader_CurrentSpO2Image.upload(System.getProperty("user.dir")+ "/src/main/resources/image/" + imageSpO2);
        waitForJSToComplete();
        textbox_CurrentSpO2.sendClearText(SpO2);
        waitForJSToComplete();
        textbox_CurrentPulse.sendClearText(Pulse);
        waitForJSToComplete();
    }

    //Select

    public void select_Pathological_Attached(String type, String answer){
        String xpath = String.format("//span[contains(text(), '%s')]/following-sibling::div",type);
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath),"listQuestion");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if (listOfElements.getElement(i).getText().equalsIgnoreCase(answer)){
                listOfElements.getElement(i).findElement(By.xpath("./span")).click();
                waitForJSToComplete();
            }
        }
    }

    public void select_Temperature(String temperature){
        select_Temperature.click();
        select_Temperature.selectByVisibleText(temperature);
        waitForJSToComplete();
    }

    public void select_Symptom(String type, String answer){
        String xpath = String.format("//span[contains(text(), '%s')]/following-sibling::div",type);
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath),"listQuestion");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if (listOfElements.getElement(i).getText().equalsIgnoreCase(answer)){
                listOfElements.getElement(i).findElement(By.xpath("./span")).click();
                waitForJSToComplete();
            }
        }
    }

    public void select_DiseaseType(String type){
        UserCareAtHomeInfo userCareAtHomeInfo = new UserCareAtHomeInfo(false);
        userCareAtHomeInfo.clickon_SignUp();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_DiseaseType),"listDiseaseType");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(type)){
                listOfElements.getElement(i).click();
            }
        }
        clickon_Success();
    }



    //Upload
    public void upload_ImageBloodPerssure(String image) throws InterruptedException {
        Thread.sleep(3000);
        fileUploader_ImageBloodPerssure.upload(System.getProperty("user.dir")+ "/src/main/resources/image/"+image);
        waitForJSToComplete();
    }


    //Click

    public void clickon_Success(){
        button_Success.waitForClickable();
        button_Success.click();
        waitForLoadingComplete();
    }
    public void clickon_Complete_Success(){
        button_Complete.waitForClickable();
        button_Complete.click();
        waitForJSToComplete();
        button_Success.waitForClickable();
        button_Success.click();
        waitForLoadingComplete();
    }

    public void clickon_Complete() {
        button_Complete.waitForClickable();
        button_Complete.click();
        waitForJSToComplete();
    }

    public void clickon_CurrentHealthStatus(){
        clickon_DropdownAcction();
        button_CurrentHealthStatus.waitForClickable();
        button_CurrentHealthStatus.click();
        waitForJSToComplete();
    }
    public void clickon_ConfirmInformation(){
        button_ConfirmInformation.waitForClickable();
        button_ConfirmInformation.click();
    }

    public void clickon_Send_Confirm(){
        button_Send.waitForClickable();
        button_Send.click();
        waitForJSToComplete();
        clickon_Success();
    }

    public void clickon_Send(){
        button_Send.waitForClickable();
        button_Send.click();
        waitForJSToComplete();
    }

    public void clickon_IDCareAtHome(String ID){
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_IDCareAtHome),"list_IDCareAtHome");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            if(listOfElements.getElement(i).getText().contains(ID)){
                listOfElements.getElement(i).click();
            }
        }
        waitForJSToComplete();
    }

    public void clickon_UpdataCovidTest(String image) throws InterruptedException {
        Thread.sleep(3000);
        clickon_DropdownAcction();
        fileUploader_CovidTest.upload(System.getProperty("user.dir")+ "/src/main/resources/image/" + image);
        waitForPageLoadComplete();
    }

    public void clickon_DropdownAcction(){
        button_DropdownAcction.waitForClickable();
        button_DropdownAcction.click();
        waitForJSToComplete();
    }

    public void clickon_Acction_Manager(String acction){
        clickon_DropdownAcction();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_acction),"list_acction");
        for (int i = 0; i <listOfElements.getNumberOfElement(); i ++){
            if(listOfElements.getElement(i).getText().contains(acction)){
                listOfElements.getElement(i).click();
            }
        }
        waitForJSToComplete();
    }

    //Get
    public String getID(){
        String ID = label_IDCovid.getText().substring(1);
        System.out.println(ID);
        return ID;
    }

}
