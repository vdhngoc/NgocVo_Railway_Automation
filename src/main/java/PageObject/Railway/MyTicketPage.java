package PageObject.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyTicketPage extends GeneralPage {

    //Locators
    private final By cbbDepartStation = By.name("FilterDpStation");
    private final By cbbArriveStation = By.name("FilterArStation");
    private final By txtDepartDate = By.name("FilterDpDate");
    private final By cbbStatus = By.name("FilterStatus");
    private final By btnSubmit = By.xpath("//input[@type='submit']");

    //Elements
    public WebElement getFilterDepartDateElement() { return Utilities.FindElement(txtDepartDate); }

    public WebElement getFilterDepartStationElement() { return Utilities.FindElement(cbbDepartStation); }

    public WebElement getFilterArriveStationElement() { return Utilities.FindElement(cbbArriveStation); }

    public WebElement getFilterStatusElement() { return Utilities.FindElement(cbbStatus); }

    public WebElement getFilterSubmitElement() { return Utilities.FindElement(btnSubmit); }

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

    public void getFilterStatus(String value){
        Select departDate = new Select(getFilterStatusElement());
        departDate.selectByVisibleText(value);
    }

    public void getFilterDepartStation(String value){
        Select departFrom = new Select(getFilterDepartStationElement());
        departFrom.selectByVisibleText(value);
    }

    public void getFilterArriveStation(String value){
        Select arriveAt = new Select(getFilterArriveStationElement());
        arriveAt.selectByVisibleText(value);
    }

    public void submitFilter( String departfrom, String arriveat, String departdate, String status){
        this.getFilterDepartStation(departfrom);
        this.getFilterArriveStation(arriveat);
        this.getFilterDepartDateElement().sendKeys(departdate);
        this.getFilterStatus(status);
        this.getFilterSubmitElement().click();
    }

    public int CountTableRow(String departstation, String arrivestation){
        String xpathString = "//table[@class='MyTable']//td[contains(text(),'"+departstation+"')]//following-sibling::td[contains(text(),'"+arrivestation+"')]";
        By row = By.xpath(xpathString);
        return Constant.WEBDRIVER.findElements(row).size();
    }
}
