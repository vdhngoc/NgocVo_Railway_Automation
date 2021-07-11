package Common.Common;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
            By lblWelcome = By.cssSelector("h1");
            String getLblWelcome = Constant.WEBDRIVER.findElement(lblWelcome).getText();
            return getLblWelcome.contains("Welcome to safe Railway");
        }
        return Constant.WEBDRIVER.getTitle().contains(pageName);
    }

    public static String SetDepartDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE,Constant.NUMBER_OF_DATE);
        dt = c.getTime();
        return dateFormat.format(dt);
    }
}
