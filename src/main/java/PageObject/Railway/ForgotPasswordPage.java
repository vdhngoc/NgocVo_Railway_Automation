package PageObject.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends GeneralPage{

    //Locators
    private final By txtEmail = By.id("email");
    private final By btnForgotPassword = By.xpath("//input[@type='submit']");

    //Elements
    public WebElement getEmailElement() { return Constant.WEBDRIVER.findElement(txtEmail); }

    public WebElement getForgotPasswordElement() { return Constant.WEBDRIVER.findElement(btnForgotPassword); }

    //Methods
    public void submitEmail (String email)
    {
        this.getEmailElement().sendKeys(email);
        this.getForgotPasswordElement().click();
    }
}
