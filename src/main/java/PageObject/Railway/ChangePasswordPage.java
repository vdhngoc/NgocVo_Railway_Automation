package PageObject.Railway;

import Common.Common.Utilities;
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
    public WebElement getCurrentPasswordElement() { return Utilities.FindElement(txtCurrentPassword); }

    public WebElement getNewPasswordElement() { return Utilities.FindElement(txtNewPassword); }

    public WebElement getConfirmPasswordElement() { return Utilities.FindElement(txtConfirmPassword); }

    public WebElement getChangePasswordElement() { return Utilities.FindElement(btnChangePassword); }

    public WebElement getChangePasswordErrorMsgElement() { return Utilities.FindElement(lblChangePasswordErrorMessage); }

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
