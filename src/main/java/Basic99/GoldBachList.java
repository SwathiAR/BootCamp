package Basic99;

import java.util.HashMap;

/**
 * Created by root on 12/10/15.
 */
public class GoldBachList {
    GoldBachPair pair = new GoldBachPair();

    public HashMap<Integer, int[]> getGoldBachList(int low, int high) {
        HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
        int start = low % 2 == 0 ? low + 2 : low + 1;
        for (int i = start; i < high; i += 2) {
            map.put(i, pair.getGoldBachPair(i));
        }
     return map;
    }

    public HashMap<Integer, int[]> getGoldBachList(int low, int high , int min){
        HashMap<Integer , int[]> map = new HashMap<Integer, int[]>();
        int start = low%2==0?low+2:low+1;
        for(int i = start ; i<high ; i+=2){
            map.put(i, pair.getBigGoldBachPair(i , min));
        }
        return map;

    }
}
