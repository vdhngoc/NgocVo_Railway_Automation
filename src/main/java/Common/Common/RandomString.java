package Common.Common;

import java.util.Random;

public class RandomString {
    public static String RandomString (String Random){

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
        return Random = sb.toString();
    }
}