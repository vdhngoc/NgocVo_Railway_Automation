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
        timetablePage.gotoCheckPriceLink(Constant.DA_NANG, Constant.SAI_GON);

        Assert.assertEquals(ticketPricePage.getHS(),Constant.HS,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getSS(),Constant.SS,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getSSC(),Constant.SSC,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getHB(),Constant.HB,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getSB(),Constant.SB,"Cell not displayed as expected");
        Assert.assertEquals(ticketPricePage.getSBC(),Constant.SBC,"Cell not displayed as expected");

        homePage.Logout();
    }
}