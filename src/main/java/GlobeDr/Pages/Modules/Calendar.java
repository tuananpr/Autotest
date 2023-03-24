package GlobeDr.Pages.Modules;

import Core.Selenium.Button;
import Core.Selenium.Label;
import Core.Selenium.ListOfElements;
import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;

public class Calendar extends BaseGlobeDrPage {
    private static final By by = new By.ByXPath("//owl-date-time-container");
    private static final String name = "Calendar module";

    //locators
    private final String xpath_buttonChooseMonthAndYear = "//button[@aria-label='Choose month and year']";
    private final String xpath_labelSelectedYear = "//div/button[@aria-label='Change to month view']/span[contains(@class,'button-content')]";
    private final String xpath_listYear = "//table[@class='owl-dt-calendar-table owl-dt-calendar-multi-year-table']/tbody/tr/td";
    private final String xpath_buttonPrevious = "//button[@aria-label='Previous 21 years']";
    private final String xpath_buttonNext = "//button[@aria-label='Next 21 years']";
    private final String xpath_buttonChoose = "//button[contains(@class, 'owl-dt-control')]/span[contains(text(), 'Chọn')]";
    private final String xpath_buttonDayofBirth = "//div[@class='ui-datepicker']/input[@placeholder]";
    private final String xpath_listMonth = "//table[@class='owl-dt-calendar-table owl-dt-calendar-year-table']/tbody/tr[@class='ng-star-inserted']/td";
    private final String xpath_listDay = "//table[@class='owl-dt-calendar-table owl-dt-calendar-month-table']/tbody/tr/td";

    //elements
    private final Button buttonChooseMonthAndYear = new Button(By.xpath(xpath_buttonChooseMonthAndYear), "Choosemonthandyear");
    private final Label labelSelectedYear = new Label(By.xpath(xpath_labelSelectedYear),"TitleSelectedYear");
    private final ListOfElements listYear = new ListOfElements(By.xpath(xpath_listYear), "ListYear");
    private final Button buttonPrevious = new Button(By.xpath(xpath_buttonPrevious),"ButtonPrevious");
    private final Button buttonNext = new Button(By.xpath(xpath_buttonNext),"ButtonNext");
    private final Button buttonChosse = new Button(By.xpath(xpath_buttonChoose),"Button Choose");
    private final Button buttonDayofBirth = new Button(By.xpath(xpath_buttonDayofBirth),"ButtonDayofBirth");
    private final ListOfElements listMonth = new ListOfElements(By.xpath(xpath_listMonth),"ListMonth");
    private final ListOfElements listDay = new ListOfElements(By.xpath(xpath_listDay),"ListDay");

    public Calendar(boolean assertOpen) {
        super(by, name, assertOpen);
    }

    public void selectDate(String Date){
        String[] parts = Date.split("/");

        String year = parts[2];
        String month = parts[1];
        String day = parts[0];

        buttonChooseMonthAndYear.waitForClickable();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        buttonChooseMonthAndYear.click();
        waitForJSToComplete();

        selectYear(year);
        selectMonth(month);
        selectDay(day);
        buttonChosse.waitForClickable();
        buttonChosse.click();
        buttonDayofBirth.getText().equalsIgnoreCase(Date);
        waitForJSToComplete();
    }

    public void selectYear(String year) {
        String yearPrecentText;
        do {
            yearPrecentText = labelSelectedYear.getText();
            int firstYearList = Integer.parseInt(listYear.getListOfElement().get(0).getText());
            int lastYearList = Integer.parseInt(listYear.getListOfElement().get((listYear.getNumberOfElement()) - 1).getText());
            if (Integer.parseInt(year) < firstYearList) {
                buttonPrevious.waitForClickable();
                buttonPrevious.click();
            } else if (Integer.parseInt(year) > lastYearList) {
                buttonNext.waitForClickable();
                buttonNext.click();
            } else {
                for (int i = 0; i < listYear.getNumberOfElement(); i++) {
                    if (listYear.getListOfElement().get(i).getText().equalsIgnoreCase(year)){
                        listYear.getListOfElement().get(i).click();
                        waitForJSToComplete();
                        yearPrecentText = labelSelectedYear.getText();
                        break;
                    }
                }
            }
        } while (!(String.valueOf(Integer.parseInt(year)).equalsIgnoreCase(yearPrecentText)));
    }

    private void selectMonth(String month){
        int labelMonthNumber = Integer.parseInt(String.valueOf(month));
        switch (month){
            case "01":
                listMonth.getListOfElement().get(0).click(); break;
            case "02":
                listMonth.getListOfElement().get(1).click(); break;
            case "03":
                listMonth.getListOfElement().get(2).click(); break;
            case "04":
                listMonth.getListOfElement().get(3).click(); break;
            case "05":
                listMonth.getListOfElement().get(4).click(); break;
            case "06":
                listMonth.getListOfElement().get(5).click(); break;
            case "07":
                listMonth.getListOfElement().get(6).click(); break;
            case "08":
                listMonth.getListOfElement().get(7).click(); break;
            case "09":
                listMonth.getListOfElement().get(8).click(); break;
            case "10":
                listMonth.getListOfElement().get(9).click(); break;
            case "11":
                listMonth.getListOfElement().get(10).click(); break;
            case "12":
                listMonth.getListOfElement().get(11).click(); break;
        }

        for (int i = 0; i < listMonth.getListOfElement().size(); i++) {
            if (listMonth.getListOfElement().get(i).getText().equalsIgnoreCase(String.valueOf((labelMonthNumber)))) {
                listMonth.getListOfElement().get(i).click();
                break;
            }
        }
    }

    private void selectDay(String day) {
        int labelDayNumber = Integer.parseInt(String.valueOf(day));
        for (int i = 0; i < listDay.getListOfElement().size(); i++) {
            if (listDay.getListOfElement().get(i).getText().equalsIgnoreCase(String.valueOf(labelDayNumber))) {
                listDay.getListOfElement().get(i).click();
            }
        }
    }

}
