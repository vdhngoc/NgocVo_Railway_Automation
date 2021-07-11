package PageObject.Railway;

import Common.Common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Constant.Constant;
import  org.openqa.selenium.support.ui.Select;

public class BookTicketPage extends GeneralPage {

    //Locators
    private final By formBookTicket = By.xpath("//legend['Book ticket form']");
    private final By cbbDepartDate = By.xpath("//select[@name='Date']");
    private final By cbbDepartFrom = By.xpath("//select[@name='DepartStation']");
    private final By cbbArriveAt = By.xpath("//select[@name='ArriveStation']");
    private final By cbbSeatType = By.xpath("//select[@name='SeatType']");
    private final By cbbTicketAmount = By.xpath("//select[@name='TicketAmount']");
    private final By btnBookTicket = By.xpath("//form//input[@value='Book ticket']");
    private final By lblBookTicketSuccessMsg = By.xpath("//div[@id='content']/h1");
    private final By cellDepartDate = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[4]");
    private final By cellDepartStation = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[1]");
    private final By cellArriveStation = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[2]");
    private final By cellSeatType = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[3]");
    private final By cellTicketAmount = By.xpath("//table[@class='MyTable WideTable']/tbody/tr[1]/following-sibling::tr/td[7]");

    //Elements
    public WebElement getCbbDepartDate() { return Constant.WEBDRIVER.findElement(cbbDepartDate); }

    public WebElement getCbbDepartFrom() { return Constant.WEBDRIVER.findElement(cbbDepartFrom); }

    public WebElement getCbbArriveAt() { return Constant.WEBDRIVER.findElement(cbbArriveAt); }

    public WebElement getCbbSeatType() { return Constant.WEBDRIVER.findElement(cbbSeatType); }

    public WebElement getCbbTicketAmount() { return Constant.WEBDRIVER.findElement(cbbTicketAmount); }

    public WebElement getBtnBookTicket() { return Constant.WEBDRIVER.findElement(btnBookTicket); }

    public WebElement getLblBookTicketSuccessMsg() { return Constant.WEBDRIVER.findElement(lblBookTicketSuccessMsg); }

    public WebElement getCellDepartDate() { return Constant.WEBDRIVER.findElement(cellDepartDate); }

    public WebElement getCellDepartStation() { return Constant.WEBDRIVER.findElement(cellDepartStation); }

    public WebElement getCellArriveStation() { return Constant.WEBDRIVER.findElement(cellArriveStation); }

    public WebElement getCellSeatType() { return Constant.WEBDRIVER.findElement(cellSeatType); }

    public WebElement getCellTicketAmount() { return Constant.WEBDRIVER.findElement(cellTicketAmount); }

    //Methods
    public boolean isBookTicketFormExist(){
        return Constant.WEBDRIVER.findElements(formBookTicket).size() != 0;
    }

    public void getDepartDate(String value){
        Select departDate = new Select(getCbbDepartDate());
        departDate.selectByVisibleText(value);
    }

    public void getDepartStation(String value){
        Select departFrom = new Select(getCbbDepartFrom());
        departFrom.selectByVisibleText(value);
    }

    public void getArriveStation(String value){
        Select arriveAt = new Select(getCbbArriveAt());
        arriveAt.selectByVisibleText(value);
    }

    public void getSeatType(String value){
        Select seatType = new Select(getCbbSeatType());
        seatType.selectByVisibleText(value);
    }

    public void getTicketAmount(String value){
        Select ticketAmount = new Select(getCbbTicketAmount());
        ticketAmount.selectByVisibleText(value);
    }

    public void bookTicket(String departdate, String departfrom, String arriveat, String seattype, String ticketamount){
        this.getDepartDate(departdate);
        this.getDepartStation(departfrom);
        this.getArriveStation(arriveat);
        this.getSeatType(seattype);
        this.getTicketAmount(ticketamount);
        Utilities.PageDownEnd();
        this.getBtnBookTicket().click();
    }

    public String getBookticketSuccessMsg() {
        return this.getLblBookTicketSuccessMsg().getText();
    }

    public String getDepartDate() { return this.getCellDepartDate().getText(); }

    public String getDepartStation() { return this.getCellDepartStation().getText(); }

    public String getArriveStation() { return this.getCellArriveStation().getText(); }

    public String getSeatType() { return this.getCellSeatType().getText(); }

    public String getTicketAmount() { return this.getCellTicketAmount().getText(); }

}
