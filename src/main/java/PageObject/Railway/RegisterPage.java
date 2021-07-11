package PageObject.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GeneralPage{

    //Locators
    private final By txtRegEmail = By.xpath("//input[@id='email']");
    private final By txtRegPassword = By.xpath("//input[@id='password']");
    private final By txtRegConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private final By txtRegPassport = By.xpath("//input[@id='pid']");
    private final By btnRegister = By.xpath("//input[@value='Register']");
    private final By lblRegErrorMsg = By.xpath("//div[@id='page']//p[@class='message error']");
    private final By lblRegSuccessMsg = By.xpath("//div[@id='content']");
    private final By lblRegInvalidPasswordMsg = By.xpath("//label[@for='password'] [@class='validation-error']");
    private final By lblRegInvalidPassportMsg = By.xpath("//label[@for='pid'] [@class='validation-error']");

    //Elements
    public WebElement getTxtRegEmail() { return Constant.WEBDRIVER.findElement(txtRegEmail); }

    public WebElement getTxtRegPassword() { return Constant.WEBDRIVER.findElement(txtRegPassword); }

    public WebElement getTxtRegConfirmPassword() { return Constant.WEBDRIVER.findElement(txtRegConfirmPassword); }

    public WebElement getTxtRegPassport() { return Constant.WEBDRIVER.findElement(txtRegPassport); }

    public WebElement getBtnRegister() { return Constant.WEBDRIVER.findElement(btnRegister); }

    public WebElement getLblRegErrorMsg() { return Constant.WEBDRIVER.findElement(lblRegErrorMsg); }

    public WebElement getLblRegSuccessMsg() { return Constant.WEBDRIVER.findElement(lblRegSuccessMsg); }

    public WebElement getLblRegInvalidPasswordMsg() { return Constant.WEBDRIVER.findElement(lblRegInvalidPasswordMsg); }

    public WebElement getLblRegInvalidPassportMsg() { return Constant.WEBDRIVER.findElement(lblRegInvalidPassportMsg); }

    //Methods
    public void register (String email, String password, String confirmpassword, String passport)
    {
        Utilities.PageDownEnd();
        this.getTxtRegEmail().sendKeys(email);
        this.getTxtRegPassword().sendKeys(password);
        this.getTxtRegConfirmPassword().sendKeys(confirmpassword);
        this.getTxtRegPassport().sendKeys(passport);
        this.getBtnRegister().click();
    }

    public String getRegErrorMessage() { return getLblRegErrorMsg().getText(); }

    public String getRegSuccessMessage(){
        return getLblRegSuccessMsg().getText();
    }

    public String getRegInvalidPasswordMsg() { return getLblRegInvalidPasswordMsg().getText(); }

    public String getRegInvalidPassportMsg() { return getLblRegInvalidPassportMsg().getText(); }
}
