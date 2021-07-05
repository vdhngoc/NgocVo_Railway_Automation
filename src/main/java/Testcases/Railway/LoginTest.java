package Testcases.Railway;

<<<<<<< HEAD
import Common.Common.RandomString;
import Common.Common.Utilities;
import PageObject.Railway.HomePage;
import PageObject.Railway.LoginPage;
import PageObject.Railway.RegisterPage;
=======
import Common.Common.Utilities;
import PageObject.Railway.HomePage;
import PageObject.Railway.LoginPage;
>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d
import com.google.common.base.Verify;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Common.Constant.Constant;


public class LoginTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void beforeClass() {
        System.out.println("Pre-condition");
        System.setProperty("webdriver.chrome.driver", Utilities.Path);
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }

    @BeforeMethod
    public void BeforeMethod(){
        homePage.open();
    }

    @AfterMethod
    public void AfterMethod(){
        homePage.Logout();
    }

    @Test(description = "TC01 - User can log into Railway with valid username and password")
    public void TC01(){
        homePage.gotoLoginPage();
<<<<<<< HEAD
=======

>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        String actualMsg = loginPage.getWelcomeMessage();
        String expectedMsg = String.format(Constant.MSG_WELCOME_USER,Constant.USERNAME);

        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }

    @Test(description = "TC02 - User cannot login with blank \"Username\" textbox")
    public void TC02(){
        homePage.gotoLoginPage();
        String username = Constant.USERNAME_BLANK;
        loginPage.login(username,Constant.PASSWORD);

        String actualMsg = loginPage.getLoginErrorMessage();
        String expectedMsg = Constant.MSG_LOGIN_INVALID_ACCOUNT;

        Assert.assertEquals(actualMsg,expectedMsg,
                "Error message is not displayed as expected");
    }

    @Test(description = "TC03 - User cannot log into Railway with invalid password")
    public void TC03(){
        homePage.gotoLoginPage();
        String password = Constant.PASSWORD_INVALID;
        loginPage.login(Constant.USERNAME,password);

        String actualMsg = loginPage.getLoginErrorMessage();
        String expectedMsg = Constant.MSG_LOGIN_INVALID_ACCOUNT;

        Assert.assertEquals(actualMsg,expectedMsg,
                "Error message is not displayed as expected");
    }

    @Test(description = "TC04 - User is redirected to Book ticket page after logging in")
    public void TC04(){
        homePage.gotoBookTicketPage();
<<<<<<< HEAD

=======
>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d
        Verify.verify(loginPage.isLoginExist(),"Page is not displayed");

        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        Verify.verify(loginPage.isBookTicketExist(),"Page is not displayed");
        Verify.verify(loginPage.isBookTicketFormExist(),"Form is not displayed");
    }

    @Test(description = "TC05 - System shows message when user enters wrong password several times")
    public void TC05(){
        homePage.gotoLoginPage();
        String password = Constant.PASSWORD_BLANK;
        loginPage.loginSeveralTimes(Constant.USERNAME, password);

        String actualMsg = loginPage.getLoginErrorMessage();
        String expectedMsg = Constant.MSG_LOGIN_SEVERAL_TIMES;

        Assert.assertEquals(actualMsg,expectedMsg, "Error message is not displayed as expected");
    }
<<<<<<< HEAD

    @Test(description = "TC06 - User is redirected to Home page after logging out")
    public void TC06(){
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        loginPage.gotoContactPage();
        loginPage.Logout();

        Verify.verify(loginPage.isHomePageExist(),"Page is not displayed");
        Assert.assertFalse(loginPage.isLogoutExist(),"Logout tab is not displayed");
    }

    @Test(description = "TC07 - User can create new account")
    public void TC07(){
        RegisterPage registerPage = new RegisterPage();
        homePage.gotoRegisterPage();
        registerPage.Register(Constant.REG_EMAIL, Constant.REG_PASSWORD, Constant.REG_CONFIRMPASSWORD, Constant.REG_PASSPORT);

        String actualMsg = registerPage.getRegisterSuccessMessage();
        String expectedMsg = Constant.MSG_REG_SUCCESS;

        Assert.assertEquals(actualMsg, expectedMsg, "Register success message is not displayed as expected");
    }

    @Test(description = "TC08 - User cannot login with an account hasn't been activated")
    public void TC08(){
        RegisterPage registerPage = new RegisterPage();
        homePage.gotoRegisterPage();
        registerPage.Register(Constant.REG_EMAIL, Constant.REG_PASSWORD, Constant.REG_CONFIRMPASSWORD, Constant.REG_PASSPORT);

        loginPage.gotoLoginPage();
        loginPage.login(Constant.REG_EMAIL, Constant.REG_PASSWORD);

        String actualMsg = loginPage.getLoginErrorMessage();
        String expectedMsg = Constant.MSG_LOGIN_INVALID_ACCOUNT;

        Assert.assertEquals(actualMsg,expectedMsg,
                "Error message is not displayed as expected");
    }
=======
>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d
}
