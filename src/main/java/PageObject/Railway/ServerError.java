package PageObject.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ServerError {

    //Locators
    private final By lblServerErrorMsg = By.xpath("//h1");

    //Elements
    public WebElement getServerErrorMsgElement() { return Constant.WEBDRIVER.findElement(lblServerErrorMsg); }

    //Methods
    public String getServerErrorMsg() { return getServerErrorMsgElement().getText(); }

    public boolean isServerErrorDisplayed() { return Constant.WEBDRIVER.findElements(lblServerErrorMsg).size() != 0 ; }
}
