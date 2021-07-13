package PageObject.Railway;

import Common.Common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TicketPricePage extends GeneralPage {

    //Locators
    private final By cellHS = By.xpath("//table[@class='MyTable MedTable']/tbody/tr[2]/following-sibling::tr/td[1]");
    private final By cellSS = By.xpath("//table[@class='MyTable MedTable']/tbody/tr[2]/following-sibling::tr/td[2]");
    private final By cellSSC = By.xpath("//table[@class='MyTable MedTable']/tbody/tr[2]/following-sibling::tr/td[3]");
    private final By cellHB = By.xpath("//table[@class='MyTable MedTable']/tbody/tr[2]/following-sibling::tr/td[4]");
    private final By cellSB = By.xpath("//table[@class='MyTable MedTable']/tbody/tr[2]/following-sibling::tr/td[5]");
    private final By cellSBC = By.xpath("//table[@class='MyTable MedTable']/tbody/tr[2]/following-sibling::tr/td[6]");

    //Elements
    public WebElement getHSElement() { return Utilities.FindElement(cellHS); }

    public WebElement getSSElement() { return Utilities.FindElement(cellSS); }

    public WebElement getSSCElement() { return Utilities.FindElement(cellSSC); }

    public WebElement getHBElement() { return Utilities.FindElement(cellHB); }

    public WebElement getSBElement() { return Utilities.FindElement(cellSB); }

    public WebElement getSBCElement() { return Utilities.FindElement(cellSBC); }

    //Methods
    public String getHS() { return this.getHSElement().getText(); }

    public String getSS() { return this.getSSElement().getText(); }

    public String getSSC() { return this.getSSCElement().getText(); }

    public String getHB() { return this.getHBElement().getText(); }

    public String getSB() { return this.getSBElement().getText(); }

    public String getSBC() { return this.getSBCElement().getText(); }
}