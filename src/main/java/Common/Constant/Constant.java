package Common.Constant;
import Common.Common.Utilities;
import  org.openqa.selenium.WebDriver;

public class Constant {

    public static WebDriver WEBDRIVER;
    public static final String DATA_EMPTY = "";
    public static final String RAILWAY_URL= "http://www.railway2.somee.com/Page/HomePage.cshtml";
    public static final String USERNAME = "ngocvo@gmail.com";
    public static final String PASSWORD = "12345678";
    public static final String PASSWORD_INVALID = "1234";

    public static String REGISTER_EMAIL = "ngocvo+" + Utilities.RandomString() + "@gmail.com";
    public static final String REGISTER_PASSWORD = "12345678";
    public static final String REGISTER_PASSPORT = "12345678";

    public static final String CHANGE_NEW_PW = "a123:\"/{}!@$\\";
    public static final String CHANGE_CONFIRM_PW = "b456:\"/{}!@$\\";

    public static final String HOME = "Safe Railway - Selenium Automation";
    public static final String BOOK_TICKET = "Safe Railway - Book Ticket";
    public static final String REGISTER_CONFIRM = "Safe Railway - Registration Confirmation Page";
    public static final String FORGOT_PASSWORD = "Safe Railway - Forget Your Password?";

<<<<<<< HEAD
    public static String BOOK_TICKET_DEPART_DATE = Utilities.SetDepartDate(1);
=======
    public static final int NUMBER_OF_DATE = 5;
    public static String BOOK_TICKET_DEPART_DATE = Utilities.SetDepartDate();
>>>>>>> b21bfabcda3a46a8836ba4764d6af32750baa365
    public static final String BOOK_TICKET_DEPART_STATION = "Sài Gòn";
    public static final String BOOK_TICKET_ARRIVE_STATION = "Nha Trang";
    public static final String BOOK_TICKET_SEAT_TYPE = "Soft seat with air conditioner";
    public static final String BOOK_TICKET_TICKET_AMOUNT = "5";
    public static final String TICKET_PRICE_DEPART_STATION = "Đà Nẵng";
    public static final String TICKET_PRICE_ARRIVE_STATION = "Sài Gòn";
<<<<<<< HEAD
    public static final String TICKET_PRICE_DEPART_TIME = "8:00";
    public static final String CANCEL_TICKET_DEPART_STATION = "Sài Gòn";
    public static final String CANCEL_TICKET_ARRIVE_STATION = "Phan Thiết";
    public static final String CANCEL_TICKET_TICKET_AMOUNT = "1";
    public static final String FILTER_TICKET_STATUS_IGNORE = "Ignore";

    public static int TIMES = 6;
=======
    public static final String CANCEL_TICKET_DEPART_STATION = "Sài Gòn";
    public static final String CANCEL_TICKET_ARRIVE_STATION = "Phan Thiết";
    public static final String CANCEL_TICKET_TICKET_AMOUNT = "1";
>>>>>>> b21bfabcda3a46a8836ba4764d6af32750baa365

    public static final String DATA_TEST_HS = "310000";
    public static final String DATA_TEST_SS = "335000";
    public static final String DATA_TEST_SSC = "360000";
    public static final String DATA_TEST_HB = "410000";
    public static final String DATA_TEST_SB = "460000";
    public static final String DATA_TEST_SBC = "510000";

    public static String MSG_WELCOME_USER = "Welcome %s";
    public static String MSG_LOGIN_SEVERAL_TIMES =  "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";
    public static String MSG_LOGIN_INVALID_ACCOUNT = "Invalid username or password. Please try again.";
    public static String MSG_LOGIN_PROBLEM = "There was a problem with your login and/or errors exist in your form.";
    public static String MSG_REGISTER_SUCCESS = "Thank you for registering your account";
    public static String MSG_REGISTER_IN_USE_EMAIL = "This email address is already in use.";
    public static String MSG_REGISTER_FAILED = "There're errors in the form. Please correct the errors and try again.";
    public static String MSG_REGISTER_INVALID_PASSWORD = "Invalid password length";
    public static String MSG_REGISTER_INVALID_PASSPORT = "Invalid ID length";
    public static String MSG_CHANGE_NOT_MATCH = "Password change failed. Please correct the errors and try again.";
    public static String MSG_BOOK_TICKET_SUCCESS = "Ticket Booked Successfully!";
}
