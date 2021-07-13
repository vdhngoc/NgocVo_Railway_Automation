package PageObject.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ServerError {

    //Locators
    private final By lblServerErrorMsg = By.xpath("//h1");

    //Elements

    //Methods
    public boolean isServerErrorDisplayed() { return Constant.WEBDRIVER.findElements(lblServerErrorMsg).size() != 0 ; }
}
