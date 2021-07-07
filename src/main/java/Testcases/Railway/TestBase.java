package Testcases.Railway;

import Common.Common.Utilities;
import PageObject.Railway.HomePage;
import PageObject.Railway.LoginPage;
import PageObject.Railway.RegisterPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Common.Constant.Constant;

public class TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @BeforeClass
    public void beforeClass() {
        System.out.println("Pre-condition");
        System.setProperty("webdriver.chrome.driver", Utilities.Path);
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }
}
