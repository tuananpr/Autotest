package GlobeDr.Pages;

import Core.Support.General.Hooks;
import org.testng.annotations.DataProvider;

public class DataProviderFactory extends Hooks {
    @DataProvider(name = "data_provider_01", parallel = true)
    public Object[][] dataHRM(){
        return new Object[][] {{"0963259524"},{"123456"}};
    }
}
