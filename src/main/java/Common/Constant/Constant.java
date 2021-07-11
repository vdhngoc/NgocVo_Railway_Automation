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

    public static String REG_EMAIL = "ngocvo+" + Utilities.RandomString() + "@gmail.com";
    public static final String REG_PASSWORD = "12345678";
    public static final String REG_PASSPORT = "12345678";

    public static final String CHANGE_NEW_PW = "a123:\"/{}!@$\\";
    public static final String CHANGE_CONFIRM_PW = "b456:\"/{}!@$\\";

    public static final String HOME = "Welcome to Safe Railway";

    public static String BT_DEPART_DATE = Utilities.SetDepartDate();
    public static final int NUMBER_OF_DATE = 5;
    public static final String NHA_TRANG = "Nha Trang";
    public static final String SAI_GON = "Sài Gòn";
    public static final String DA_NANG = "Đà Nẵng";
    public static final String BT_SEAT_TYPE = "Soft seat with air conditioner";
    public static final String BT_TICKET_AMOUNT = "5";

    public static final String HS = "310000";
    public static final String SS = "335000";
    public static final String SSC = "360000";
    public static final String HB = "410000";
    public static final String SB = "460000";
    public static final String SBC = "510000";

    public static String MSG_WELCOME_USER = "Welcome %s";
    public static String MSG_LOGIN_SEVERAL_TIMES =  "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";
    public static String MSG_LOGIN_INVALID_ACCOUNT = "Invalid username or password. Please try again.";
    public static String MSG_LOGIN_PROBLEM = "There was a problem with your login and/or errors exist in your form.";
    public static String MSG_REG_SUCCESS = "Thank you for registering your account";
    public static String MSG_REG_IN_USE_EMAIL = "This email address is already in use.";
    public static String MSG_REG_FAILED = "There're errors in the form. Please correct the errors and try again.";
    public static String MSG_REG_INVALID_PASSWORD = "Invalid password length";
    public static String MSG_REG_INVALID_PASSPORT = "Invalid ID length";
    public static String MSG_CHANGE_NOT_MATCH = "Password change failed. Please correct the errors and try again.";
    public static String MSG_BT_SUCCESS = "Ticket booked successfully!";
}
