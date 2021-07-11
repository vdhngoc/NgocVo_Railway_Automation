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
        bookTicketPage.bookTicket(Constant.BT_DEPART_DATE,
                                  Constant.NHA_TRANG,
                                  Constant.SAI_GON,
                                  Constant.BT_SEAT_TYPE,
                                  Constant.BT_TICKET_AMOUNT);
        Assert.assertEquals(bookTicketPage.getDepartDate(),Constant.BT_DEPART_DATE,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getDepartStation(),Constant.NHA_TRANG,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getArriveStation(),Constant.SAI_GON,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getSeatType(),Constant.BT_SEAT_TYPE,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getTicketAmount(),Constant.BT_TICKET_AMOUNT,"Cell not displayed as expected");
        Assert.assertEquals(bookTicketPage.getBookticketSuccessMsg(),Constant.MSG_BT_SUCCESS,"Success message displayed as expected");
        homePage.Logout();
    }
}
