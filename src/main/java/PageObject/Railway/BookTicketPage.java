package PageObject.Railway;

import Common.Common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Constant.Constant;
import  org.openqa.selenium.support.ui.Select;

public class BookTicketPage extends GeneralPage {

    //Locators
    private final By formBookTicket = By.xpath("//legend['Book ticket form']");
    private final By cbbDepartDate = By.name("Date");
    private final By cbbDepartFrom = By.name("DepartStation");
    private final By cbbArriveAt = By.name("ArriveStation");
    private final By cbbSeatType = By.name("SeatType");
    private final By cbbTicketAmount = By.name("TicketAmount");
    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By lblBookTicketSuccessMsg = By.xpath("//div[@id='content']/h1");
    private final By cellDepartDate = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[4]");
    private final By cellDepartStation = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[1]");
    private final By cellArriveStation = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[2]");
    private final By cellSeatType = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[3]");
    private final By cellTicketAmount = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[7]");

    //Elements
    public WebElement getDepartDateElement() { return Utilities.FindElement(cbbDepartDate); }

    public WebElement getDepartFromElement() { return Utilities.FindElement(cbbDepartFrom); }

    public WebElement getArriveAtElement() { return Utilities.FindElement(cbbArriveAt); }

    public WebElement getSeatTypeElement() { return Utilities.FindElement(cbbSeatType); }

    public WebElement getTicketAmountElement() { return Utilities.FindElement(cbbTicketAmount); }

    public WebElement getBookTicketElement() { return Utilities.FindElement(btnBookTicket); }

    public WebElement getBookTicketSuccessMsgElement() { return Utilities.FindElement(lblBookTicketSuccessMsg); }

    public WebElement getCellDepartDate() { return Utilities.FindElement(cellDepartDate); }

    public WebElement getCellDepartStation() { return Utilities.FindElement(cellDepartStation); }

    public WebElement getCellArriveStation() { return Utilities.FindElement(cellArriveStation); }

    public WebElement getCellSeatType() { return Utilities.FindElement(cellSeatType); }

    public WebElement getCellTicketAmount() { return Utilities.FindElement(cellTicketAmount); }

    //Methods
    public boolean isBookTicketFormExist(){
        return Constant.WEBDRIVER.findElements(formBookTicket).size() != 0;
    }

    public void getDepartDate(String value){
        Select departDate = new Select(getDepartDateElement());
        departDate.selectByVisibleText(value);
    }

    public void getDepartStation(String value){
        Select departFrom = new Select(getDepartFromElement());
        departFrom.selectByVisibleText(value);
    }

    public void getArriveStation(String value){
        Select arriveAt = new Select(getArriveAtElement());
        arriveAt.selectByVisibleText(value);
    }

    public void getSeatType(String value){
        Select seatType = new Select(getSeatTypeElement());
        seatType.selectByVisibleText(value);
    }

    public void getTicketAmount(String value){
        Select ticketAmount = new Select(getTicketAmountElement());
        ticketAmount.selectByVisibleText(value);
    }

    public void bookTicket(String departdate, String departfrom, String arriveat, String seattype, String ticketamount){
        this.getDepartDate(departdate);
        this.getDepartStation(departfrom);
        this.getArriveStation(arriveat);
        this.getSeatType(seattype);
        this.getTicketAmount(ticketamount);
        Utilities.ScrollIntoView(getBookTicketElement()) ;
        this.getBookTicketElement().click();
    }

    public String getBookTicketSuccessMsg() {
        return this.getBookTicketSuccessMsgElement().getText();
    }

    public String getDepartDate() { return this.getCellDepartDate().getText(); }

    public String getDepartStation() { return this.getCellDepartStation().getText(); }

    public String getArriveStation() { return this.getCellArriveStation().getText(); }

    public String getSeatType() { return this.getCellSeatType().getText(); }

    public String getTicketAmount() { return this.getCellTicketAmount().getText(); }

}
