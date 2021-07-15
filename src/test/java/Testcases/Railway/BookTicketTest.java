package Testcases.Railway;

import DataObject.Railway.Ticket;
import org.testng.Assert;
import org.testng.annotations.*;
import Common.Constant.Constant;


public class BookTicketTest extends TestBase{

    @Test(description = "TC14 = User can book many tickets at a time")
    public void TC14(){
        homePage.open();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        loginPage.gotoBookTicketPage();
        Ticket t = new Ticket();
        bookTicketPage.bookTicket(t.getDepartdate(),
                                  t.getDepartstation(),
                                  t.getArrivestation(),
                                  t.getSeattype(),
                                  t.getTicketamount());
        Assert.assertEquals(bookTicketPage.getDepartDate(),t.getDepartdate(),"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getDepartStation(),t.getDepartstation(),"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getArriveStation(),t.getArrivestation(),"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getSeatType(),t.getSeattype(),"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getTicketAmount(),t.getTicketamount(),"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getBookTicketSuccessMsg(),Constant.MSG_BOOK_TICKET_SUCCESS,"Success message displayed as expected");
        homePage.Logout();
    }
}
