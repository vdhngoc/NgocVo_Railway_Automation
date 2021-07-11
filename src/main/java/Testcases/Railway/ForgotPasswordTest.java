package Testcases.Railway;

import PageObject.Railway.ForgotPasswordPage;
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
        forgotPasswordPage.submitEmail( Constant.USERNAME );
        Assert.assertFalse(serverError.isServerErrorDisplayed(),"Testcase is blocked.");
    }

    @Test(description = "TC13 = Errors display if password and confirm password do not match when resetting password")
    public void TC13(){
        homePage.gotoLoginPage();
        loginPage.gotoForgotPasswordPage();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        forgotPasswordPage.submitEmail( Constant.USERNAME );
        Assert.assertFalse(serverError.isServerErrorDisplayed(),"Testcase is blocked.");
    }
}