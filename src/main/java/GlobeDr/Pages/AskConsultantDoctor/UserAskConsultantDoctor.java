package GlobeDr.Pages.AskConsultantDoctor;

import Core.Selenium.*;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class UserAskConsultantDoctor extends BaseGlobeDrPage {
    private final static By by = By.xpath("//app-user");
    private static final String name = "Ask Consultant Doctor";

    //locators
    public final String xpath_btn_AskConsultantDoctor = "//a[@href='/askdoctor']/div/img";
    public final String xpath_btn_CreateNewQuestion = "//button[@translate='createNewQuestion']";
    public final String xpath_btn_ConfirmCreateNewQuestion = "//div[@class='center-block']/button[contains(@class,'btn-success')]";
    public final String xpath_list_User = "//ul[contains(@class,'dropdown-menu')]//p[contains(@class,'fw-bold')]";
    public final String xpath_btn_ConfirmInformation = "//app-confirm-patient-info-modal//button[@translate='confirmService']";
    public final String xpath_textbox_Height = "//label[@translate='height']/preceding-sibling::input";
    public final String xpath_textbox_Weight = "//label[@translate='weight']/preceding-sibling::input";
    public final String xpath_textbox_Temperature = "//label[@translate='temperature']/preceding-sibling::input";
    public final String xpath_textbox_YourQuestion = "//div[@class='form-group form-group-default']/textarea";
    public final String xpath_btn_ChooseDisease = "//div//label[@translate='chooseDisease']/preceding-sibling::div";
    public final String xpath_list_Disease = "//div[@class='slimScrollDiv']//p[@class='text-nowrap fw-bold']";
    public final String xpath_list_Disease1 = "//div[@class='slimScrollDiv']//li";
    public final String xpath_fileuploader_ImageCreateNewQuestion = "(//div/button/app-file-upload/input)[1]";
    public final String xpath_btn_Create = "//button[@translate='create']";
    public final String xpath_ID_Consultant = "//span[@class='float-right fw-bold text-dark fs22 pt9 pb9 ng-star-inserted']";
    //elements
    private final Button button_Appointment = new Button(By.xpath(xpath_btn_AskConsultantDoctor),"btnAppointment");
    private final Button button_CreateNewQuestion = new Button(By.xpath(xpath_btn_CreateNewQuestion),"btnCreateNewQuestion");
    private final Button button_ConfirmCreateNewQuestion = new Button(By.xpath(xpath_btn_ConfirmCreateNewQuestion),"btnConfirmCreateNewQuestion");
    private final Button button_ConfirmInformattion = new Button(By.xpath(xpath_btn_ConfirmInformation),"btn_ConfirmInformation");
    private final Textbox textbox_Height = new Textbox(By.xpath(xpath_textbox_Height),"textboxHeight");
    private final Textbox textbox_Weight = new Textbox(By.xpath(xpath_textbox_Weight),"textboxWeight");
    private final Textbox textbox_Temperature = new Textbox(By.xpath(xpath_textbox_Temperature),"textboxTemperature");
    private final Textbox textbox_YourQuestion = new Textbox(By.xpath(xpath_textbox_YourQuestion),"textboxYourQuestion");
    private final Button button_ChooseDisease = new Button(By.xpath(xpath_btn_ChooseDisease),"btn_ChooseDisease");
    private final FileUploader fileUploader_ImageQuestion = new FileUploader(By.xpath(xpath_fileuploader_ImageCreateNewQuestion),"fileuploaderImageCreateQuestion");
    private final Button button_Create = new Button(By.xpath(xpath_btn_Create),"btnCreate");
    private final Label label_IDConsultant = new Label(By.xpath(xpath_ID_Consultant),"labelIDConsultant");

    //contructor
    public UserAskConsultantDoctor(boolean assertOpen) {
        super(by ,name,assertOpen);
    }

    public void clickon_Appointment(){
        button_Appointment.waitForClickable();
        button_Appointment.click();
    }
    public void clickon_CreateNewQuestion(){
        button_CreateNewQuestion.waitForClickable();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        button_CreateNewQuestion.click();

        clickon_ConfirmNCreateNewQuestion();
    }

    public void clickon_ConfirmNCreateNewQuestion(){
        button_ConfirmCreateNewQuestion.waitForClickable();
        button_ConfirmCreateNewQuestion.click();
        waitForLoadingComplete();
    }

    public void select_User(String user){
//        label_ShowAccount.waitForElementToBeDisplay();
//        label_ShowAccount.click();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_User),"listUser");
        for( int i = 0; i < listOfElements.getNumberOfElement(); i++){
            if(listOfElements.getElement(i).getText().contains(user)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
        button_ConfirmInformattion.waitForClickable();
        button_ConfirmInformattion.click();
    }

    public void send_Height(String Height){
        textbox_Height.sendClearText(Height);
    }

    public void send_Weight(String Weight){
        textbox_Weight.sendClearText(Weight);
    }

    public void send_Temperature(String Temperature){
        textbox_Temperature.sendClearText(Temperature);
        waitForJSToComplete();
    }

    public void send_Question(String Question) throws InterruptedException {
        Thread.sleep(3000);
        textbox_YourQuestion.sendClearText(Question);
        waitForJSToComplete();
    }

    public void clickon_ChooseDisease(String Disease){
        button_ChooseDisease.waitForClickable();
        button_ChooseDisease.click();
        waitForJSToComplete();
        ListOfElements listOfElements = new ListOfElements(By.xpath(xpath_list_Disease),"list_Disease");
        for (int i = 0; i < listOfElements.getNumberOfElement(); i++) {
            listOfElements.scrollToElement(i);
            if(listOfElements.getElement(i).getText().contains(Disease)){
                listOfElements.getElement(i).click();
                waitForJSToComplete();
            }
        }
    }

    public void send_ImageQuestion(String Image) throws InterruptedException {
        Thread.sleep(1000);
        fileUploader_ImageQuestion.upload(System.getProperty("user.dir") + "/src/main/resources/image/" + Image);
        waitForJSToComplete();
    }

    public void clickon_Create(){
        button_Create.waitForClickable();
        button_Create.click();
        waitForJSToComplete();
        waitForLoadingComplete();
    }

    public String get_IDConsultant(){
        String ID = label_IDConsultant.getText().substring(1);
        System.out.println(ID);
        return ID;
    }

}
