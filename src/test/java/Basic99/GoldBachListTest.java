package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;


/**
 * Created by root on 12/10/15.
 */
public class GoldBachListTest {

    GoldBachList list = new GoldBachList();

    @Test
    public void testGetGoldBachList() throws Exception {
        HashMap<Integer,int[]> map = new HashMap<Integer, int[]>();
        map.put(16, new int[]{13, 3});
        map.put(18,new int[]{17, 1});
        map.put(10, new int[]{7, 3});
        map.put(12, new int[]{11, 1});
        map.put(14, new int[]{13, 1});

        HashMap<Integer,int[]> map1 = new HashMap<Integer, int[]>();
        map1.put(16, new int[]{13, 3});
        map1.put(18,new int[]{13, 5});
        map1.put(10, new int[]{7, 3});
      map1.put(12, new int[]{7, 5});
        map1.put(14, new int[]{11, 3});

Assert.assertEquals(list.getGoldBachList(9, 20), map);
 Assert.assertEquals(list.getGoldBachList(9,20,2) , map1);
    }
}