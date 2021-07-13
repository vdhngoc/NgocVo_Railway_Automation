package Testcases.Railway;

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
        bookTicketPage.bookTicket(Constant.BOOK_TICKET_DEPART_DATE,
                                  Constant.SAI_GON,
                                  Constant.NHA_TRANG,
                                  Constant.BOOK_TICKET_SEAT_TYPE,
                                  Constant.BOOK_TICKET_TICKET_AMOUNT);
        Assert.assertEquals(bookTicketPage.getDepartDate(),Constant.BOOK_TICKET_DEPART_DATE,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getDepartStation(),Constant.SAI_GON,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getArriveStation(),Constant.NHA_TRANG,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getSeatType(),Constant.BOOK_TICKET_SEAT_TYPE,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getTicketAmount(),Constant.BOOK_TICKET_TICKET_AMOUNT,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getBookTicketSuccessMsg(),Constant.MSG_BOOK_TICKET_SUCCESS,"Success message displayed as expected");
        homePage.Logout();
    }
}
