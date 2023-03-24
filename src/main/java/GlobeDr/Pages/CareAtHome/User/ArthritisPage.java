package GlobeDr.Pages.CareAtHome.User;

import Core.Selenium.Button;
import Core.Selenium.FileUploader;
import Core.Selenium.Textbox;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class ArthritisPage extends BaseGlobeDrPage {
    public final static By by = By.xpath("//app-user");
    private static final String name = "ArthritisPage";

    //locators
    private final String xpath_upload_Jointpain = "(//div/label/preceding-sibling::textarea[contains(@class,'')])[1]";
    private final String xpath_choose_Stiffjoints = "(//div[@class='d-flex align-items-center']/span)[1]";
    private final String xpath_choose_Heavilyeveryday = "(//div[@class='d-flex align-items-center']/span)[2]";
    private final String xpath_upload_XRay = "//span[@translate='uploadImage']/following-sibling::input";
    private final String xpath_upload_XRayFilmDiagnosis = "(//div/label/preceding-sibling::textarea)[2]";
    //elements
    private final Button button_Heavilyeveryday = new Button(By.xpath(xpath_choose_Heavilyeveryday),"btn_Heavilyeveryday");
    private final Button button_Stiffjoints = new Button(By.xpath(xpath_choose_Stiffjoints),"btn_Stiffjoints");
    private final Textbox textbox_Jointpain = new Textbox(By.xpath(xpath_upload_Jointpain),"textbox_Jointpain");
    private final FileUploader fileUploader_XRay = new FileUploader(By.xpath(xpath_upload_XRay),"fileupload_XRay");
    private final Textbox textbox_XRayFilmDiagnosis = new Textbox(By.xpath(xpath_upload_XRayFilmDiagnosis),"textbox_XRayFilmDiagnosis");
    //contructor
    public ArthritisPage(boolean assertOpen) {super(by,name,assertOpen);}

    public void send_Jointpain_Stiffjoints_Heavilyeveryday(String Joint_pain, String Stiff_joints, String Heavily_everyday ){
        textbox_Jointpain.sendText(Joint_pain);
        waitForJSToComplete();
        if(Stiff_joints == "Yes"){
            button_Stiffjoints.click();
            waitForJSToComplete();
        }

        if (Heavily_everyday == "Yes"){
            button_Heavilyeveryday.click();
            waitForJSToComplete();
        }
    }

    public void send_XRayResults_XRayDiagnosis(String imageXRay,String Diagnosis){
        fileUploader_XRay.upload(System.getProperty("user.dir")+ "/src/main/resources/image/" + imageXRay);
        waitForJSToComplete();
        textbox_XRayFilmDiagnosis.sendText(Diagnosis);
        waitForJSToComplete();
    }
}
