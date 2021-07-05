package PageObject.Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Constant.Constant;

public class GeneralPage {

    //Locators
    private final By tabLogin = By.xpath("//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//a[@href='/Account/Logout']");
    private final By tabBookTicket = By.xpath("//a[@href='/Page/BookTicketPage.cshtml']");
<<<<<<< HEAD
    private final By tabContact = By.xpath("//a[@href='/Page/Contact.cshtml']");
    private final By tabHome = By.xpath("//a[@href='../']");
    private final By tabRegister = By.xpath("//a[@href='/Account/Register.cshtml']");

    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By formBookTicket = By.xpath("//legend['Book ticket form']");


=======
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By formBookTicket = By.xpath("//legend['Book ticket form']");

>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d
    //Elements
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }

<<<<<<< HEAD
    protected WebElement getTabBookTicket() { return Constant.WEBDRIVER.findElement(tabBookTicket); }

    protected WebElement getTabContact(){
        return Constant.WEBDRIVER.findElement(tabContact);
    }

    protected WebElement getTabRegister(){
        return Constant.WEBDRIVER.findElement(tabRegister);
    }

=======
>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d
    protected WebElement getLblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }

<<<<<<< HEAD
=======
    protected WebElement getTabBookTicket() { return Constant.WEBDRIVER.findElement(tabBookTicket); }
>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d

    //Methods
    public String getWelcomeMessage() {
        return this.getLblWelcomeMessage().getText();
    }

<<<<<<< HEAD
    public void gotoLoginPage() { this.getTabLogin().click(); }
=======
    public LoginPage gotoLoginPage()
    {
        this.getTabLogin().click();
        return new LoginPage();
    }
>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d

    public void gotoBookTicketPage() {
        this.getTabBookTicket().click();
    }

<<<<<<< HEAD
    public void gotoContactPage() { this.getTabContact().click(); }

    public void gotoRegisterPage() { this.getTabRegister().click(); }

    public boolean isLogoutExist() { return Constant.WEBDRIVER.findElements(tabLogout).size() != 0 ; }

    public boolean isHomePageExist() { return Constant.WEBDRIVER.findElements(tabHome).size() != 0 ; }

    public void Logout(){
        if (this.isLogoutExist()) {
=======
    public boolean isLogoutTabExist() {
        return Constant.WEBDRIVER.findElements(tabLogout).size() != 0;
    }

    public void Logout(){
        if (this.isLogoutTabExist()) {
>>>>>>> 0a2f65b3464f80b2d9456dc90646a0083649da9d
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
