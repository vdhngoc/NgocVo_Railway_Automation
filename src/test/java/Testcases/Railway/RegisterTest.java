package Testcases.Railway;

import Common.Common.Utilities;
import org.testng.Assert;
import org.testng.annotations.*;
import Common.Constant.Constant;

public class RegisterTest extends TestBase{

    @BeforeMethod
    public void BeforeMethod(){
        homePage.open();
        homePage.gotoRegisterPage();
    }

    @AfterMethod
    public void AfterMethod(){
        homePage.Logout();
    }

    @Test(description = "TC07 - User can create new account")
    public void TC07(){
        registerPage.register(Constant.REGISTER_EMAIL, Constant.REGISTER_PASSWORD, Constant.REGISTER_PASSWORD, Constant.REGISTER_PASSPORT);
        String actualMsg = registerPage.getRegisterSuccessMessage();
        String expectedMsg = Constant.MSG_REGISTER_SUCCESS;
        Assert.assertTrue(Utilities.CheckPageOpened(Constant.REGISTER_CONFIRM),"Page is not displayed");
        Assert.assertEquals(actualMsg, expectedMsg, "Register success message is not displayed as expected");
    }

    @Test(description = "TC10 - User cannot create account with an already in-use email")
    public void TC10(){
        registerPage.register(Constant.USERNAME, Constant.REGISTER_PASSWORD, Constant.REGISTER_PASSWORD, Constant.REGISTER_PASSPORT);
        String actualMsg = registerPage.getRegisterErrorMessage();
        String expectedMsg = Constant.MSG_REGISTER_IN_USE_EMAIL;
        Assert.assertEquals(actualMsg, expectedMsg, "Register error message is not displayed as expected");
    }

    @Test(description = "TC11 = User cannot create account while password and PID fields are empty")
    public void TC11(){
        registerPage.register(Constant.REGISTER_EMAIL, Constant.DATA_EMPTY, Constant.DATA_EMPTY, Constant.DATA_EMPTY);

        String actualMsg = registerPage.getRegisterErrorMessage();
        String expectedMsg = Constant.MSG_REGISTER_FAILED;
        Assert.assertEquals(actualMsg, expectedMsg, "Register error message is not displayed as expected");

        String actualPasswordMsg = registerPage.getRegisterInvalidPasswordMsg();
        String expectedPasswordMsg = Constant.MSG_REGISTER_INVALID_PASSWORD;
        Assert.assertEquals(actualPasswordMsg, expectedPasswordMsg, "Register invalid password error message is not displayed as expected");

        String actualPassportMsg = registerPage.getRegisterInvalidPassportMsg();
        String expectedPassportMsg = Constant.MSG_REGISTER_INVALID_PASSPORT;
        Assert.assertEquals(actualPassportMsg, expectedPassportMsg, "Register invalid passport error message is not displayed as expected");
    }
}
