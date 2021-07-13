package PageObject.Railway;

import Common.Common.Utilities;
import org.openqa.selenium.By;

public class TimetablePage extends GeneralPage {

    //Locators

    //Elements

    //Methods
    public TimetablePage gotoCheckPriceLink(String departstation, String arrivestation)
    {
        Utilities.FindElement(By.xpath("//tr/td[2][contains(text(),'"+departstation+"')]/following-sibling::td[contains(text(),'"+arrivestation+"')]/ancestor::tr/td[6]")).click();
        return new TimetablePage();
    }
}
