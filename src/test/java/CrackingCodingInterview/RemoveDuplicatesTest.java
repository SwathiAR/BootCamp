package CrackingCodingInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/14/15.
 */
public class RemoveDuplicatesTest {
    RemoveDuplicates r = new RemoveDuplicates();

    @Test
    public void testRemoveDuplicates(){


        char[] chars = new char[]{'a' , 'b' , 'b' , 'c'};
        char[] chars2 = new char[]{'a' , 'b' , 'c' , 0};

        char[] chars1 = new char[]{'a' , 'a' , 'a' , 'a'};
        char[] chars11 = new char[]{'a' , 0 , 0 , 0};

        char[] chars3 = new char[]{'a' , 'a' , 'a' , 'b' , 'b' , 'b'};
        char[] chars33 = new char[]{'a' , 'b' , 0 , 0 , 0 , 0};

        char[] chars4 = new char[]{'a' , 'b' , 'a' , 'b' , 'a' , 'b' ,'a'};
        char[] chars44 = new char[]{'a' , 'b' , 0 , 0 , 0 , 0 , 0};




        Assert.assertEquals(String.valueOf(r.removeDuplicates2(chars)), String.valueOf(chars2));
        Assert.assertEquals(null, r.removeDuplicates2(null));
        Assert.assertEquals(String.valueOf(r.removeDuplicates2(chars1)) , String.valueOf(chars11));
        Assert.assertEquals(String.valueOf(r.removeDuplicates2(chars3)) , String.valueOf(chars33));
        Assert.assertEquals(String.valueOf(r.removeDuplicates2(chars4)) , String.valueOf(chars44));


    }

    @Test
    public void testRemoveDuplicates3() throws Exception {

        char[] chars = new char[]{'a' , 'b' , 'b' , 'c'};
        char[] chars2 = new char[]{'a' , 'b' , 'c' , 0};

        char[] chars1 = new char[]{'a' , 'a' , 'a' , 'a'};
        char[] chars11 = new char[]{'a' , 0 , 0 , 0};

        char[] chars3 = new char[]{'a' , 'a' , 'a' , 'b' , 'b' , 'b'};
        char[] chars33 = new char[]{'a' , 'b' , 0 , 0 , 0 , 0};

        char[] chars4 = new char[]{'a' , 'b' , 'a' , 'b' , 'a' , 'b' ,'a'};
        char[] chars44 = new char[]{'a' , 'b' , 0 , 0 , 0 , 0 , 0};




        Assert.assertEquals(String.valueOf(r.removeDuplicates3(chars)), String.valueOf(chars2));
        Assert.assertEquals(null, r.removeDuplicates2(null));
        Assert.assertEquals(String.valueOf(r.removeDuplicates3(chars1)) , String.valueOf(chars11));
        Assert.assertEquals(String.valueOf(r.removeDuplicates3(chars3)) , String.valueOf(chars33));
        Assert.assertEquals(String.valueOf(r.removeDuplicates3(chars4)), String.valueOf(chars44));


    }

    @Test
    public void testRemoveDuplicates4() throws Exception {

        char[] chars = new char[]{'a' , 'b' , 'b' , 'c'};
        char[] chars2 = new char[]{'a' , 'b' , 'c' , 0};

        char[] chars1 = new char[]{'a' , 'a' , 'a' , 'a'};
        char[] chars11 = new char[]{'a' , 0 , 0 , 0};

        char[] chars3 = new char[]{'a' , 'a' , 'a' , 'b' , 'b' , 'b'};
        char[] chars33 = new char[]{'a' , 'b' , 0 , 0 , 0 , 0};

        char[] chars4 = new char[]{'a' , 'b' , 'a' , 'b' , 'a' , 'b' ,'a'};
        char[] chars44 = new char[]{'a' , 'b' , 0 , 0 , 0 , 0 , 0};




        Assert.assertEquals(String.valueOf(r.removeDuplicates4(chars)), String.valueOf(chars2));
        Assert.assertEquals(null, r.removeDuplicates2(null));
        Assert.assertEquals(String.valueOf(r.removeDuplicates4(chars1)) , String.valueOf(chars11));
        Assert.assertEquals(String.valueOf(r.removeDuplicates4(chars3)) , String.valueOf(chars33));
        Assert.assertEquals(String.valueOf(r.removeDuplicates4(chars4)), String.valueOf(chars44));


    }
}