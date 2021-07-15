package Testcases.Railway;

import DataObject.Railway.Ticket;
import PageObject.Railway.MyTicketPage;
import org.testng.annotations.*;
import Common.Constant.Constant;
import org.testng.Assert;


public class MyTicketTest extends TestBase{

    @Test(description = "TC16 - User can cancel a ticket")
    public void TC16(){
        MyTicketPage myTicketPage = new MyTicketPage();
        homePage.open();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        loginPage.gotoBookTicketPage();
        Ticket t = new Ticket();
        bookTicketPage.bookTicket(t.getDepartdate(),
                                  Constant.CANCEL_TICKET_DEPART_STATION,
                                  Constant.CANCEL_TICKET_ARRIVE_STATION,
                                  t.getSeattype(),
                                  Constant.CANCEL_TICKET_TICKET_AMOUNT);
        myTicketPage.gotoMyTicketPage();
        myTicketPage.cancelTicket(Constant.CANCEL_TICKET_DEPART_STATION,
                                  Constant.CANCEL_TICKET_ARRIVE_STATION);
        Assert.assertFalse(myTicketPage.isRowDisplayed(Constant.CANCEL_TICKET_DEPART_STATION,
                                                       Constant.CANCEL_TICKET_ARRIVE_STATION), "Row still displayed");
        homePage.Logout();
    }
}