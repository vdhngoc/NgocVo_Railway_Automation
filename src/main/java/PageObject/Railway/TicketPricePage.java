package PageObject.Railway;

import Common.Constant.Constant;
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
    public WebElement getCellHS() { return Constant.WEBDRIVER.findElement(cellHS); }

    public WebElement getCellSS() { return Constant.WEBDRIVER.findElement(cellSS); }

    public WebElement getCellSSC() { return Constant.WEBDRIVER.findElement(cellSSC); }

    public WebElement getCellHB() { return Constant.WEBDRIVER.findElement(cellHB); }

    public WebElement getCellSB() { return Constant.WEBDRIVER.findElement(cellSB); }

    public WebElement getCellSBC() { return Constant.WEBDRIVER.findElement(cellSBC); }

    //Methods
    public String getHS() { return this.getCellHS().getText(); }

    public String getSS() { return this.getCellSS().getText(); }

    public String getSSC() { return this.getCellSSC().getText(); }

    public String getHB() { return this.getCellHB().getText(); }

    public String getSB() { return this.getCellSB().getText(); }

    public String getSBC() { return this.getCellSBC().getText(); }
}