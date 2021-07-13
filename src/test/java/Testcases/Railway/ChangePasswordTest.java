package Testcases.Railway;

import PageObject.Railway.ChangePasswordPage;
import org.testng.Assert;
import org.testng.annotations.*;
import Common.Constant.Constant;


public class ChangePasswordTest extends TestBase{

    @Test(description = "TC09 - User cannot change password when \"New Password\" and \"Confirm Password\" are different")
    public void TC09(){
        homePage.open();

        ChangePasswordPage changePasswordPage = new ChangePasswordPage();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        loginPage.gotoChangePasswordPage();
        changePasswordPage.changePassword(Constant.PASSWORD, Constant.CHANGE_NEW_PW, Constant.CHANGE_CONFIRM_PW);

        String actualMsg = changePasswordPage.getChangePasswordErrorMsg();
        String expectedMsg = Constant.MSG_CHANGE_NOT_MATCH;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");

        homePage.Logout();
    }
}