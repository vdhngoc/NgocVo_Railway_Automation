package PageObject.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTicketPage extends GeneralPage {

    //Locators

    //Elements

    //Methods
    public void cancelTicket (String departstation, String arrivestation) {
        Utilities.ScrollAndClickIntoView(getCancelTicketElement(departstation, arrivestation));
        Constant.WEBDRIVER.switchTo().alert().accept();
    }

    public WebElement getCancelTicketElement(String departstation, String arrivestation){
        String OperationXpath ="//tr/td[2][contains(text(),'"+departstation+"')]/following-sibling::td[contains(text(),'"+arrivestation+"')]/ancestor::tr/td[11]";
        By btnOperation = By.xpath(OperationXpath);
        return Utilities.FindElement(btnOperation);
    }

    public boolean isRowDisplayed(String departstation, String arrivestation) {
        String OperationXpath ="//tr/td[2][contains(text(),'"+departstation+"')]/following-sibling::td[contains(text(),'"+arrivestation+"')]/ancestor::tr/td[1]";
        By btnOperation = By.xpath(OperationXpath);
        return Constant.WEBDRIVER.findElements(btnOperation).size() != 0 ; }
}
