package Testcases.Railway;

import PageObject.Railway.ChangePasswordPage;
import PageObject.Railway.ForgotPasswordPage;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.*;
import Common.Constant.Constant;


public class LoginTest extends TestBase{

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

    @Test(description = "TC06 - User is redirected to Home page after logging out")
    public void TC06(){
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        loginPage.gotoContactPage();
        loginPage.Logout();

        Verify.verify(loginPage.isHomePageExist(),"Page is not displayed");
        Assert.assertFalse(loginPage.isLogoutExist(),"Logout tab is not displayed");
    }

    @Test(description = "TC09 - User cannot change password when \"New Password\" and \"Confirm Password\" are different")
    public void TC09(){
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        loginPage.gotoChangePasswordPage();
        changePasswordPage.changePassword(Constant.PASSWORD, Constant.CHANGE_NEW_PW, Constant.CHANGE_CONFIRM_PW);

        String actualMsg = changePasswordPage.getChangePasswordErrorMessage();
        String expectedMsg = Constant.MSG_CHANGE_NOT_MATCH;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }
}
