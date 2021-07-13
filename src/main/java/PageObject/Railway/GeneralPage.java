package PageObject.Railway;

import Common.Common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.Constant.Constant;

public class GeneralPage {

    //Locators
    private final By tabLogin = By.xpath("//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//a[@href='/Account/Logout']");
    private final By tabBookTicket = By.xpath("//a[@href='/Page/BookTicketPage.cshtml']");
    private final By tabContact = By.xpath("//a[@href='/Page/Contact.cshtml']");
    private final By tabRegister = By.xpath("//a[@href='/Account/Register.cshtml']");
    private final By tabChangePassword = By.xpath("//a[@href='/Account/ChangePassword.cshtml']");
    private final By tabMyTicket = By.xpath("//a[@href='/Page/ManageTicket.cshtml']");
    private final By tabTimetable = By.xpath("//a[@href='TrainTimeListPage.cshtml']");
    private final By lblWelcomeMsg = By.xpath("//div[@class='account']/strong");

    //Elements
    protected WebElement getLoginElement(){
        return Utilities.FindElement(tabLogin);
    }

    protected WebElement getLogoutElement(){
        return Utilities.FindElement(tabLogout);
    }

    protected WebElement getBookTicketElement() { return Utilities.FindElement(tabBookTicket); }

    protected WebElement getContactElement(){
        return Utilities.FindElement(tabContact);
    }

    protected WebElement getRegisterElement(){
        return Utilities.FindElement(tabRegister);
    }

    protected WebElement getChangePasswordElement(){ return Utilities.FindElement(tabChangePassword); }

    protected WebElement getWelcomeMsgElement(){
        return Utilities.FindElement(lblWelcomeMsg);
    }

    protected WebElement getMyTicketElement(){
        return Utilities.FindElement(tabMyTicket);
    }

    protected WebElement getTimetableElement(){
        return Utilities.FindElement(tabTimetable);
    }

    //Methods
    public String getWelcomeMsg() {
        return this.getWelcomeMsgElement().getText();
    }

    public LoginPage gotoLoginPage() {
        this.getLoginElement().click();
        return new LoginPage();
    }

    public BookTicketPage gotoBookTicketPage() {
        this.getBookTicketElement().click();
        return new BookTicketPage();
    }

    public void gotoContactPage() { this.getContactElement().click(); }

    public RegisterPage gotoRegisterPage() {
        this.getRegisterElement().click();
        return new RegisterPage(); }

    public ChangePasswordPage gotoChangePasswordPage() {
        this.getChangePasswordElement().click();
        return new ChangePasswordPage();

    }

    public TimetablePage gotoTimetablePage(){
        this.getTimetableElement().click();
        return new TimetablePage();
    }

    public MyTicketPage gotoMyTicketPage() {
        this.getMyTicketElement().click();
        return new MyTicketPage();
    }

    public boolean isLogoutExist() { return Constant.WEBDRIVER.findElements(tabLogout).size() != 0 ; }

    public boolean isLogoutTabExist() { return Constant.WEBDRIVER.findElements(tabLogout).size() != 0; }

    public void Logout(){
        if (this.isLogoutTabExist()) {
            this.getLogoutElement().click();
        }
    }

    public boolean isLoginExist(){
        String pageTitle = Constant.WEBDRIVER.getTitle();
        return pageTitle.contains("Safe Railway - Login");
    }
}
