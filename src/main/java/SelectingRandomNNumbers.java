import java.util.Random;

/**
 * Created by swathi on 11/23/2015.
 */
public class SelectingRandomNNumbers {

    public String selectNRandomNumbers(String str, int number) {

        StringBuilder sb = new StringBuilder();
        Random randomGenerator = new Random();

        for (int i = 0; i < number; i++) {
            sb.append(str.charAt(randomGenerator.nextInt(str.length())));

        }
     return sb.toString();
    }
}
