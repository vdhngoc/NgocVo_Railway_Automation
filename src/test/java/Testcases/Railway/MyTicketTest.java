package Testcases.Railway;

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
        bookTicketPage.bookTicket(Constant.BOOK_TICKET_DEPART_DATE,
                Constant.SAI_GON,
                Constant.NHA_TRANG,
                Constant.BOOK_TICKET_SEAT_TYPE,
                Constant.BOOK_TICKET_TICKET_AMOUNT);
        myTicketPage.gotoMyTicketPage();
        myTicketPage.cancelTicket(Constant.SAI_GON, Constant.NHA_TRANG);
        Assert.assertFalse(myTicketPage.isRowDisplayed(),"Row still displayed");
        homePage.Logout();
    }
}