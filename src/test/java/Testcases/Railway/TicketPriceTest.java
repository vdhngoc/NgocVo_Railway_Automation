package Testcases.Railway;

import PageObject.Railway.TicketPricePage;
import PageObject.Railway.TimetablePage;
import org.testng.annotations.*;
import Common.Constant.Constant;
import org.testng.Assert;


public class TicketPriceTest extends TestBase{

    @Test(description = "TC15 - \"Ticket price\" page displays with ticket details after clicking on \"check price\" link in \"Train timetable\" page")
    public void TC15(){
        TimetablePage timetablePage = new TimetablePage();
        TicketPricePage ticketPricePage = new TicketPricePage();
        homePage.open();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        timetablePage.gotoTimetablePage();
        timetablePage.gotoCheckPriceLink(Constant.TICKET_PRICE_DEPART_STATION, Constant.TICKET_PRICE_ARRIVE_STATION);
        Assert.assertEquals(ticketPricePage.getHS(),Constant.DATA_TEST_HS,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getSS(),Constant.DATA_TEST_SS,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getSSC(),Constant.DATA_TEST_SSC,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getHB(),Constant.DATA_TEST_HB,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getSB(),Constant.DATA_TEST_SB,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getSBC(),Constant.DATA_TEST_SBC,"Cell not displayed as expected");
        homePage.Logout();
    }
}