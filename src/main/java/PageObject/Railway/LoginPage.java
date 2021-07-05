package PageObject.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage{

    //Locators
    private final By txtUsername = By.xpath("//input[@id='username']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By btnLogin = By.xpath("//input[@value='Login']");
    private final By lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm']");

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

    //Methods
    public void login(String username, String password)
    {
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
    }

    public void loginSeveralTimes(String username, String password)
    {
        for (int i=0; i<4; i++){
<<<<<<< HEAD
        this.login(username,password);
=======
        this.login(username, password);
>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d
        }
    }

    public String getLoginErrorMessage(){
        return getLblLoginErrorMsg().getText();
    }
}
