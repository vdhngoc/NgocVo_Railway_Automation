package PageObject.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage{

    //Locators
    private final By txtUsername = By.xpath("//input[@id='username']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By btnLogin = By.xpath("//input[@value='Login']");
    private final By lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm']");
    private final By linkForgotPassword = By.xpath("//a[@href='/Account/ForgotPassword.cshtml']");

    //Elements
    public WebElement getUsernameElement()
    {
        return Utilities.FindElement(txtUsername);
    }

    public WebElement getPasswordElement()
    {
        return Utilities.FindElement(txtPassword);
    }

    public WebElement getLoginElement()
    {
        return Utilities.FindElement(btnLogin);
    }

    public WebElement getLoginErrorMsgElement()
    {
        return Utilities.FindElement(lblLoginErrorMsg);
    }

    public WebElement getForgotPasswordElement() { return Utilities.FindElement(linkForgotPassword); }

    //Methods
    public boolean isLoginErrorMessageExist() { return Constant.WEBDRIVER.findElements(lblLoginErrorMsg).size() != 0 ; }

    public HomePage login(String username, String password)
    {
        this.getUsernameElement().sendKeys(username);
        this.getPasswordElement().sendKeys(password);
        this.getLoginElement().click();
        return new HomePage();
    }

    public void loginSeveralTimes(String username, String password)
    {
        for (int i=0; i<4; i++){
        this.login(username,password);
        }
    }

    public String getLoginErrorMessage(){
        return getLoginErrorMsgElement().getText();
    }

    public void gotoForgotPasswordPage() {
        this.getForgotPasswordElement().click();
    }
}
