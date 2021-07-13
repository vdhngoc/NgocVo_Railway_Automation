package PageObject.Railway;

import Common.Common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends GeneralPage{

    //Locators
    private final By txtEmail = By.id("email");
    private final By btnForgotPassword = By.xpath("//input[@type='submit']");

    //Elements
    public WebElement getEmailElement() { return Utilities.FindElement(txtEmail); }

    public WebElement getForgotPasswordElement() { return Utilities.FindElement(btnForgotPassword); }

    //Methods
    public void submitEmail (String email)
    {
        this.getEmailElement().sendKeys(email);
        this.getForgotPasswordElement().click();
    }
}
