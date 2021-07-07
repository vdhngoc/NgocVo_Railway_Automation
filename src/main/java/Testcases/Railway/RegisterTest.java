package Testcases.Railway;

import org.testng.Assert;
import org.testng.annotations.*;
import Common.Constant.Constant;

public class RegisterTest extends TestBase{

    @BeforeMethod
    public void BeforeMethod(){
        homePage.open();
    }

    @AfterMethod
    public void AfterMethod(){
        homePage.Logout();
    }

    @Test(description = "TC07 - User can create new account")
    public void TC07(){
        homePage.gotoRegisterPage();
        registerPage.register(Constant.REG_EMAIL, Constant.REG_PASSWORD, Constant.PASSWORD, Constant.REG_PASSPORT);

        String actualMsg = registerPage.getRegSuccessMessage();
        String expectedMsg = Constant.MSG_REG_SUCCESS;

        Assert.assertEquals(actualMsg, expectedMsg, "Register success message is not displayed as expected");
    }

    @Test(description = "TC08 - User cannot login with an account has not been activated")
    public void TC08(){
        homePage.gotoRegisterPage();
        String email = Constant.REG_EMAIL;
        registerPage.register(email, Constant.REG_PASSWORD, Constant.REG_PASSWORD, Constant.REG_PASSPORT);

        loginPage.gotoLoginPage();
        loginPage.login(email, Constant.REG_PASSWORD);

        String actualMsg = loginPage.getLoginErrorMessage();
        String expectedMsg = Constant.MSG_LOGIN_INVALID_ACCOUNT;

        Assert.assertEquals(actualMsg,expectedMsg,
                "Error message is not displayed as expected");
    }

    @Test(description = "TC10 - User cannot create account with an already in-use email")
    public void TC10(){
        homePage.gotoRegisterPage();
        registerPage.register(Constant.USERNAME, Constant.REG_PASSWORD, Constant.REG_PASSWORD, Constant.REG_PASSPORT);

        String actualMsg = registerPage.getRegErrorMessage();
        String expectedMsg = Constant.MSG_REG_IN_USE_EMAIL;
        Assert.assertEquals(actualMsg, expectedMsg, "Register error message is not displayed as expected");
    }

    @Test(description = "TC11 = User cannot create account while password and PID fields are empty")
    public void TC11(){
        homePage.gotoRegisterPage();
        registerPage.register(Constant.REG_EMAIL, Constant.REG_PASSWORD_BLANK, Constant.REG_PASSWORD_BLANK, Constant.REG_PASSPORT_BLANK);

        String actualMsg = registerPage.getRegErrorMessage();
        String expectedMsg = Constant.MSG_REG_FAILED;
        String actualPasswordMsg = registerPage.getRegInvalidPasswordMsg();
        String expectedPasswordMsg = Constant.MSG_REG_INVALID_PASSWORD;
        String actualPassportMsg = registerPage.getRegInvalidPassportMsg();
        String expectedPassportMsg = Constant.MSG_REG_INVALID_PASSPORT;

        Assert.assertEquals(actualMsg, expectedMsg, "Register error message is not displayed as expected");
        Assert.assertEquals(actualPasswordMsg, expectedPasswordMsg, "Register invalid password error message is not displayed as expected");
        Assert.assertEquals(actualPassportMsg, expectedPassportMsg, "Register invalid passport error message is not displayed as expected");
    }
}
