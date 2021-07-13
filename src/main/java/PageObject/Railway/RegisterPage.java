package PageObject.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GeneralPage{

    //Locators
    private final By txtRegisterEmail = By.id("email");
    private final By txtRegisterPassword = By.id("password");
    private final By txtRegisterConfirmPassword = By.id("confirmPassword");
    private final By txtRegisterPassport = By.id("pid");
    private final By btnRegister = By.xpath("//input[@value='Register']");
    private final By lblRegisterErrorMsg = By.xpath("//div[@id='page']//p[@class='message error']");
    private final By lblRegisterSuccessMsg = By.id("content");
    private final By lblRegisterInvalidPasswordMsg = By.xpath("//label[@for='password'] [@class='validation-error']");
    private final By lblRegisterInvalidPassportMsg = By.xpath("//label[@for='pid'] [@class='validation-error']");

    //Elements
    public WebElement getRegisterEmailElement() { return Constant.WEBDRIVER.findElement(txtRegisterEmail); }

    public WebElement getRegisterPasswordElement() { return Constant.WEBDRIVER.findElement(txtRegisterPassword); }

    public WebElement getRegisterConfirmPasswordElement() { return Constant.WEBDRIVER.findElement(txtRegisterConfirmPassword); }

    public WebElement getRegisterPassportElement() { return Constant.WEBDRIVER.findElement(txtRegisterPassport); }

    public WebElement getRegisterElement() { return Constant.WEBDRIVER.findElement(btnRegister); }

    public WebElement getRegisterErrorMsgElement() { return Constant.WEBDRIVER.findElement(lblRegisterErrorMsg); }

    public WebElement getRegisterSuccessMsgElement() { return Constant.WEBDRIVER.findElement(lblRegisterSuccessMsg); }

    public WebElement getRegisterInvalidPasswordMsgElement() { return Constant.WEBDRIVER.findElement(lblRegisterInvalidPasswordMsg); }

    public WebElement getRegisterInvalidPassportMsgElement() { return Constant.WEBDRIVER.findElement(lblRegisterInvalidPassportMsg); }

    //Methods
    public void register (String email, String password, String confirmpassword, String passport)
    {
        Utilities.PageDownEnd();
        this.getRegisterEmailElement().sendKeys(email);
        this.getRegisterPasswordElement().sendKeys(password);
        this.getRegisterConfirmPasswordElement().sendKeys(confirmpassword);
        this.getRegisterPassportElement().sendKeys(passport);
        this.getRegisterElement().click();
    }

    public String getRegisterErrorMessage() { return getRegisterErrorMsgElement().getText(); }

    public String getRegisterSuccessMessage(){
        return getRegisterSuccessMsgElement().getText();
    }

    public String getRegisterInvalidPasswordMsg() { return getRegisterInvalidPasswordMsgElement().getText(); }

    public String getRegisterInvalidPassportMsg() { return getRegisterInvalidPassportMsgElement().getText(); }
}
