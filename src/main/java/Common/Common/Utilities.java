package Common.Common;

import Common.Constant.Constant;
import org.openqa.selenium.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Random;

public class Utilities {

    public static String GetProjectPath = "src/main/Executables/chromedriver.exe";

    public static String RandomString() {
        String alphabet = "abcdefgijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        int length = 6;
        for(int i = 0; i < length; i++)
        {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String RandomString = sb.toString();
        return RandomString;
    }

    public static void PageDownEnd(){
        Constant.WEBDRIVER.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    public static boolean CheckPageOpened(String pageName){
        if(pageName.equals(Constant.HOME)){
            By lblWelcome = By.xpath("//h1");
            String getLblWelcome = Constant.WEBDRIVER.findElement(lblWelcome).getText();
            return getLblWelcome.contains("Welcome to Safe Railway");
        }
        return Constant.WEBDRIVER.getTitle().contains(pageName);
    }

    public static String SetDepartDate(int date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 4+date);
        dt = c.getTime();
        return dateFormat.format(dt);
    }

    public static void ScrollAndClickIntoView(WebElement element){
        JavascriptExecutor je = (JavascriptExecutor) Constant.WEBDRIVER;
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public static WebElement FindElement(By Locator){
        WebElement element = null;
        try{
            element = Constant.WEBDRIVER.findElement(Locator);
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        catch (StaleElementReferenceException e){
            System.out.println(e.getMessage());
        }
        return  element;
    }
}
