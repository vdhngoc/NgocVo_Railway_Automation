package PageObject.Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Constant.Constant;

public class BookTicketPage extends GeneralPage {

    //Locators
    private final By formBookTicket = By.xpath("//legend['Book ticket form']");
    private final By cbbDepartDate = By.xpath("//form//li[1]//select");
    private final By cbbDepartFrom = By.xpath("//form//li[2]//select");
    private final By cbbArriveAt = By.xpath("//form//li[3]//select");
    private final By cbbSeatType = By.xpath("//form//li[4]//select");
    private final By cbbTicketAmount = By.xpath("//form//li[5]//select");
    private final By btnBookticket = By.xpath("//form//input[@value='Book ticket']");

    //Elements

    //Methods
    public boolean isBookTicketFormExist(){
        return Constant.WEBDRIVER.findElements(formBookTicket).size() != 0;
    }
}