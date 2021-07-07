package PageObject.Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Constant.Constant;

public class GeneralPage {

    //Locators
    private final By tabLogin = By.xpath("//body//li[8]");
    private final By tabLogout = By.xpath("//body//li[9]");
    private final By tabBookTicket = By.xpath("//body//li[6]");
    private final By tabContact = By.xpath("//body//li[3]");
    private final By tabHome = By.xpath("//body//li[1]");
    private final By tabRegister = By.xpath("//body//li[7}");
    private final By tabChangePassword = By.xpath("//body//li[8]");

    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By formBookTicket = By.xpath("//legend['Book ticket form']");

    //Elements
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }

    protected WebElement getTabBookTicket() { return Constant.WEBDRIVER.findElement(tabBookTicket); }

    protected WebElement getTabContact(){
        return Constant.WEBDRIVER.findElement(tabContact);
    }

    protected WebElement getTabRegister(){
        return Constant.WEBDRIVER.findElement(tabRegister);
    }

    protected WebElement getTabChangePassword(){ return Constant.WEBDRIVER.findElement(tabChangePassword); }

    protected WebElement getLblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }


    //Methods
    public String getWelcomeMessage() {
        return this.getLblWelcomeMessage().getText();
    }

    public void gotoLoginPage() { this.getTabLogin().click(); }

    public void gotoBookTicketPage() {
        this.getTabBookTicket().click();
    }

    public void gotoContactPage() { this.getTabContact().click(); }

    public void gotoRegisterPage() { this.getTabRegister().click(); }

    public void gotoChangePasswordPage() { this.getTabChangePassword().click(); }

    public boolean isLogoutExist() { return Constant.WEBDRIVER.findElements(tabLogout).size() != 0 ; }

    public boolean isHomePageExist() { return Constant.WEBDRIVER.findElements(tabHome).size() != 0 ; }

    public boolean isLogoutTabExist() { return Constant.WEBDRIVER.findElements(tabLogout).size() != 0; }

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
