package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/11/15.
 */
public class MorseCodeTest {

    MorseCode m = new MorseCode();

    @Test
    public void testGetMorse() throws Exception {
        Assert.assertEquals(m.getMorse("I never saw a purple cow") , ".. / -. . ...- . .-. / ... .- .-- / .- / .--. ..- .-. .--. .-.. . / -.-. --- .-- ");
    }
}