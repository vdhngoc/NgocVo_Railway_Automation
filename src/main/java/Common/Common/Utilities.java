package Common.Common;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ConcurrentModificationException;
import java.util.Random;

public class Utilities {

    public static String Path = "src/main/Executables/chromedriver.exe";

    public static String RandomString() {

        String alphabet = "abcdefgijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        int length = 5;
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
}
