package PageObject.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TimetablePage extends GeneralPage {

    //Locators

    //Elements

    //Methods
    public TimetablePage gotoCheckPriceLink(String departstation, String arrivestation)
    {
        Constant.WEBDRIVER.findElement(By.xpath("//tr/td[2][contains(text(),'"+departstation+"')]/following-sibling::td[contains(text(),'"+arrivestation+"')]/ancestor::tr/td[6]")).click();
        return new TimetablePage();
    }
}
