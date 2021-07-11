package PageObject.Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Constant.Constant;

public class GeneralPage {

    //Locators
    private final By tabLogin = By.xpath("//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//a[@href='/Account/Logout']");
    private final By tabBookTicket = By.xpath("//a[@href='/Page/BookTicketPage.cshtml']");
    private final By tabContact = By.xpath("//a[@href='/Page/Contact.cshtml']");
    private final By tabHome = By.xpath("//a[@href='../']");
    private final By tabRegister = By.xpath("//a[@href='/Account/Register.cshtml']");
    private final By tabChangePassword = By.xpath("//a[@href='/Account/ChangePassword.cshtml']");
    private final By tabMyTicket = By.xpath("//a[@href='/Page/ManageTicket.cshtml']");
    private final By tabTimetable = By.xpath("//a[@href='TrainTimeListPage.cshtml']");

    private final By lblWelcomeMsg = By.xpath("//div[@class='account']/strong");

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

    protected WebElement getLblWelcomeMsg(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMsg);
    }

    protected WebElement getTabMyTicket(){
        return Constant.WEBDRIVER.findElement(tabMyTicket);
    }

    protected WebElement getTabTimetable(){
        return Constant.WEBDRIVER.findElement(tabTimetable);
    }


    //Methods
    public String getWelcomeMsg() {
        return this.getLblWelcomeMsg().getText();
    }

    public LoginPage gotoLoginPage() {
        this.getTabLogin().click();
        return new LoginPage();
    }

    public BookTicketPage gotoBookTicketPage() {
        this.getTabBookTicket().click();
        return new BookTicketPage();
    }

    public void gotoContactPage() { this.getTabContact().click(); }

    public RegisterPage gotoRegisterPage() {
        this.getTabRegister().click();
        return new RegisterPage(); }

    public ChangePasswordPage gotoChangePasswordPage() {
        this.getTabChangePassword().click();
        return new ChangePasswordPage();

    }

    public TimetablePage gotoTimetablePage(){
        this.getTabTimetable().click();
        return new TimetablePage();
    }

    public MyTicketPage gotoMyTicketPage() {
        this.getTabMyTicket().click();
        return new MyTicketPage();
    }

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
}
