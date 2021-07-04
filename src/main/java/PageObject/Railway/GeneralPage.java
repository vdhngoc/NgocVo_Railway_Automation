package PageObject.Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Constant.Constant;

public class GeneralPage {

    //Locators
    private final By tabLogin = By.xpath("//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//a[@href='/Account/Logout']");
    private final By tabBookTicket = By.xpath("//a[@href='/Page/BookTicketPage.cshtml']");
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By formBookTicket = By.xpath("//legend['Book ticket form']");

    //Elements
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }

    protected WebElement getLblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }

    protected WebElement getTabBookTicket() { return Constant.WEBDRIVER.findElement(tabBookTicket); }

    //Methods
    public String getWelcomeMessage() {
        return this.getLblWelcomeMessage().getText();
    }

    public LoginPage gotoLoginPage()
    {
        this.getTabLogin().click();
        return new LoginPage();
    }

    public void gotoBookTicketPage() {
        this.getTabBookTicket().click();
    }

    public boolean isLogoutTabExist() {
        return Constant.WEBDRIVER.findElements(tabLogout).size() != 0;
    }

    public void Logout(){
        if (this.isLogoutTabExist()) {
            this.getTabLogout().click();
        }
    }

    public boolean isLoginExist(){
        String pageTitle = Constant.WEBDRIVER.getTitle();
        return pageTitle.contains("Safe Railway - Login");
    }

    public boolean isBookTicketExist(){
        String pageTitle = Constant.WEBDRIVER.getTitle();
        return pageTitle.contains("Safe Railway - Book Ticket");
    }

    public boolean isBookTicketFormExist(){
        return Constant.WEBDRIVER.findElements(formBookTicket).size() != 0;
    }

}
