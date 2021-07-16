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

    public TimetablePage gotoBookTicketLink(String departstation, String arrivestation, String departtime)
    {
        String xpathString = "//tr/td[2][contains(text(),'"+departstation+"')]/following-sibling::td[contains(text(),'"+arrivestation+"')]/following-sibling::td[contains(text(),'"+departtime+"')]/ancestor::tr/td[7]";
        By link = By.xpath(xpathString);
        Utilities.ScrollAndClickIntoView( Utilities.FindElement(link));
        return new TimetablePage();
    }
}
