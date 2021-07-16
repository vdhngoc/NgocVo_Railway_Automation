package PageObject.Railway;

import Common.Common.Utilities;
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
    public WebElement getRegisterEmailElement() { return Utilities.FindElement(txtRegisterEmail); }

    public WebElement getRegisterPasswordElement() { return Utilities.FindElement(txtRegisterPassword); }

    public WebElement getRegisterConfirmPasswordElement() { return Utilities.FindElement(txtRegisterConfirmPassword); }

    public WebElement getRegisterPassportElement() { return Utilities.FindElement(txtRegisterPassport); }

    public WebElement getRegisterElement() { return Utilities.FindElement(btnRegister); }

    public WebElement getRegisterErrorMsgElement() { return Utilities.FindElement(lblRegisterErrorMsg); }

    public WebElement getRegisterSuccessMsgElement() { return Utilities.FindElement(lblRegisterSuccessMsg); }

    public WebElement getRegisterInvalidPasswordMsgElement() { return Utilities.FindElement(lblRegisterInvalidPasswordMsg); }

    public WebElement getRegisterInvalidPassportMsgElement() { return Utilities.FindElement(lblRegisterInvalidPassportMsg); }

    //Methods
    public RegisterPage register (String email, String password, String confirmpassword, String passport)
    {
        this.getRegisterEmailElement().sendKeys(email);
        this.getRegisterPasswordElement().sendKeys(password);
        this.getRegisterConfirmPasswordElement().sendKeys(confirmpassword);
        this.getRegisterPassportElement().sendKeys(passport);
        Utilities.PageDownEnd();
        this.getRegisterElement().click();
        return new RegisterPage();
    }

    public String getRegisterErrorMessage() { return getRegisterErrorMsgElement().getText(); }

    public String getRegisterSuccessMessage(){
        return getRegisterSuccessMsgElement().getText();
    }

    public String getRegisterInvalidPasswordMsg() { return getRegisterInvalidPasswordMsgElement().getText(); }

    public String getRegisterInvalidPassportMsg() { return getRegisterInvalidPassportMsgElement().getText(); }
}
