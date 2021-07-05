package PageObject.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GeneralPage{

    //Locators
    private final By txt_Reg_Email = By.xpath("//input[@id='email']");
    private final By txt_Reg_Password = By.xpath("//input[@id='password']");
    private final By txt_Reg_ConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private final By txt_Reg_Passport = By.xpath("//input[@id='pid']");
    private final By btnRegister = By.xpath("//input[@value='Register']");
    private final By lblRegisterErrorMsg = By.xpath("//p[@class='message error']");
    private final By lblRegisterSuccessMsg = By.xpath("//div[@id='content']");

    //Elements
    public WebElement getTxt_Reg_Email() { return Constant.WEBDRIVER.findElement(txt_Reg_Email); }

    public WebElement getTxt_Reg_Password() { return Constant.WEBDRIVER.findElement(txt_Reg_Password); }

    public WebElement getTxt_Reg_ConfirmPassword() { return Constant.WEBDRIVER.findElement(txt_Reg_ConfirmPassword); }

    public WebElement getTxt_Reg_Passport() { return Constant.WEBDRIVER.findElement(txt_Reg_Passport); }

    public WebElement getBtnRegister() { return Constant.WEBDRIVER.findElement(btnRegister); }

    public WebElement getLblRegisterErrorMsg() { return Constant.WEBDRIVER.findElement(lblRegisterErrorMsg); }

    public WebElement getLblRegisterSuccessMsg() { return Constant.WEBDRIVER.findElement(lblRegisterSuccessMsg); }

    //Methods
    public void Register (String email, String password, String confirmpassword, String passport)
    {
        this.getTxt_Reg_Email().sendKeys(email);
        this.getTxt_Reg_Password().sendKeys(password);
        this.getTxt_Reg_ConfirmPassword().sendKeys(confirmpassword);
        this.getTxt_Reg_Passport().sendKeys(passport);
        this.getBtnRegister().click();
    }

    public String getRegisterErrorMessage(){ return getLblRegisterErrorMsg().getText(); }

    public String getRegisterSuccessMessage(){
        return getLblRegisterSuccessMsg().getText();
    }
}
