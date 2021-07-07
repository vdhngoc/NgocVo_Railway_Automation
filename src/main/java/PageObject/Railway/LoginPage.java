package PageObject.Railway;

import Common.Constant.Constant;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage{

    //Locators
    private final By txtUsername = By.xpath("//input[@id='username']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By btnLogin = By.xpath("//input[@value='Login']");
    private final By lblLoginErrorMsg = By.xpath("//div[@id='content']//p[@class='message error LoginForm']");
    private final By linkForgotPasswordPage = By.xpath("//a[@href='/Account/ForgotPassword.cshtml']");

    //Elements
    public WebElement getTxtUsername()
    {
        return Constant.WEBDRIVER.findElement(txtUsername);
    }

    public WebElement getTxtPassword()
    {
        return Constant.WEBDRIVER.findElement(txtPassword);
    }

    public WebElement getBtnLogin()
    {
        return Constant.WEBDRIVER.findElement(btnLogin);
    }

    public WebElement getLblLoginErrorMsg()
    {
        return Constant.WEBDRIVER.findElement(lblLoginErrorMsg);
    }

    public WebElement getLinkForgotPasswordPage() { return Constant.WEBDRIVER.findElement(linkForgotPasswordPage); }

    //Methods
    public HomePage login(String username, String password)
    {
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
        return new HomePage();
    }

    public HomePage loginSeveralTimes(String username, String password)
    {
        for (int i=0; i<4; i++){
        this.login(username,password);
        }
        return new HomePage();
    }

    public String getLoginErrorMessage(){
        return getLblLoginErrorMsg().getText();
    }

    public void gotoForgotPasswordPage() { this.getLinkForgotPasswordPage().click(); }
}
