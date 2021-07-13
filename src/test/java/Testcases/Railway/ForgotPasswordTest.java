package Testcases.Railway;

import Common.Common.Utilities;
import PageObject.Railway.ForgotPasswordPage;
import jdk.jshell.execution.Util;
import org.testng.Assert;
import org.testng.annotations.*;
import Common.Constant.Constant;


public class ForgotPasswordTest extends TestBase{

    @BeforeMethod
    public void BeforeMethod(){ homePage.open(); }

    @AfterMethod
    public void AfterMethod(){
        homePage.Logout();
    }

    @Test(description = "TC12 = Errors display when password reset token is blank")
    public void TC12(){
        homePage.gotoLoginPage();
        loginPage.gotoForgotPasswordPage();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        Assert.assertTrue(Utilities.CheckPageOpened(Constant.FORGOT_PASSWORD),"Page is not displayed");
        forgotPasswordPage.submitEmail( Constant.USERNAME );
        Assert.assertFalse(serverError.isServerErrorDisplayed(),"Testcase is blocked.");
    }

    @Test(description = "TC13 = Errors display if password and confirm password do not match when resetting password")
    public void TC13(){
        homePage.gotoLoginPage();
        loginPage.gotoForgotPasswordPage();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        Assert.assertTrue(Utilities.CheckPageOpened(Constant.FORGOT_PASSWORD),"Page is not displayed");
        forgotPasswordPage.submitEmail( Constant.USERNAME );
        Assert.assertFalse(serverError.isServerErrorDisplayed(),"Testcase is blocked.");
    }
}