package Testcases.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import DataObject.Railway.Ticket;
import PageObject.Railway.MyTicketPage;
import PageObject.Railway.TimetablePage;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FinalTest extends TestBase{

    @BeforeMethod
    public void beforeMethod(){
        homePage.open();
    }

    @AfterMethod
    public void afterMethod(){
        homePage.Logout();
    }

    @Test(description = "TC01 - User can 1 ticket at a time")
    public void TC01(){
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        loginPage.gotoBookTicketPage();
        Ticket t = new Ticket();
        loginPage.gotoBookTicketPage();
        bookTicketPage.bookTicket(t.getDepartdate(),
                "Huế",
                "Nha Trang",
                "Soft seat with air conditioner",
                "4");
    }

    @Test(description = "TC02 - User can filter \"Manage ticket\" table with both Depart station and Arrive station")
    public void TC02() {
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        loginPage.gotoBookTicketPage();
        bookTicketPage.bookTicketSeveralTimes(Constant.TIMES);
        bookTicketPage.gotoMyTicketPage();
        MyTicketPage myTicketPage = new MyTicketPage();
        myTicketPage.submitFilter(
                Constant.BOOK_TICKET_DEPART_STATION,
                Constant.BOOK_TICKET_ARRIVE_STATION,
                Constant.DATA_EMPTY,
                Constant.FILTER_TICKET_STATUS_IGNORE);
        int countRow = myTicketPage.CountTableRow(Constant.BOOK_TICKET_DEPART_STATION, Constant.BOOK_TICKET_ARRIVE_STATION);
        Assert.assertEquals(countRow,Constant.TIMES, "Table not displayed as expected");
    }

    @Test(description = "TC03 - User can book ticket from Timetable")
    public void TC03(){
        TimetablePage timetablePage = new TimetablePage();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        timetablePage.gotoTimetablePage();
        timetablePage.gotoBookTicketLink(
                "Huế",
                "Nha Trang",
                Constant.TICKET_PRICE_DEPART_TIME);
        Assert.assertEquals(bookTicketPage.getSelectedDepartFrom(),"Huế","\"Book ticket\" page displays default values incorrectly");
        Assert.assertEquals(bookTicketPage.getSelectedArriveAt(),"Nha Trang","\"Book ticket\" page displays default values incorrectly");
    }
}
