package GlobeDr.Pages.Account;

import org.testng.annotations.DataProvider;

public class DataProviderFactory {
    @DataProvider(name = "user_MainAccountUpdateInfo", parallel = false)
    public Object[][] data(){
        return new Object[][]{{
                "0963259524",
                "123456",
                "Nam",
                "Ngô"

        }};
    }
    @DataProvider(name = "userMedicalTest", parallel = false)
    public Object[][] dataHRM() {
        return new Object[][]{{
            "0963259524",
            "123456",
            "Xét nghiệm",
            "Tuan24",
            "Diag",
            "Tại phòng xét nghiệm",
            "10/07/2023",
            "Amylase"
        }};
    }

    @DataProvider(name = "orgDiagMedicalTest", parallel = false)
    public Object[][] dataLogin() {
        return new Object[][]{{
                "0963259521",
                "123456"}};
    }

}
