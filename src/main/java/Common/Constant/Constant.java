package Common.Constant;
import  org.openqa.selenium.WebDriver;

public class Constant {

    public static WebDriver WEBDRIVER;
    public static final String RAILWAY_URL= "http://www.railway2.somee.com/Page/HomePage.cshtml";
    public static final String USERNAME = "ngoc@gmail.com";
    public static final String PASSWORD = "12345678";
    public static final String PASSWORD_BLANK = "";
    public static final String USERNAME_BLANK = "";
    public static final String PASSWORD_INVALID = "1234";

    public static final String REG_EMAIL = "ngoc12@gmail.com";
    public static final String REG_PASSWORD = "12345678";
    public static final String REG_CONFIRMPASSWORD= "12345678";
    public static final String REG_PASSPORT = "12345678";

    public static String MSG_WELCOME_USER = "Welcome %s";
    public static String MSG_LOGIN_SEVERAL_TIMES =  "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";
    public static String MSG_LOGIN_INVALID_ACCOUNT = "There was a problem with your login and/or errors exist in your form.";
    public static String MSG_REG_SUCCESS= "Thank you for registering your account";

}
