package Common.Constant;
import Common.Common.Utilities;
import  org.openqa.selenium.WebDriver;

public class Constant {

    public static WebDriver WEBDRIVER;
    public static final String RAILWAY_URL= "http://www.railway2.somee.com/Page/HomePage.cshtml";
    public static final String USERNAME = "ngocvo@gmail.com";
    public static final String PASSWORD = "12345678";
    public static final String PASSWORD_BLANK = "";
    public static final String USERNAME_BLANK = "";
    public static final String PASSWORD_INVALID = "1234";

    public static final String REG_EMAIL = "ngocvo+" + Utilities.RandomString() + "@gmail.com";
    public static final String REG_PASSWORD = "12345678";
    public static final String REG_PASSPORT = "12345678";
    public static final String REG_PASSWORD_BLANK = "";
    public static final String REG_PASSPORT_BLANK = "";

    public static final String CHANGE_NEW_PW = "a123:\"/{}!@$\\";
    public static final String CHANGE_CONFIRM_PW = "b456:\"/{}!@$\\";

    public static String MSG_WELCOME_USER = "Welcome %s";
    public static String MSG_LOGIN_SEVERAL_TIMES =  "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";
    public static String MSG_LOGIN_INVALID_ACCOUNT = "There was a problem with your login and/or errors exist in your form.";
    public static String MSG_REG_SUCCESS = "Thank you for registering your account";
    public static String MSG_REG_IN_USE_EMAIL = "This email address is already in use.";
    public static String MSG_REG_FAILED = "There're errors in the form. Please correct the errors and try again.";
    public static String MSG_REG_INVALID_PASSWORD = "Invalid password length";
    public static String MSG_REG_INVALID_PASSPORT = "Invalid ID length";
    public static String MSG_CHANGE_NOT_MATCH = "The password confirmation does not match the new password.";
}
