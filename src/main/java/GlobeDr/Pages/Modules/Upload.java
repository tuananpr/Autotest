package GlobeDr.Pages.Modules;

import Core.Selenium.Button;
import Core.Selenium.FileUploader;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class Upload extends BaseGlobeDrPage {
    private static final  By by = new By.ByXPath("");
    private static final  String name = "Upload";

    //locators
    private final String xpath_fileuploader_AvatarImage = "uploadImage";
    private final String xpath_button_AvatarImage_Success = "//app-crop-image//button[contains(@class,'btn-success')]";
    //elements
    private final FileUploader fileUploader_AvatarImage = new FileUploader(By.id(xpath_fileuploader_AvatarImage),"fileuploader_Avatar_Image");
    private final Button button_AvatarImageSuccess = new Button(By.xpath(xpath_button_AvatarImage_Success),"btn_AvatarImage_Success");
    //contructor
    public Upload(boolean assertOpen) {super(by,name,assertOpen);}

    public void upload_Avatar_Image(String image) throws InterruptedException {
        Thread.sleep(3000);
        fileUploader_AvatarImage.upload(System.getProperty("user.dir")+ "/src/main/resources/image/" + image);
        button_AvatarImageSuccess.waitForClickable();
        button_AvatarImageSuccess.click();
    }
}
