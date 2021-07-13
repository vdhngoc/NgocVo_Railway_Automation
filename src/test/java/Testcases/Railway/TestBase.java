package Testcases.Railway;

import Common.Common.Utilities;
import PageObject.Railway.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Common.Constant.Constant;

public class TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    ServerError serverError = new ServerError();

    @BeforeClass
    public void beforeClass() {
        System.out.println("Pre-condition");
        System.setProperty("webdriver.chrome.driver", Utilities.GetProjectPath);
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }
}
