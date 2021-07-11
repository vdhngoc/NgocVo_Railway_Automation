package PageObject.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class MyTicketPage extends GeneralPage {

    //Locators
    private final By row = By.xpath("//table//tr[2]");

    //Elements

    //Methods
    public By cancelTicket (String departstation, String arrivestation) {
        String OperationXpath ="//tr/td[2][contains(text(),'"+departstation+"')]/following-sibling::td[contains(text(),'"+arrivestation+"')]/ancestor::tr/td[11]";
        By btnOperation = By.xpath(OperationXpath);
        Constant.WEBDRIVER.findElement(btnOperation).click();
        Alert alert = Constant.WEBDRIVER.switchTo().alert();
        alert.accept();
        return btnOperation;
    }

    public boolean isRowDisplayed() { return Constant.WEBDRIVER.findElements(row).size() != 0 ; }
}
