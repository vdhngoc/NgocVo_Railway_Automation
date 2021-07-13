package PageObject.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends GeneralPage{

    //Locators
    private final By txtCurrentPassword = By.id("currentPassword");
    private final By txtNewPassword = By.id("newPassword");
    private final By txtConfirmPassword = By.id("confirmPassword");
    private final By btnChangePassword = By.xpath("//input[@value='Change Password']");
    private final By lblChangePasswordErrorMessage = By.xpath("//p[@class='message error']");

    //Elements
    public WebElement getCurrentPasswordElement() { return Constant.WEBDRIVER.findElement(txtCurrentPassword); }

    public WebElement getNewPasswordElement() { return Constant.WEBDRIVER.findElement(txtNewPassword); }

    public WebElement getConfirmPasswordElement() { return Constant.WEBDRIVER.findElement(txtConfirmPassword); }

    public WebElement getChangePasswordElement() { return Constant.WEBDRIVER.findElement(btnChangePassword); }

    public WebElement getChangePasswordErrorMsgElement() { return Constant.WEBDRIVER.findElement(lblChangePasswordErrorMessage); }

    //Methods
    public void changePassword (String currentpassword, String newpassword, String confirmpassword)
    {
        this.getCurrentPasswordElement().sendKeys(currentpassword);
        this.getNewPasswordElement().sendKeys(newpassword);
        this.getConfirmPasswordElement().sendKeys(confirmpassword);
        this.getChangePasswordElement().click();
    }

    public String getChangePasswordErrorMsg() { return getChangePasswordErrorMsgElement().getText() ;}

}
