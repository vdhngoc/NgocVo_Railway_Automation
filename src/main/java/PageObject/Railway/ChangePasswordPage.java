package PageObject.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends GeneralPage{

    //Locators
    private final By txtCurrentPassword = By.xpath("//input[@id='currentPassword']");
    private final By txtNewPassword = By.xpath("//input[@id='newPassword']");
    private final By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private final By btnChangePassword = By.xpath("//input[@value='Change Password']");
    private final By lblChangePasswordErrorMessage = By.xpath("//p[@class='message error']");

    //Elements
    public WebElement getTxtCurrentPassword() { return Constant.WEBDRIVER.findElement(txtCurrentPassword); }

    public WebElement getNewPassword() { return Constant.WEBDRIVER.findElement(txtNewPassword); }

    public WebElement getConfirmPassword() { return Constant.WEBDRIVER.findElement(txtConfirmPassword); }

    public WebElement getBtnChangePassword() { return Constant.WEBDRIVER.findElement(btnChangePassword); }

    public WebElement getLblChangePasswordErrorMessage() { return Constant.WEBDRIVER.findElement(lblChangePasswordErrorMessage); }

    //Methods
    public void changePassword (String currentpassword, String newpassword, String confirmpassword)
    {
        this. getTxtCurrentPassword().sendKeys(currentpassword);
        this.getNewPassword().sendKeys(newpassword);
        this.getConfirmPassword().sendKeys(confirmpassword);
        this.getBtnChangePassword().click();
    }

    public String getChangePasswordErrorMessage() { return getLblChangePasswordErrorMessage().getText() ;}

}
