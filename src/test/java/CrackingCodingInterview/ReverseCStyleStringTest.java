package CrackingCodingInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/14/15.
 */
public class ReverseCStyleStringTest {

    ReverseCStyleString s = new ReverseCStyleString();

    @Test
    public void testReverse() throws Exception {
        Assert.assertEquals(s.reverse("malayalam ") , "malayalam ");
        Assert.assertEquals(s.reverse("swathi ") , "ihtaws ");
        Assert.assertEquals(s.reverse("m ") , "m ");
        Assert.assertEquals(s.reverse("") , "");
        Assert.assertEquals(s.reverse(" ") , " ");

        char[] str = new char[5];
        str[0] = 's';
        str[1] = 'w';
        str[2] = 'a';
        str[3] ='t';
        str[4] = 0;

        String st = String.valueOf(str);

        char[] str1 = new char[5];
        str1[0] = 't';
        str1[1] = 'a';
        str1[2] = 'w';
        str1[3] ='s';
        str1[4] = 0;

        String ts = String.valueOf(str1);
        Assert.assertEquals(this.s.reverse(st) , ts);
        System.out.println(str[4]);
    }
}